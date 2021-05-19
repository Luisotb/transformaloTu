package com.cebem.transformalotu.controllers;

import java.text.MessageFormat;
import java.util.Arrays;
import com.cebem.transformalotu.Datos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cebem.transformalotu.util.Grammar;

@RestController
public class DatosController {

    @GetMapping("/grammar/palindromo/{palabra}")
    public String palindromo(@PathVariable String palabra) {
        boolean isPalindromo = Grammar.checkPalindromo(palabra);
        Object params[] = { palabra, isPalindromo };
        return MessageFormat.format("[palabra: {0}, palindromo: {1}]", params).toString();
    }

    @GetMapping("/grammar/anagrama")
    public String anagrama(@RequestParam String palabraUno, @RequestParam String palabraDos) {
        boolean isAnagrama = Grammar.checkAnagrama(palabraUno, palabraDos);
        Object params[] = { palabraUno, palabraDos, isAnagrama };
        return MessageFormat.format("[palabraUno: {0}, palabraDos: {1}, isAnagrama: {2}]", params).toString();
    }

    @GetMapping("/buscaLetra/{letra}/{texto}")
    public String buscarLetra(@PathVariable String texto, @PathVariable String letra) {
        String posiciones = Datos.buscarLetra(texto, letra);
        return "El texto es: " + texto + " \n " + " La letras es : " + letra + " \n " + "Aparece en las posiciones: "
                + posiciones;
    }

    @GetMapping("/mayusculas/{texto}")
    public String pasarAMayusculas(@PathVariable String texto) {
        Datos datos = new Datos();
        datos.setTexto(texto);
        return datos.mayusculas();
    }

    @GetMapping("/busca")
    public boolean buscarPalabra(@RequestParam String frase, @RequestParam String palabra) {
        Datos datos = new Datos();

        boolean resultado = datos.buscarPalabra(palabra, frase);

        return resultado;
    }

    @GetMapping("/invertirarray/{array}")
    public String invertirOrdenDatos(@PathVariable String array) {
        Datos datos = new Datos();
        String datosFinal;
        String[] datosString = array.split(",");
        int[] datos2 = new int[datosString.length];
        for (int i = 0; i < datosString.length; i++) {
            datos2[i] = Integer.parseInt(datosString[i]);
        }
        datos.setDatos(datos2);
        datos2 = datos.invertirOrdenDatos();
        datosFinal = Arrays.toString(datos2);
        return datosFinal;
    }

    @GetMapping("/muestraCaracterLinea/{texto}")
    public static String muestraCaracterEnLinea(@PathVariable String texto) {
        Datos datos = new Datos();
        String aux = datos.muestraCaracterEnLinea(texto);
        datos.setTexto(aux);
        return "<pre>" + aux + "</pre>";
    }

    @GetMapping("/espacioPorGuines/{frase}")
    public String espaciosPorGuiones(@PathVariable String texto) {
        Datos datos = new Datos();
        datos.setTexto(texto);
        return datos.espaciosPorGuiones();
    }

    @GetMapping("/convertirACesar/{texto}/{codigo}")
    public String cifradoCesar(@PathVariable String texto, @PathVariable int codigo) {

        String textoCifrado = Datos.cifradoCesar(texto, codigo);
        return textoCifrado;
    }

    @GetMapping("/sustituirVocalesPorI/{textoEntrada}")
    public static String sustituirVocalesPorI(@PathVariable String textoEntrada) {
        Datos datos = new Datos();
        String textoSalida = datos.sustituirVocalesPorI(textoEntrada);
        return "<h3>" + textoSalida + "</h3>";
    }

    @GetMapping("/generaArrayPorTamano/{number}")
    public int[] generaArrayPorTamano(@PathVariable int number) {
        Datos datos = new Datos();

        int[] res = datos.generaArrayPorTamano(number);
        return res;
    }

}
