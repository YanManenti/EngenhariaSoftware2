package com.example.ES2.repositories;

import com.example.ES2.models.Gpu;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GpuRepository extends MongoRepository<Gpu, String> {
}
