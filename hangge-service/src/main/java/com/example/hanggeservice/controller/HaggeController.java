package com.example.hanggeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HaggeController {

        @GetMapping("/hello")
        public String hello() {
            return "欢迎访问 hangge.com";
        }

}
