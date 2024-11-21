package com.example.ES2.repositories;

import com.example.ES2.models.Case;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CaseRepository extends MongoRepository<Case, String> {
    @Query("{ 'Name' : {$regex:  ?0,$options: 'i'} }")
    Page<Case> findByNameIsLikeIgnoreCase(Pageable pageable, String Name);

    Page<Case> findByName(Pageable pageable, String Name);
}

