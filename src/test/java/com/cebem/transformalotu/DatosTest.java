package com.cebem.transformalotu;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DatosTest {

    @Test
    void buscarPalabraTest(){
        Datos prueba = new Datos();
        String texto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

        boolean resultado = prueba.buscarPalabra("sit", texto);
        boolean resultado2 = prueba.buscarPalabra("hola", texto);
        assertTrue(resultado);
        assertFalse(resultado2);
    }
    
}
