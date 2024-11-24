package com.example.ES2.repositories.Specific;

import com.example.ES2.models.Case;
import com.example.ES2.repositories.Generic.DynamicQueryRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CaseRepository extends MongoRepository<Case, String>, DynamicQueryRepository<Case> {
}
