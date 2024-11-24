package com.example.ES2.controllers;

import com.example.ES2.models.Computer;
import com.example.ES2.models.Memory;
import com.example.ES2.repositories.Specific.MemoryRepository;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/memory")
public class MemoryController {

    @Autowired
    private MemoryRepository memoryRepository;

    @GetMapping
    public String exemplo() {
        return "Exemplo de /api/memory";
    }

    @GetMapping("/paged")
    public ResponseEntity<List<Memory>> pagedByKey(@RequestParam(required = false) String value, @RequestBody Computer computer) {
        try {
            Map<String, String> andConditions = new HashMap<>();
            Map<String, List<String>> orConditions = new HashMap<>();

            if (!StringUtils.isBlank(value)) {
                andConditions.put("Name", value);
            }

            if (computer != null) {
                if (computer.getMotherboard() != null) {
                    andConditions.put("Speed", computer.getMotherboard().getMemory_Type());
                }
            }
            List<Memory> result = memoryRepository.findByDynamicAndConditions(andConditions, orConditions, Memory.class);

            return new ResponseEntity<>(result, HttpStatus.OK);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
