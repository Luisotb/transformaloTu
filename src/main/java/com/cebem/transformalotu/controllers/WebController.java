package com.cebem.transformalotu.controllers;

import com.cebem.transformalotu.services.PokemonBDService;
import com.cebem.transformalotu.services.PokemonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @Autowired
    PokemonService pokemonService;

    @Autowired
    PokemonBDService pokemonBDService;

    @RequestMapping("/peso/{nombrePokemon}")
    public String peso(@PathVariable String nombrePokemon, 
                    Model modelo){
        int peso = pokemonService.getPeso(nombrePokemon) / 10;
        String foto = pokemonService.getFoto(nombrePokemon);
        modelo.addAttribute("nombre", nombrePokemon);
        modelo.addAttribute("peso", peso);
        modelo.addAttribute("foto", foto);
        return "pokemon";
    }

    @RequestMapping("/pokemons")
    public String pokemons(){
        return pokemonBDService.obtenerTodosLosPokemons().toString();
    }
}
