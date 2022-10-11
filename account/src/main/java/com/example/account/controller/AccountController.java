package com.example.account.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @RequestMapping("/")
    public String display(){
        return "Heyo";
    }

    @RequestMapping("/goodbye")
    public String bye(){
        return "Goodbye from Spring Boot";
    }
}
