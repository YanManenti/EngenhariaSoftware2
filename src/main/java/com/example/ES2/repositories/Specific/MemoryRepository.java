package com.example.ES2.repositories.Specific;

import com.example.ES2.models.Memory;
import com.example.ES2.repositories.Generic.DynamicQueryRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MemoryRepository extends MongoRepository<Memory, String>, DynamicQueryRepository<Memory> {
}
