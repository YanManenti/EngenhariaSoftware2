package com.example.ES2.repositories.Generic;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class DynamicQueryRepositoryImpl<T> implements DynamicQueryRepository<T> {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Setter
    private Class<T> entityClass;

    @Override
    public List<T> findByDynamicAndConditions(Map<String, String> andConditions, Map<String, List<String>> orConditions, Class<T> entityClass) {
        this.setEntityClass(entityClass);
        return find(andConditions, orConditions);
    }

    public List<T> find(Map<String, String> andConditions, Map<String, List<String>> orConditions) {
        if (entityClass == null) {
            throw new IllegalStateException("Entity class must be set before calling this method.");
        }

        // AND conditions
        List<Criteria> andCriteriaList = andConditions.entrySet().stream()
                .map(entry -> Criteria.where(entry.getKey()).regex(entry.getValue(), "i"))
                .toList();

        // OR conditions
        List<Criteria> orCriteriaList = orConditions.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream()
                        .map(value -> Criteria.where(entry.getKey()).regex(value, "i")))
                .toList();

        Criteria finalCriteria = new Criteria();

        if (!andCriteriaList.isEmpty()) {
            finalCriteria = finalCriteria.andOperator(andCriteriaList.toArray(new Criteria[0]));
        }
        if (!orCriteriaList.isEmpty()) {
            finalCriteria = finalCriteria.orOperator(orCriteriaList.toArray(new Criteria[0]));
        }

        // Criando a consulta sem paginação
        Query query = new Query(finalCriteria);

        // Executa a consulta sem limitações
        return mongoTemplate.find(query, entityClass);
    }

}
