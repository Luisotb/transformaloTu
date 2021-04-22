package com.cebem.transformalotu.controllers;

import com.cebem.transformalotu.services.PokemonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @Autowired
    PokemonService pokemonService;

    @RequestMapping("/peso/{nombrePokemon}")
    public String peso(@PathVariable String nombrePokemon){
        int peso = pokemonService.getPeso(nombrePokemon);
        String msg = "<h1>peso del pokemon</h1>";
        msg+="El pokemon "+nombrePokemon+" pesa "+peso;
        msg+="<img src=''/>";
        return msg;
    }
}
