package com.example.ES2.controllers;

import com.example.ES2.models.Computer;
import com.example.ES2.models.Gpu;
import com.example.ES2.repositories.Specific.GpuRepository;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/gpu")
public class GpuController {

    @Autowired
    GpuRepository gpuRepository;

    @GetMapping
    public String exemplo() {
        return "Exemplo de /api/gpu";
    }

    @GetMapping("/paged")
    public ResponseEntity<List<Gpu>> pagedByKey(@RequestParam(required = false) String value, @RequestBody Computer computer) {
        try {
            Map<String, String> andConditions = new HashMap<>();
            Map<String, List<String>> orConditions = new HashMap<>();

            if (!StringUtils.isBlank(value)) {
                andConditions.put("Name", value);
            }

            if (computer != null) {
                if (computer.getMotherboard() != null) {
                    orConditions.put("Interface", new ArrayList<>());
                    if (computer.getMotherboard().getPCIe_x16_Slots() > 0) {
                        orConditions.get("Interface").add("PCIe x16");
                    }
                    if (computer.getMotherboard().getPCIe_x8_Slots() > 0) {
                        orConditions.get("Interface").add("PCIe x8");
                    }
                    if (computer.getMotherboard().getPCIe_x4_Slots() > 0) {
                        orConditions.get("Interface").add("PCIe x4");
                    }
                    if (computer.getMotherboard().getPCIe_x1_Slots() > 0) {
                        orConditions.get("Interface").add("PCIe x1");
                    }
                }
            }

            List<Gpu> result = gpuRepository.findByDynamicAndConditions(andConditions, orConditions, Gpu.class);

            return new ResponseEntity<>(result, HttpStatus.OK);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
