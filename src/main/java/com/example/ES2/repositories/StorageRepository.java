package com.example.ES2.repositories;

import com.example.ES2.models.Storage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StorageRepository extends MongoRepository<Storage, String> {
}
