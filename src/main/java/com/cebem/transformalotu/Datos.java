package com.cebem.transformalotu;

import java.util.Scanner;

public class Datos {
    static Scanner sc = new Scanner(System.in);
    String texto;
    int[] datos;
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
        datos = new int[] {1,2,3};
    }

    /**
     * Analiza si una palabra está o no en un texto.
     * @param palabra La palabra que queremos buscar
     * @return true si la palabra está en el texto, false en caso contrario
     */
    public boolean buscarPalabra(String palabra, String text){
        String[] txt = text.split(" ");
        boolean encontrado = false;

        for(int i=0;i<txt.length;i++){
            if(txt[i].equals(palabra)){
                encontrado = true;
            }
        }
        
        return encontrado;
    }

    String invierteTexto() {
        String finalText = "";
        int lText = texto.length();

        for (int i = lText - 1; i >= 0; i--) {
            finalText.concat(texto.charAt(i)+"");
        }
        return finalText;
    }

    public String borrarCaracteres(String deleteChar){
        return texto.replace(deleteChar, "");
    }
}
