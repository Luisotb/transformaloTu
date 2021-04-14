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
    
    public boolean buscarPalabra(String palabra){
        String[] txt = texto.split(" ");
        boolean encontrado = false;

        for(int i=0;i<txt.length;i++){
            if(txt[i].equals(palabra)){
                encontrado = true;
            }
        }
        
        return encontrado;
    }

}
