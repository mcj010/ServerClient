package com.example.serverClient.controller;

import com.example.serverClient.Service.ClientTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
public class FeignController {
    @Autowired
    ClientTestService clientTestService;

    @GetMapping("/getTestMsgByFeign")
    public String findById(){
        return clientTestService.ClientTestServiceMethod();
    }
}
