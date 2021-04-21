package com.cebem.transformalotu;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

class Picture{
    public String large;
    public String medium;
    public String small;
}

class Results{
    public String gender;
    public String email;
    public String phone;
    public Picture picture;
}

class DatosPersona{
    public ArrayList<Results> results = new ArrayList<>();
}

/*Indicar al framework*/
@Service
public class FotoService {

    /*Inyección dependencias*/
    @Autowired
    static
    RestTemplate restTemplate;

    public static String getFoto(){
        String url = "https://randomuser.me/api/";
        DatosPersona json =restTemplate.getForObject(url, DatosPersona.class);
        return json.results.get(0).picture.large;
    }
}
