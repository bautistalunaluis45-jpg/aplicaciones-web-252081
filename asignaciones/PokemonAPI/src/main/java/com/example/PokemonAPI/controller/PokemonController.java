package com.example.PokemonAPI.controller;

import com.example.PokemonAPI.model.Pokemon;
import com.example.PokemonAPI.service.PokemonService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pokemones")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping()
    public List<Pokemon> obtenerTodos(){
        return pokemonService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Pokemon obtenerPorId(@PathVariable Long id){
        return pokemonService.obtenerPorId(id);
    }

    @PostMapping
    public Pokemon crearPokemon(@Valid @RequestBody Pokemon pokemon) {
        return pokemonService.crearPokemon(pokemon);
    }

    @PutMapping("/{id}")
    public Pokemon editar(@PathVariable Long id, @Valid @RequestBody Pokemon pokemon){
        return pokemonService.actualizarPokemonCompleto(id, pokemon);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        pokemonService.eliminarPokemon(id);
    }

}
