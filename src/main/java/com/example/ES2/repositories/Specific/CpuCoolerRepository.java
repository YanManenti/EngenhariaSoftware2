package com.example.ES2.repositories.Specific;

import com.example.ES2.models.CpuCooler;
import com.example.ES2.repositories.Generic.DynamicQueryRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CpuCoolerRepository extends MongoRepository<CpuCooler, String>, DynamicQueryRepository<CpuCooler> {
}
