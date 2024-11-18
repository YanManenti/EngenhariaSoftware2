package com.example.ES2.repositories;

import com.example.ES2.models.Cpu;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CpuRepository extends MongoRepository<Cpu, String> {
}
