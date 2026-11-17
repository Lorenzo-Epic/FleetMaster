package com.fleetmaster.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// This test opens at http://localhost:8080/api/hello
@RestController
public class Test {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }
}v