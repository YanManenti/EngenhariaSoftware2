package com.example.ES2.repositories;

import com.example.ES2.models.Processador;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProcessadorRepository  extends MongoRepository<Processador, String> {
}
