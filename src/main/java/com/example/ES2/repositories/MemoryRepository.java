package com.example.ES2.repositories;

import com.example.ES2.models.Memory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MemoryRepository extends MongoRepository<Memory, String> {
}
