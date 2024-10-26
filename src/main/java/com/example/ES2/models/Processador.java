package com.example.ES2.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "processadores")
@Data
public class Processador {
    @Id
    private String id;
    @Indexed(unique = true)
    private String nome;
    private String marca;
    private Integer cores;
    private String socket;
}
