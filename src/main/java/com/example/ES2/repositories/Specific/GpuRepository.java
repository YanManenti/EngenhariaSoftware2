package com.example.ES2.repositories.Specific;

import com.example.ES2.models.Gpu;
import com.example.ES2.repositories.Generic.DynamicQueryRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GpuRepository extends MongoRepository<Gpu, String>, DynamicQueryRepository<Gpu> {
}
