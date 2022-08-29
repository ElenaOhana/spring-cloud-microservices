package com.jb.serviceB.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Value("${spring.cloud.consul.discovery.instanceId}")
    private String insId;

    @GetMapping("service/b")
    public String handleB() {
        return "This is instance B"+ "["+ insId+"]"  ;

    }
}
