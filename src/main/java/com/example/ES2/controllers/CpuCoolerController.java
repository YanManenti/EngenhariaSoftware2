package com.example.ES2.controllers;

import com.example.ES2.models.CpuCooler;
import com.example.ES2.repositories.CpuCoolerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cpucooler")
public class CpuCoolerController {

    @Autowired
    private CpuCoolerRepository cpuCoolerRepository;

    @GetMapping
    public String exemplo(){
        return "Exemplo de /api/cpucooler";
    }

    @GetMapping("/all")
    public List<CpuCooler> allCpuCoolers() {return cpuCoolerRepository.findAll();}
}
