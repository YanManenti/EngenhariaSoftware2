package com.example.ES2.repositories;

import com.example.ES2.models.Fan;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FanRepository extends MongoRepository<Fan, String> {
}
