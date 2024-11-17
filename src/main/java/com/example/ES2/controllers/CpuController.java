package com.example.ES2.controllers;

import com.example.ES2.models.Processador;
import com.example.ES2.repositories.ProcessadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cpu")
public class CpuController {

    @Autowired
    private ProcessadorRepository processadorRepository;

    @GetMapping
    public String exemplo(){
        return "Exemplo de /api/cpu";
    }

    @GetMapping("/processadores")
    public List<Processador> allProcessadores() {
        return processadorRepository.findAll();
    }

    @GetMapping("/processador/{id}")
    public Processador processador(@PathVariable String id) {
        return processadorRepository.findById(id).orElse(null);
    }
}
