package com.example.ES2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fan")
public class FanController {

    @GetMapping
    public String exemplo(){
        return "Exemplo de /api/fan";
    }
}
