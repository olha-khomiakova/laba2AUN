package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDockerController {
    @GetMapping("/demo")
    public String hello() {
        return "Hello, Docker!";
    }
}