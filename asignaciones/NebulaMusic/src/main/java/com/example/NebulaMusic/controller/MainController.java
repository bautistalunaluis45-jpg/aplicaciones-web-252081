package com.example.NebulaMusic.controller;

import com.example.NebulaMusic.model.Usuario;
import com.example.NebulaMusic.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private final UsuarioService usuarioService;

    public MainController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping({"/index", "/index.html"})
    public String index() {
        return "index";
    }

    @GetMapping({"/", "/iniciar-sesion", "/iniciar-sesion.html",})
    public String iniciarSesion() {
        return "iniciar-sesion";
    }

    @GetMapping({"/registro", "/registro.html",})
    public String registro() {
        return "registro";
    }

    @GetMapping({"/error", "/error.html",})
    public String error() {
        return "error";
    }

    @PostMapping("/crear-cuenta")
    public String crearCuenta(@ModelAttribute Usuario usuario){
        if(usuarioService.existeCorreo(usuario.getEmail())) {
            return "error";
        }

        usuarioService.registrar(usuario);

        return "redirect:/iniciar-sesion";
    }


    @PostMapping("/autenticacion")
    public String autenticacion(@RequestParam("email") String email,
                                @RequestParam("password") String password) {

        if(usuarioService.autenticar(email, password)) {
            return "redirect:/index";
        }

        return "redirect:/iniciar-sesion?error";
    }


    @GetMapping("/cerrar-sesion")
    public String cerrarSesion(){
        return "redirect:/iniciar-sesion?logout";
    }

}

