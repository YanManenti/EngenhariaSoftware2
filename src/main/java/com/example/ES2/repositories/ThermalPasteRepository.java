package com.example.ES2.repositories;

import com.example.ES2.models.ThermalPaste;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ThermalPasteRepository extends MongoRepository<ThermalPaste, String> {
}
