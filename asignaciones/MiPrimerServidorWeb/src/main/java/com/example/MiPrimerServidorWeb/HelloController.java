package com.example.MiPrimerServidorWeb;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {



    @GetMapping("/hello")
    public String hello() {
        return "Hola desde mi controlador springboot";
    }

    @GetMapping("/saludo")
    public String saludar(@RequestParam String nombre) {
        return "Hola " + nombre + ". Este es mi servidor de aplicacion";
    }


    @PostMapping("/mensaje")
    public String recibirMensaje(@RequestBody String mensaje){
        return "Recibi tu mensaje " + mensaje;
    }
}