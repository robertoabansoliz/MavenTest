package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvironmentController {

    @Autowired
    private Environment environment;
    @GetMapping("/environment")
    public String env() {
        return "Estoy en el ambiente: "+environment.getActiveProfiles()[0];
    }
}