package com.example.ES2.controllers;

import com.example.ES2.models.Storage;
import com.example.ES2.repositories.Specific.StorageRepository;
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
@RequestMapping("/api/storage")
public class StorageController {

    @Autowired
    StorageRepository storageRepository;

    @GetMapping
    public String exemplo() {
        return "Exemplo de /api/storage";
    }

    @PostMapping("/all")
    public ResponseEntity<List<Storage>> allByKey(@RequestParam(required = false) String value) {
        try {
            Map<String, String> andConditions = new HashMap<>();
            Map<String, List<String>> orConditions = new HashMap<>();

            if (!StringUtils.isBlank(value)) {
                andConditions.put("Name", value);
            }
            List<Storage> result = storageRepository.findByDynamicAndConditions(andConditions, orConditions, Storage.class);

            return new ResponseEntity<>(result, HttpStatus.OK);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
