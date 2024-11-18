package com.example.ES2.repositories;

import com.example.ES2.models.CpuCooler;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CpuCoolerRepository extends MongoRepository<CpuCooler, String> {

}
