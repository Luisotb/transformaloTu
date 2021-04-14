package com.cebem.transformalotu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SaludaController {
    @GetMapping("/")
    public String saludar (){

        return "Hola que tal estas. Soy el backend";
    }

    @GetMapping("/chao")
    public String despedirse(){

        return "Adios amigo";
    }

    @GetMapping("/saludame/{nombre}")
    public String saludame(@PathVariable String nombre){
        return "Hola que tal " + nombre;
    }

    

        
    




    
}
