package com.example.ES2.repositories;

import com.example.ES2.models.Fan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface FanRepository extends MongoRepository<Fan, String> {
    @Query("{ ?0 : {$regex:  ?1,$options: 'i'} }")
    Page<Fan> pagedFindByKeyIgnoreCasing(Pageable pageable, String key, String value);
}
