package com.cebem.transformalotu.services;

import java.util.ArrayList;

import com.cebem.transformalotu.models.PokemonModel;
import com.cebem.transformalotu.repositories.PokemonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonBDService {
    @Autowired
    PokemonRepository pokemonRepository;

    public ArrayList<PokemonModel> obtenerTodosLosPokemons(){
        return (ArrayList<PokemonModel>) pokemonRepository.findAll();
    }
}
