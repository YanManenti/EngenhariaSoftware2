package com.example.ES2.controllers;

import com.example.ES2.models.Memory;
import com.example.ES2.repositories.MemoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/memory")
public class MemoryController {

    @Autowired
    private MemoryRepository memoryRepository;

    @GetMapping
    public String exemplo(){
        return "Exemplo de /api/memory";
    }

    @GetMapping("/all")
    public List<Memory> allMemories() {return memoryRepository.findAll();}
}
