package com.example.app4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String home() {
        return "Hello from App4";
    }

    @GetMapping("/health")
    public String health() {
        return "APP4 UP";
    }
}