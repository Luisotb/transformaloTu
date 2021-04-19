package com.cebem.transformalotu;

public class Datos {
    String texto;
    int numeros[];

    public Datos(){
        texto = "Cebem";
        numeros = new int[]{1,2,3};
    }

    String toUpperCase(){
        return texto.toUpperCase();
    }

    String invierteTexto() {
        String finalText = "";
        int lText = texto.length();

        for (int i = lText - 1; i >= 0; i--) {
            finalText.concat((String)texto.charAt(i));
        }
        return finalText;
    }

}
