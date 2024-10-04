package com.learning.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Hello!";
    }

    @RequestMapping("/about")
    public String about(){
        return "Hello from about!";
    }
}