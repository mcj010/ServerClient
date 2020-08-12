package com.example.serverClient.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Configuration
public class ClientTestController {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/getTestMsg")
    public String getTestMsg(){
        RestTemplate rt = getRestTemplate();
        String result = rt.getForObject("http://ServerProvide/ServerTest", String.class);
        return result;
    }
}
