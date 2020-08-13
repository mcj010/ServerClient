package com.example.serverClient.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "ServerProvide", fallback = ClientTestServiceFallback.class)
public interface ClientTestService {
    @GetMapping("/ServerTest")
    String ClientTestServiceMethod();
}
