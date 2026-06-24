package com.example.PokemonAPI.service;

import com.example.PokemonAPI.model.Pokemon;
import com.example.PokemonAPI.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {
    @Autowired
    private PokemonRepository repository;

    public List<Pokemon> obtenerTodos(){
        return repository.findAll();
    }

    public Pokemon obtenerPorId(Long id){
        return repository.findById(id).orElse(null);
    }

    public Pokemon crearPokemon(Pokemon pokemon){
        return repository.save(pokemon);
    }

    public Pokemon actualizarPokemonCompleto(Long id, Pokemon pokemonActualizado) {
        return repository.findById(id).map(pokemon -> {
            pokemon.setNombre(pokemonActualizado.getNombre());
            pokemon.setTipo(pokemonActualizado.getTipo());
            pokemon.setNivel(pokemonActualizado.getNivel());
            pokemon.setAtaque(pokemonActualizado.getAtaque());
            pokemon.setDefensa(pokemonActualizado.getDefensa());
            pokemon.setDescripcion(pokemonActualizado.getDescripcion());
            pokemon.setImagenUrl(pokemonActualizado.getImagenUrl());
            return repository.save(pokemon);
        }).orElse(null);
    }

    public Pokemon actualizarPokemonParcial(Long id, Pokemon pokemonParcial) {
        return repository.findById(id).map(pokemon -> {
            if (pokemonParcial.getNombre() != null) pokemon.setNombre(pokemonParcial.getNombre());
            if (pokemonParcial.getTipo() != null) pokemon.setTipo(pokemonParcial.getTipo());
            if (pokemonParcial.getNivel() != null) pokemon.setNivel(pokemonParcial.getNivel());
            if (pokemonParcial.getAtaque() != null) pokemon.setAtaque(pokemonParcial.getAtaque());
            if (pokemonParcial.getDefensa() != null) pokemon.setDefensa(pokemonParcial.getDefensa());
            if (pokemonParcial.getDescripcion() != null) pokemon.setDescripcion(pokemonParcial.getDescripcion());
            if (pokemonParcial.getImagenUrl() != null) pokemon.setImagenUrl(pokemonParcial.getImagenUrl());

            return repository.save(pokemon);
        }).orElse(null);
    }

    public void eliminarPokemon(Long id){
        repository.deleteById(id);
    }



}
