package com.cebem.transformalotu.services;

import java.util.ArrayList;

import com.cebem.transformalotu.models.GatitoModel;
import com.cebem.transformalotu.repositories.GatitoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GatitoBDService {
    @Autowired
    GatitoRepository gatitoRepository;

    public ArrayList<GatitoModel> obtenerTodosLosGatitos() {
        return (ArrayList<GatitoModel>) gatitoRepository.findAll();
    }

    public GatitoModel guardarGatito(GatitoModel gatito) {
        return gatitoRepository.save(gatito);
    }
}
