package com.cebem.transformalotu;

public class Datos {
    String texto;
    int numeros[];

    public Datos(){
        texto = "Cebem";
        numeros = new int[]{1,2,3};
    }

}

public class BorrarCaracteres{
   
    String message;
    String DeleteChar;
    String result="";
        
    public BorrarCaracteres(){
        message="Texto de ejemplo";
        DeleteChar="e";
        result = message.replace(DeleteChar, " ");
    }
 
}