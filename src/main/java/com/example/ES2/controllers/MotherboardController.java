package com.example.ES2.controllers;

import com.example.ES2.models.Memory;
import com.example.ES2.models.Motherboard;
import com.example.ES2.repositories.MemoryRepository;
import com.example.ES2.repositories.MotherboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/motherboard")
public class MotherboardController {

    @Autowired
    private MotherboardRepository motherboardRepository;
    @Autowired
    private MemoryRepository memoryRepository;

    @GetMapping
    public String exemplo(){
        return "Exemplo de /api/motherboard";
    }

    @GetMapping("/paged")
    public ResponseEntity<Page<Memory>> pagedByKey(
            @RequestParam(defaultValue = "Name") String key,
            @RequestParam(required = false) String value,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size
    ) {
        try {
            Pageable paging = PageRequest.of(page, size);
            Page<Memory> pageMemorys;

            if ("".equals(value)) {
                pageMemorys = memoryRepository.findAll(paging);
            } else {
                pageMemorys = memoryRepository.pagedFindByKeyIgnoreCasing(paging, key, value);
            }

            return new ResponseEntity<>(pageMemorys, HttpStatus.OK);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
