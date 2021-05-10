package com.cebem.transformalotu;

import java.util.Scanner;

public class Datos {
    static Scanner sc = new Scanner(System.in);
    String texto;
    int[] datos;
    
    public static String buscarLetra(String texto, String letra) {
        String posiciones = "";
        int textoLongitud=texto.length();
        for (int i = 0; i < textoLongitud; i++) {
            if (texto.charAt(i) == letra.charAt(0)) {
                posiciones = posiciones + i + " , ";
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

    public static String alternateCaps(String text){
        boolean caps = true;
        String result = "";
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = "";
            for (int j = 0; j < words[i].length(); j++) {
                if (caps) {
                    word += words[i].toUpperCase().charAt(j);
                    caps = false;
                } else {
                    word += words[i].toLowerCase().charAt(j);
                    caps = true;
                }
            }
            words[i] = word + " ";
            result += words[i];
        }
        return result;
    }

    public String borrarCaracteres(String deleteChar){
        return texto.replace(deleteChar, "");
    }

    void invertirOrdenDatos() {
        int aux;
        for (int i = 0; i < datos.length / 2; i++) {
            aux = datos[i];
            datos[i] = datos[datos.length - 1 - i];
            datos[datos.length - 1 - i] = aux;
        }
    }




    public String espaciosPorGuiones(){
        String palabr = texto.replaceAll(" ", "-");
        return palabr;
    }



/**
 * Muestra un carácter del texto introducido por línea
 * @param texto del que queremos separar sus caracteres
 * @return devuelve cada carácter por línea
 */
 public static String muestraCaracterEnLinea(String texto) {
		String aux = "";
		for (int i = 0; i < texto.length(); i++) {
			aux+= texto.charAt(i)+"\n";
		}
		return aux;
	}

    public String mayusculas(){
        if(texto == null) return "";
        return texto.toUpperCase();
    }

     /**
     * Devuelve una cadena con todas las vocales sustituidas por la i
     * @param cadena que queremos modificar
     * @return un String con todas las vocales sustituidas
     */
    String sustituirVocalesPorI(String cadena) {
       
       // definicion de varibles
       String cadenaVocalesI = "";
       char caracter;

       // Bucle para recorrer la cadena caracter a caracter
       for(int i=0; i<cadena.length(); i++) {
           caracter = cadena.charAt(i);
           // Condición para sustituir por 'i'
           if(caracter == 'a' || caracter == 'e' || caracter == 'o' || caracter == 'u') {
               cadenaVocalesI += 'i';
           // Condición para sustituir por 'I'
           }else if(caracter == 'A' || caracter == 'E' || caracter == 'O' || caracter == 'U') {
               cadenaVocalesI += 'I';
           // En caso de que no secumpla nada no se modifica el carácter
           }else {
               cadenaVocalesI += caracter;
           }
       }
       return cadenaVocalesI;
   }


    void MuestraCaracterEnLinea() {
		for (int i = 0; i < texto.length(); i++) {
			System.out.println(texto.charAt(i));
		} 
    }

}
