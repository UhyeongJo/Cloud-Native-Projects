package com.example.simpleapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping()
    public String nothing(){
        return "nothing!";
    }
    @GetMapping("hello")
    public String hello(){
        return "Hello the new World!";
    }

}
