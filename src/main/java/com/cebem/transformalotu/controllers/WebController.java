package com.cebem.transformalotu.controllers;

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

    
    /** Este método sirve para poder consultar el peso de un pokemon usando el api de pokeapi.co */
    @RequestMapping("/peso/{nombrePokemon}")
    public String peso(@PathVariable String nombrePokemon, Model modelo) {
        int peso = pokemonService.getPeso(nombrePokemon) / 10;
        String foto = pokemonService.getFoto(nombrePokemon);
        modelo.addAttribute("nombre", nombrePokemon);
        modelo.addAttribute("peso", peso);
        modelo.addAttribute("foto", foto);
        return "pokemon";
    }

    @RequestMapping("/formularioGatito")
    public String formularioGatito() {
        return "formularioInsercionGatito";
    }

}
