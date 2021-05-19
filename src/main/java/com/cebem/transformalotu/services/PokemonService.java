package com.cebem.transformalotu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

class Sprite {
    public String front_shiny;
}

class Pokemon {
    public int weight;
    public Sprite sprites;
}

@Service
public class PokemonService {
    @Autowired
    RestTemplate restTemplate;

    public int getPeso(String nombrePokemon) {
        String url = "https://pokeapi.co/api/v2/pokemon/" + nombrePokemon;
        Pokemon json = restTemplate.getForObject(url, Pokemon.class); // 0.5
        return json.weight;
    }

    public String getFoto(String nombrePokemon) {
        String url = "https://pokeapi.co/api/v2/pokemon/" + nombrePokemon;
        Pokemon json = restTemplate.getForObject(url, Pokemon.class); // 0.5
        return json.sprites.front_shiny;
    }

}
