package com.cebem.transformalotu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DatosTest {

    @Test
    void buscarPalabraTest() {
        Datos prueba = new Datos();
        String texto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

        boolean resultado = prueba.buscarPalabra("sit", texto);
        boolean resultado2 = prueba.buscarPalabra("hola", texto);
        assertTrue(resultado);
        assertFalse(resultado2);
    }

    /**
     * Testeo del metodo sustituirVocalesPorI Se envia la variable de tipo String
     * "texto" y se espera que devuelva un String igual a "textoSolucion"
     */
    @Test
    void sustituirVocalesPorITest() {
        Datos datos = new Datos();
        String texto = "Esto es una prueba para comprobar que se sustituyan todas las vocales";
        String textoSolucion = "Isti is ini priibi piri cimpribir qii si sistitiyin tidis lis vicilis";

        String resultado = datos.sustituirVocalesPorI(texto);
        assertEquals(textoSolucion, resultado);
    }

    @Test
    void asciiTu() {
        Datos datos = new Datos();
        String texto = "Hola";
        String textoAscii = "72 111 108 97 10";

        String resultado = datos.asciiTu(texto);
        assertEquals(textoAscii, resultado);
    }

}
