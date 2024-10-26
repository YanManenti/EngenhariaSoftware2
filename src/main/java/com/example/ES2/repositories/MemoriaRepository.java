package com.example.ES2.repositories;

import com.example.ES2.models.Memoria;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MemoriaRepository extends MongoRepository<Memoria, String> {
}
