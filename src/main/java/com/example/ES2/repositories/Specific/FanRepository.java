package com.example.ES2.repositories.Specific;

import com.example.ES2.models.Fan;
import com.example.ES2.repositories.Generic.DynamicQueryRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FanRepository extends MongoRepository<Fan, String>, DynamicQueryRepository<Fan> {
}
