package com.cebem.transformalotu.repositories;

import com.cebem.transformalotu.models.GatitoModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GatitoRepository extends CrudRepository<GatitoModel, Long> {
    // @Query(value="SELECT * FROM gatito WHERE nombre='miku'")
    // ArrayList<PokemonModel> sentenciaSqlSuperChunga();

}
