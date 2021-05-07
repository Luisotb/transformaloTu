package com.cebem.transformalotu.controllers;

import com.cebem.transformalotu.Datos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BuscaLetraController {

    @GetMapping("/buscaLetra/{letra}{texto}")
    public String buscarLetra(@PathVariable String texto,@PathVariable char letra ) {
    String posiciones = Datos.buscarLetra(texto, letra);
    return "El texto es: " + texto + "\nLa letras es: " + letra + 
    "\nAparece un número de: " + posiciones + " veces";
    }

    
}
