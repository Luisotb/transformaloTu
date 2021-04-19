package com.cebem.transformalotu;

import java.text.MessageFormat;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class SaludaController {
    @GetMapping("/")
    public String saludar(){
        return "Hola tal estas. Soy el backend";
    }
   
    @GetMapping("/chao")
    public String despedirse(){
        return "Adios amigo";
    }
      
    @GetMapping("/saludame/{nombre}")
    public String saludame(@PathVariable String nombre){
        return "Hola que tal " + nombre;
    }

    /*get para consultar*/
    @GetMapping("/saluda")
    public String SaludaPorQuery(@RequestParam String nombre,@RequestParam String apellidos){
        //return "Hola que tal estás" + nombre + " " + apellidos;
        Object params[] = {nombre, apellidos};
        return MessageFormat.format("Qué tal estás {0} {1}", params);
    }

    /*peticion tipo post, para guardar, enviada por el body*/
    @PostMapping("/guardar")
    public String Guardar(@RequestBody String nombre,@RequestBody int edad) {
        
        return "he guardado los datos de: " + nombre + " y la edad: " + edad;
    }

    @DeleteMapping("/borrar/{id}")
    public String borrar (@PathVariable String id){
        return null;
    }
    
}
    
    
