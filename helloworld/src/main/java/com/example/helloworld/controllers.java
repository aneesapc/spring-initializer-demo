package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllers {

    @GetMapping("/hello")
    public String get() {
        return "Hello Spring Boot";
    }
}
