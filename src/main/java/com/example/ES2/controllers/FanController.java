package com.example.ES2.controllers;

import com.example.ES2.models.Fan;
import com.example.ES2.repositories.FanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/fan")
public class FanController {

    @Autowired
    FanRepository fanRepository;

    @GetMapping
    public String exemplo(){
        return "Exemplo de /api/fan";
    }

    @GetMapping("/all")
    public List<Fan> allFans() {return fanRepository.findAll();}
}
