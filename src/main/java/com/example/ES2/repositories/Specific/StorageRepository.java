package com.example.ES2.repositories.Specific;

import com.example.ES2.models.Storage;
import com.example.ES2.repositories.Generic.DynamicQueryRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StorageRepository extends MongoRepository<Storage, String>, DynamicQueryRepository<Storage> {
}
