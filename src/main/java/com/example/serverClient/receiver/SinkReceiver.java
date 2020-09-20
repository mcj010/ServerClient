package com.example.serverClient.receiver;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import lombok.extern.slf4j.Slf4j;

@EnableBinding(value = Sink.class)
@Slf4j
public class SinkReceiver {
    @StreamListener(Sink.INPUT)
    public void receive(Object playload) {
        //log.info("消费者收到消息:{}", playload);
    	
    	System.out.println("消费者收到消息:" + playload);
    }
}