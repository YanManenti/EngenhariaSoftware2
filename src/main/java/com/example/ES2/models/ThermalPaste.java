package com.example.ES2.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "thermal_paste")
@Data
public class ThermalPaste {
    @Id
    private String id;
    @Indexed(unique = true)
    private String Name;
    private Double Amount;
}
