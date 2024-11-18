package com.example.ES2.controllers;

import com.example.ES2.models.Cpu;
import com.example.ES2.repositories.CpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cpu")
public class CpuController {

    @Autowired
    private CpuRepository cpuRepository;

    @GetMapping
    public String exemplo(){
        return "Exemplo de /api/cpu";
    }

    @GetMapping("/all")
    public List<Cpu> allCpus() {
        return cpuRepository.findAll();
    }
}
