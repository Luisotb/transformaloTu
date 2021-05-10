package com.cebem.transformalotu.controllers;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Map;

import javax.annotation.PostConstruct;

import com.cebem.transformalotu.Datos;
import com.cebem.transformalotu.models.PokemonModel;
import com.cebem.transformalotu.services.FakeFotoService;
import com.cebem.transformalotu.services.FotoService;
import com.cebem.transformalotu.services.PokemonBDService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class SaludaController {
 
    @Autowired
    FotoService fotoService;

    @Autowired
    FakeFotoService fakeFotoService;

    @Autowired
    PokemonBDService pokemonBDService;
    
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

    @GetMapping("/damefoto")
    public String dameFoto(){
        String foto = fotoService.getFoto();
        return "<img src='"+foto+"'/>";
    }

    @GetMapping("/damefotofake")
    public String dameFotoFake(){
        String foto = fakeFotoService.getFoto();
        return "<img src='"+foto+"'/>";
    }

    @GetMapping("/pokemons")
    public String pokemons(){
        return pokemonBDService.obtenerTodosLosPokemons().toString();
    }


    /*peticion tipo post, para guardar, enviada por el body*/
    @PostMapping("/insertaPokemon")
    public String insertaPokemon(@RequestParam Map<String, String> body) {
        System.out.println(body.get("nombre"));
        PokemonModel pokemon = new PokemonModel();
        pokemon.setNombre(body.get("nombre"));
        pokemon.setPeso(Integer.parseInt(body.get("peso")));
        pokemonBDService.guardarPokemon(pokemon);
        return "he guardado los datos del pokemon";
    }


    @GetMapping("/mayusculas/{texto}")
    public String pasarAMayusculas(@PathVariable String texto){
        Datos datos = new Datos();
        datos.setTexto(texto);
        return datos.mayusculas();
    }

    @GetMapping("/invertirarray/{array}")
    public String invertirOrdenDatos(@PathVariable String array) {
        Datos datos = new Datos();
        String datosFinal;
        String[] datosString = array.split(",");
        int [] datos2 = new int [datosString.length];
        for(int i=0; i<datosString.length; i++) {
            datos2[i] = Integer.parseInt(datosString[i]);
        }
        datos.setDatos(datos2);
        datos2 = datos.invertirOrdenDatos();
        datosFinal = Arrays.toString(datos2);
        return datosFinal;
    }

}
    
    
