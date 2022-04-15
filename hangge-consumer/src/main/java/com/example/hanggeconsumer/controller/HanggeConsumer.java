package com.example.hanggeconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HanggeConsumer {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hello-consumer")
    public String helloConsumer() {
        // 通过服务名调用服务提供者的接口
        return restTemplate.getForEntity("http://hangge-service/hello", String.class).getBody();
    }
}
