package com.digitrader.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

public class PreopenDetails {


    @RequestMapping("/hello")
    private String getHellowWorld(){
        return "Hello World";
    }

    @GetMapping(value = "/preopen/{stock+-}")
    private String getPreOpenDetails(){
        String url = "https://api.tickertape.in/stocks/charts/intra/VDAN";
        RestTemplate restTemplate = new RestTemplate();
        String results = restTemplate.getForObject(url,String.class);
        return results;
    }
}
