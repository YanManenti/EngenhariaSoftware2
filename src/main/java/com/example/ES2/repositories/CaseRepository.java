package com.example.ES2.repositories;

import com.example.ES2.models.Case;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CaseRepository extends MongoRepository<Case, String> {
}
