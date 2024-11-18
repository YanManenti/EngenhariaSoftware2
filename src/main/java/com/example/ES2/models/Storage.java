package com.example.ES2.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "storage")
@Data
public class Storage {
    @Id
    private String id;
    @Indexed(unique = true)
            private String Name;
            private String Manufacturer;
            private String Capacity;
            private String Type;
            private String Cache;
            private String Interface;
            private String NVME;
            private String Form_Factor;
            private String Part_Numero;
}
