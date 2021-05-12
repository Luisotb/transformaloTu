package com.cebem.transformalotu.controllers;

import java.text.MessageFormat;
import com.cebem.transformalotu.Grammar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrammarController {

    @GetMapping("/grammar/palindromo/{palabra}")
    public String palindromo(@PathVariable String palabra) {
        boolean isPalindromo = Grammar.checkPalindromo(palabra);
        Object params[] = { palabra, isPalindromo };
        return MessageFormat.format("[palabra: {0}, palindromo: {1}]", params).toString();
    }

    @GetMapping("/grammar/anagrama")
    public String anagrama(@RequestParam String palabraUno, @RequestParam String palabraDos) {
        boolean isAnagrama = Grammar.checkAnagrama(palabraUno, palabraDos);
        Object params[] = { palabraUno, palabraDos, isAnagrama };
        return MessageFormat.format("[palabraUno: {0}, palabraDos: {1}, isAnagrama: {2}]", params).toString();
    }
}
