package com.example.ES2.repositories;

import com.example.ES2.models.Motherboard;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MotherboardRepository extends MongoRepository<Motherboard, String> {
}
