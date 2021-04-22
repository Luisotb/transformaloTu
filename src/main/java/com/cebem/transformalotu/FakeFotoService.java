package com.cebem.transformalotu;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

class FakePerson{
    public String age;
    public String image_url;
}

@Service
public class FakeFotoService {

    @Autowired
    RestTemplate restTemplate;

    public String getFoto(){
        String url = "https://fakeface.rest/face/json";
        FakePerson json = restTemplate.getForObject(url, FakePerson.class );
        System.out.println(json.age);
        return json.image_url;
    }
}
