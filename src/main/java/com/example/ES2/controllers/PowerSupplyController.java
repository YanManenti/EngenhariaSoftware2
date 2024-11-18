package com.example.ES2.controllers;

import com.example.ES2.models.PowerSupply;
import com.example.ES2.repositories.PowerSupplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/powersupply")
public class PowerSupplyController {

    @Autowired
    PowerSupplyRepository powerSupplyRepository;

    @GetMapping
    public String exemplo(){
        return "Exemplo de /api/powersupply";
    }

    @GetMapping("/all")
    public List<PowerSupply> allPowerSupplies() {return powerSupplyRepository.findAll();}
}
