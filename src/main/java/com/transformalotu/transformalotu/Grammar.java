package com.transformalotu.transformalotu;

import java.util.Arrays;

/**
 * Clase que gestiona determinadas acciones gramáticas con una palabra
 * @author Samuel
 */
public class Grammar {

    /**
     * String que almacena la palabra
     */
    private String word;

    /**
     * Constructor de la clase.
     * Instancia la clase con la palabra pasada por parametro
     * @param word
     */
    public Grammar(String word) {
        this.word = word;
    }

    /**
     * Obtiene la palabra en uso en la clase
     * @return palabra
     */
    public String getWord() {
        return word;
    }

    /**
     * Establece la palabra a usar en la clase
     * @param word
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     * Comprueba si la palabra es un palindromo
     * @return true si es un palindromo
     */
    public boolean checkPalindromo() {
        String sanitizedWord = sanitizeString(this.word);
        return sanitizedWord.equals(reverseString(sanitizedWord));
    }

    /**
     * Comprueba si la palabra es un anagrama
     * @return true si es un anagrama
     */
    public boolean checkAnagrama(String anagram) {
        String sortedWord = sortString(sanitizeString(this.word));
        String sortedAnagram = sortString(sanitizeString(anagram));
        return sortedWord.equals(sortedAnagram);
    }

    /**
     * Ordena los caracteres de un string en orden numerico
     * @param word
     * @return string con los caracteres ordenados
     */
    private String sortString(String word) {
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    /**
     * Devuelve la string que se le pase por parametro revertida
     * @param word
     * @return string del reves
     */
    private String reverseString(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    /**
     * Elimina los signos de puntuacion de una palabra usando una
     * expresión regular
     * @param word
     * @return string sin signos de puntuacion
     */
    private String sanitizeString(String word) {
        return word.replaceAll("[^\\w\\d]", "").toLowerCase();
    }
    
}