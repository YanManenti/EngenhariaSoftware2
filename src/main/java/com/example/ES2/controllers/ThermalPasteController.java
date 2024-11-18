package com.example.ES2.controllers;

import com.example.ES2.models.ThermalPaste;
import com.example.ES2.repositories.ThermalPasteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/thermalpaste")
public class ThermalPasteController {

    @Autowired
    ThermalPasteRepository thermalPasteRepository;

    @GetMapping
    public String exemplo(){
        return "Exemplo de /api/thermalpaste";
    }

    @GetMapping("/all")
    public List<ThermalPaste> allThermalPastes() {return thermalPasteRepository.findAll();}
}

