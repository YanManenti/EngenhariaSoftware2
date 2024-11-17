package com.example.ES2.controllers;

import com.example.ES2.models.Memoria;
import com.example.ES2.models.PlacaMae;
import com.example.ES2.models.Processador;
import com.example.ES2.repositories.MemoriaRepository;
import com.example.ES2.repositories.PlacaMaeRepository;
import com.example.ES2.repositories.ProcessadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private ProcessadorRepository processadorRepository;
    @Autowired
    private PlacaMaeRepository placaMaeRepository;
    @Autowired
    private MemoriaRepository memoriaRepository;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @PostMapping("/processador")
    public Processador postProcessador(@RequestBody Processador processador) {
        processador = processadorRepository.save(processador);
        return processador;
    }

    @PostMapping("/placa-mae")
    public PlacaMae postPlacaMae(@RequestBody PlacaMae placaMae) {
        placaMae = placaMaeRepository.save(placaMae);
        return placaMae;
    }

    @PostMapping("/memoria")
    public Memoria postMemoria(@RequestBody Memoria memoria) {
        memoria = memoriaRepository.save(memoria);
        return memoria;
    }

//    @GetMapping("/processadores")
//    public List<Processador> allProcessadores() {
//        return processadorRepository.findAll();
//    }

//    @GetMapping("/processador/{id}")
//    public Processador processador(@PathVariable String id) {
//        return processadorRepository.findById(id).orElse(null);
//    }

    @GetMapping("/placas-mae")
    public List<PlacaMae> allPlacasMae() {
        return placaMaeRepository.findAll();
    }

    @GetMapping("/placa-mae/{id}")
    public PlacaMae placaMae(@PathVariable String id) {
        return placaMaeRepository.findById(id).orElse(null);
    }

    @GetMapping("/memorias")
    public List<Memoria> allMemorias() {
        return memoriaRepository.findAll();
    }

    @GetMapping("/memoria/{id}")
    public Memoria memoria(@PathVariable String id) {
        return memoriaRepository.findById(id).orElse(null);
    }





}
