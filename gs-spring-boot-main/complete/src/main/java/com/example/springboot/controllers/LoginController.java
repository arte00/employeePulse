package com.example.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String login() {
        return "auth/login";
    }

    @GetMapping("/register")
    public String register(){
        return "auth/register";
    }

}