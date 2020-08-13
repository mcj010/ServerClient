package com.example.serverClient.Service;

import org.springframework.stereotype.Component;

@Component
public class ClientTestServiceFallback implements ClientTestService{
    @Override
    public String ClientTestServiceMethod() {
        return "网络繁忙，请稍后再试。（这里是服务调用者使用Feign的快速失败给出的提示）";
    }
}
