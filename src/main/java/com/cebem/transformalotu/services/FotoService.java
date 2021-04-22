package com.cebem.transformalotu.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

class Picture{
    public String large;
    public String medium;
}
class Result{
    public String gender;
    public String email;
    public String phone;
    public Picture picture;
}
class DatosPersona{
    public ArrayList<Result> results = new ArrayList<>();
}


@Service
public class FotoService {

    @Autowired
    RestTemplate restTemplate;

    public String getFoto(){
        String url = "https://randomuser.me/api/";
        DatosPersona json = restTemplate.getForObject(url, DatosPersona.class );
        return json.results.get(0).picture.large;
    }
}
