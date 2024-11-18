package com.example.ES2.controllers;

import com.example.ES2.models.Motherboard;
import com.example.ES2.repositories.MotherboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/motherboard")
public class MotherboardController {

    @Autowired
    private MotherboardRepository motherboardRepository;

    @GetMapping
    public String exemplo(){
        return "Exemplo de /api/motherboard";
    }

    @GetMapping("/all")
    public List<Motherboard> allMotherboards() {
        return motherboardRepository.findAll();
    }
}
