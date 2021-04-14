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

    public String borrarCaracteres(String deleteChar){
        return texto.replace(deleteChar, "");
    }
}
