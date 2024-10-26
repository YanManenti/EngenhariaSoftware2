package com.example.ES2.repositories;

import com.example.ES2.models.PlacaMae;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlacaMaeRepository  extends MongoRepository<PlacaMae, String> {
}
