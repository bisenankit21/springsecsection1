package com.springSecurity.springsecsection1.controller;

import org.springframework.security.web.access.intercept.AuthorizationFilter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public String sayWelcome(){
        return "Welcome to Spring Application without security";
   }

}
