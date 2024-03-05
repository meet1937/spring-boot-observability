package com.spring.boot.observablity.fraudetect.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    private String homePage(){
        return "hello from fraud controller";
    }
}
