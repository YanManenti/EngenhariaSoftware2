package com.example.ES2.controllers;

import com.example.ES2.models.ThermalPaste;
import com.example.ES2.repositories.Specific.ThermalPasteRepository;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/thermalpaste")
public class ThermalPasteController {

    @Autowired
    ThermalPasteRepository thermalPasteRepository;

    @GetMapping
    public String exemplo(){
        return "Exemplo de /api/thermalpaste";
    }

    @GetMapping("/paged")
    public ResponseEntity<List<ThermalPaste>> pagedByKey(@RequestParam(required = false) String value) {
        try {
            Map<String, String> andConditions = new HashMap<>();
            Map<String, List<String>> orConditions = new HashMap<>();

            if(!StringUtils.isBlank(value)){
                andConditions.put("Name", value);
            }
            List<ThermalPaste> result = thermalPasteRepository.findByDynamicAndConditions(andConditions, orConditions, ThermalPaste.class);

            return new ResponseEntity<>(result, HttpStatus.OK);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

