package com.example.ES2.controllers;

import com.example.ES2.models.Computer;
import com.example.ES2.models.CpuCooler;
import com.example.ES2.repositories.Specific.CpuCoolerRepository;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/cpucooler")
public class CpuCoolerController {

    @Autowired
    private CpuCoolerRepository cpuCoolerRepository;

    @GetMapping
    public String exemplo() {
        return "Exemplo de /api/cpucooler";
    }

    @PostMapping("/all")
    public ResponseEntity<List<CpuCooler>> allByKey(@RequestParam(required = false) String value, @RequestBody Computer computer) {
        try {
            Map<String, String> andConditions = new HashMap<>();
            Map<String, List<String>> orConditions = new HashMap<>();

            if (!StringUtils.isBlank(value)) {
                andConditions.put("Name", value);
            }

            if (computer != null) {
                if (computer.getCpu() != null) {
                    andConditions.put("CPU_Socket", computer.getCpu().getSocket());
                } else if (computer.getMotherboard() != null) {
                    andConditions.put("CPU_Socket", computer.getMotherboard().getSocket_CPU());
                }
            }
            List<CpuCooler> result = cpuCoolerRepository.findByDynamicAndConditions(andConditions, orConditions, CpuCooler.class);

            return new ResponseEntity<>(result, HttpStatus.OK);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
