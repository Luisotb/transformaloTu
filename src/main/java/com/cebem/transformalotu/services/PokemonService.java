package com.cebem.transformalotu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

class Pokemon{
    public int weight;
}

@Service
public class PokemonService {
    @Autowired
    RestTemplate restTemplate;

    public int getPeso(String nombrePokemon){
        String url = "https://pokeapi.co/api/v2/pokemon/"+nombrePokemon;
        Pokemon json = restTemplate.getForObject(url, Pokemon.class );
        return json.weight;
    }
}
