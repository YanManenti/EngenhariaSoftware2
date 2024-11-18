package com.example.ES2.repositories;

import com.example.ES2.models.PowerSupply;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PowerSupplyRepository extends MongoRepository<PowerSupply, String> {
}
