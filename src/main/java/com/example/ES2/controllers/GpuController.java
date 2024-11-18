package com.example.ES2.controllers;

import com.example.ES2.models.Gpu;
import com.example.ES2.repositories.GpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/gpu")
public class GpuController {

    @Autowired
    GpuRepository gpuRepository;

    @GetMapping
    public String exemplo(){
        return "Exemplo de /api/gpu";
    }

    @GetMapping("/all")
    public List<Gpu> allGpus() {return gpuRepository.findAll();}
}
