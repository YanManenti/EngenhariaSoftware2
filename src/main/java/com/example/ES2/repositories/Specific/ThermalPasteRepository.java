package com.example.ES2.repositories.Specific;

import com.example.ES2.models.ThermalPaste;
import com.example.ES2.repositories.Generic.DynamicQueryRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ThermalPasteRepository extends MongoRepository<ThermalPaste, String>, DynamicQueryRepository<ThermalPaste> {
}
