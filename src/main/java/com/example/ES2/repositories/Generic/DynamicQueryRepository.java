package com.example.ES2.repositories.Generic;

import java.util.List;
import java.util.Map;

public interface DynamicQueryRepository<T> {
    List<T> findByDynamicAndConditions(Map<String, String> andConditions, Map<String, List<String>> orConditions, Class<T> entityClass);
}
