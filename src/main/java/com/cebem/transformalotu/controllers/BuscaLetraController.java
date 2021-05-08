package com.cebem.transformalotu.controllers;

import com.cebem.transformalotu.Datos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BuscaLetraController {

    @GetMapping("/buscaLetra/{letra}/{texto}")
    public String buscarLetra(@PathVariable String texto,@PathVariable String letra ) {
    String posiciones = Datos.buscarLetra(texto, letra);
    return "El texto es: " + texto + " \n " + " La letras es : " + letra + 
    " \n " + "Aparece en las posiciones: " + posiciones ;
    }
    @GetMapping("/b")
    public String buscarLetra( ) {
        return "hola";
    }
    
}
