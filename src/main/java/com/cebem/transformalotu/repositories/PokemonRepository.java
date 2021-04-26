package com.cebem.transformalotu.repositories;

import java.util.ArrayList;

import com.cebem.transformalotu.models.PokemonModel;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends CrudRepository<PokemonModel, Long>{
    @Query(value="SELECT * FROM pokemon WHERE nombre=='Pepe'")
    ArrayList<PokemonModel> sentenciaSqlSuperChunga();

}
