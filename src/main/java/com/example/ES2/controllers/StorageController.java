package com.example.ES2.controllers;

import com.example.ES2.models.Storage;
import com.example.ES2.repositories.StorageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/storage")
public class StorageController {

    @Autowired
    StorageRepository storageRepository;

    @GetMapping
    public String exemplo(){
        return "Exemplo de /api/storage";
    }

    @GetMapping("/all")
    public List<Storage> allStorages() {return storageRepository.findAll();}
}
