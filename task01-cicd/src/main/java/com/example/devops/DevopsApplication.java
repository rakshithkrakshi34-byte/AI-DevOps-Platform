package com.example.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevopsApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "DevOps CI/CD Application Running - Version 1";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }
}