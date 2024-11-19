package com.example.ES2.models;

import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "storage")
@Data
public class Storage {
    @Id
    @Indexed(unique = true)
    private String id;
    @Getter
    private String Name;
    @Getter
    private String Manufacturer;
    @Getter
    private String Capacity;
    @Getter
    private String Type;
    @Getter
    private String Cache;
    @Getter
    private String Interface;
    @Getter
    private String NVME;
    @Getter
    private String Form_Factor;
    @Getter
    private String Part_Numero;
}
