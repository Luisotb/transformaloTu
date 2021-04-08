package com.transformalotu.transformalotu;

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