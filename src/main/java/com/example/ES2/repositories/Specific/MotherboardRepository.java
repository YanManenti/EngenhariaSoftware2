package com.example.ES2.repositories.Specific;

import com.example.ES2.models.Motherboard;
import com.example.ES2.repositories.Generic.DynamicQueryRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MotherboardRepository extends MongoRepository<Motherboard, String>, DynamicQueryRepository<Motherboard> {
}
