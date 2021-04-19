package com.cebem.transformalotu;

import java.util.Scanner;

public class Datos {
    static Scanner sc = new Scanner(System.in);
    String texto;

    public static String buscarLetra(String texto, char letra) {
        String posiciones = "";
        for (int i = 0; i <= texto.length(); i++) {
            if (texto.charAt(i) == letra) {
                posiciones = posiciones + texto.charAt(i) + " , ";
            }
        }
        return  posiciones;
    }

    public Datos() {
        texto = "Cebem";

    }

}
