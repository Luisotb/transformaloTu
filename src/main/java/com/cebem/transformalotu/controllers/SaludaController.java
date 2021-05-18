package com.cebem.transformalotu.controllers;

import java.text.MessageFormat;
import java.util.Map;

import com.cebem.transformalotu.models.GatitoModel;
import com.cebem.transformalotu.services.FakeFotoService;
import com.cebem.transformalotu.services.FotoService;
import com.cebem.transformalotu.services.GatitoBDService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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
    GatitoBDService gatitoBDService;

    @GetMapping("/")
    public String saludar() {
        String msg="<h1>Bienvenido al backend de Cebem: </h1>";
        msg+="Peticion por GET /chao  <a href='/chao'>Probar<a/><br/>";
        msg+="Peticion con un parametro por GET /saludame/XXX (con parametro) <a href='/saludame/Pepe'>Probar<a/><br/>";
        msg+="Peticion con datos por query por GET /saluda?nombre=XXX&apellidos=YYYY  <a href='/saluda?nombre=Bea&apellidos=Olalde'>Probar<a/><br/>";
        msg+="Peticion por GET acceso a API para obtener foto aleatoria /damefoto <a href='/damefoto'>Probar<a/><br/>";
        msg+="Peticion por GET acceso a API para obtener foto generada por IA /damefotofake <a href='/damefotofake'>Probar<a/><br/>";
        msg+="Peticion por GET obtener todos los gatos almacenados en la BD /listarGatitos <a href='/listarGatitos'>Probar<a/><br/>";
        msg+="Peticion por GET acceso al formulario de inserción de gatitos /formularioGatito <a href='/formularioGatito'>Probar<a/><br/>";
        msg+="Peticion por GET convertir un texto a mayuscula /mayusculas/XXX <a href='/mayusculas/angel'>Probar<a/><br/>";

        return msg;
        
    }

    @GetMapping("/chao")
    public String despedirse() {
        return "Adios amigo";
    }

    @GetMapping("/saludame/{nombre}")
    public String saludame(@PathVariable String nombre) {
        return "Hola que tal " + nombre;
    }

    /* get para consultar */
    @GetMapping("/saluda")
    public String SaludaPorQuery(@RequestParam String nombre, @RequestParam String apellidos) {
        // return "Hola que tal estás" + nombre + " " + apellidos;
        Object params[] = { nombre, apellidos };
        return MessageFormat.format("Qué tal estás {0} {1}", params);
    }

    /* peticion tipo post, para guardar, enviada por el body */
    @PostMapping("/guardar")
    public String Guardar(@RequestBody String nombre, @RequestBody int edad) {

        return "he guardado los datos de: " + nombre + " y la edad: " + edad;
    }

    @DeleteMapping("/borrar/{id}")
    public String borrar(@PathVariable String id) {
        return null;
    }

    @GetMapping("/damefoto")
    public String dameFoto() {
        String foto = fotoService.getFoto();
        return "<img src='" + foto + "'/>";
    }

    @GetMapping("/damefotofake")
    public String dameFotoFake() {
        String foto = fakeFotoService.getFoto();
        return "<img src='" + foto + "'/>";
    }

    @GetMapping("/listarGatitos")
    public String gatitos() {
        return gatitoBDService.obtenerTodosLosGatitos().toString();
    }

    /* peticion tipo post, para guardar, enviada por el body */
    @PostMapping("/insertaGatito")
    public String insertaGatito(@RequestParam Map<String, String> body) {
        System.out.println(body.get("nombre"));
        GatitoModel gatito = new GatitoModel();
        gatito.setNombre(body.get("nombre"));
        gatito.setPeso(Integer.parseInt(body.get("peso")));
        gatitoBDService.guardarGatito(gatito);
        return "he guardado los datos del gatito";
    }
}
