package com.example.serverClient.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;

@RibbonClient(name="ServerProvide", configuration=LbConfig.class)
public class LbConfig {
    @Bean
    public IRule getRule(){
        return new RandomRule();
    }
}