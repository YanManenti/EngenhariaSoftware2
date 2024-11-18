package com.example.ES2.controllers;

import com.example.ES2.models.Case;
import com.example.ES2.repositories.CaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/case")
public class CaseController {

    @Autowired
    private CaseRepository caseRepository;

    @GetMapping
    public String exemplo(){
        return "Exemplo de /api/case";
    }

    @GetMapping("/all")
    public List<Case> allCases() {return caseRepository.findAll();}
}
