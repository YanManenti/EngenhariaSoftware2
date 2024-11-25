package com.example.ES2.repositories.Specific;

import com.example.ES2.models.PowerSupply;
import com.example.ES2.repositories.Generic.DynamicQueryRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PowerSupplyRepository extends MongoRepository<PowerSupply, String>, DynamicQueryRepository<PowerSupply> {
}
