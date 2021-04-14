package com.cebem.transformalotu;

import java.util.Scanner;

public class Datos {
    static Scanner sc = new Scanner(System.in); 
    String texto;
    
    public static String IntroducirTexto(String texto){
        System.out.println("Introduce el texto: ");
        return texto = sc.nextLine();
    }

    public static char IntroducirLetra(char letra){
        System.out.println("Introduce la letra a buscar: ");
        return letra = sc.nextLine().charAt(0);
    }

    public static String BuscarLetra(String texto,char letra){
        String posiciones="";
        for(int i = 0;i<=texto.length();i++){
            if (texto.charAt(i)==letra) {
                posiciones = posiciones + texto.charAt(i) + " , ";
            }
        }
        return "La letra se encuentra en las posiciones: " + posiciones;
    }

    public Datos(){
        texto = "Cebem";
        
    }

    

}
