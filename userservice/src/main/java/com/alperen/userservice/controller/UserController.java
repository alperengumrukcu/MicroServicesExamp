package com.alperen.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping
    public String deneme(){
        System.out.println("İstek alındı.");
        return "İstek başarılı";
    }
}
