package com.example.ES2.repositories.Specific;

import com.example.ES2.models.Cpu;
import com.example.ES2.repositories.Generic.DynamicQueryRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CpuRepository extends MongoRepository<Cpu, String>, DynamicQueryRepository<Cpu> {
}
