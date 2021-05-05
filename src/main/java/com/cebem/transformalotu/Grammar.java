package com.cebem.transformalotu;

import java.util.Arrays;

/**
 * Clase que gestiona determinadas acciones gramáticas con palabras
 * @author Samuel
 */
public class Grammar {
    /**
     * Comprueba si la palabra es un palindromo
     * @return true si es un palindromo
     */
    public static boolean checkPalindromo(String word) {
        String sanitizedWord = sanitizeString(word);
        return sanitizedWord.equals(reverseString(sanitizedWord));
    }

    /**
     * Comprueba si la palabra es un anagrama
     * @return true si es un anagrama
     */
    public static boolean checkAnagrama(String anagram) {
        String sortedWord = sortString(sanitizeString(this.word));
        String sortedAnagram = sortString(sanitizeString(anagram));
        return sortedWord.equals(sortedAnagram);
    }

    /**
     * Ordena los caracteres de un string en orden numerico
     * @param word
     * @return string con los caracteres ordenados
     */
    private static String sortString(String word) {
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    /**
     * Devuelve la string que se le pase por parametro revertida
     * @param word
     * @return string del reves
     */
    private static String reverseString(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    /**
     * Elimina los signos de puntuacion de una palabra usando una
     * expresión regular
     * @param word
     * @return string sin signos de puntuacion
     */
    private static String sanitizeString(String word) {
        return word.replaceAll("[^\\w\\d]", "").toLowerCase();
    }
    
}