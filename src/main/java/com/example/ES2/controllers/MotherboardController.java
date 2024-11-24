package com.example.ES2.controllers;

import com.example.ES2.models.Computer;
import com.example.ES2.models.Motherboard;
import com.example.ES2.repositories.Specific.MotherboardRepository;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/motherboard")
public class MotherboardController {

    @Autowired
    private MotherboardRepository motherboardRepository;

    @GetMapping
    public String exemplo() {
        return "Exemplo de /api/motherboard";
    }

    @GetMapping("/paged")
    public ResponseEntity<List<Motherboard>> pagedByKey(@RequestParam(required = false) String value, @RequestBody Computer computer) {
        try {
            Map<String, String> andConditions = new HashMap<>();
            Map<String, List<String>> orConditions = new HashMap<>();

            if (!StringUtils.isBlank(value)) {
                andConditions.put("Name", value);
            }

            if (computer != null) {
                if (computer.getCpu() != null) {
                    andConditions.put("Socket_CPU", computer.getCpu().getSocket());
                }
                if (computer.getMemory() != null) {
                    if (computer.getMemory().getSpeed().contains("DDR5")) {
                        andConditions.put("Memory_Tpe", "DDR5");
                    }
                    if (computer.getMemory().getSpeed().contains("DDR4")) {
                        andConditions.put("Memory_Tpe", "DDR4");
                    }
                    if (computer.getMemory().getSpeed().contains("DDR3")) {
                        andConditions.put("Memory_Tpe", "DDR3");
                    }
                    if (computer.getMemory().getSpeed().contains("DDR2")) {
                        andConditions.put("Memory_Tpe", "DDR2");
                    }
                }
            }
            List<Motherboard> result = motherboardRepository.findByDynamicAndConditions(andConditions, orConditions, Motherboard.class);

            return new ResponseEntity<>(result, HttpStatus.OK);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
