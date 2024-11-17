package com.example.ES2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/motherboard")
public class MotherboardController {

    @GetMapping
    public String exemplo(){
        return "Exemplo de /api/motherboard";
    }
}
