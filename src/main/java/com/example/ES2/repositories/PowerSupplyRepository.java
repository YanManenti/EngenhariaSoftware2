package com.example.ES2.repositories;

import com.example.ES2.models.PowerSupply;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface PowerSupplyRepository extends MongoRepository<PowerSupply, String> {
    @Query("{ ?0 : {$regex:  ?1,$options: 'i'} }")
    Page<PowerSupply> pagedFindByKeyIgnoreCasing(Pageable pageable, String key, String value);
}
