package com.example.ES2.models;

import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "memory")
@Data
public class Memory {
    @Id
    @Indexed(unique = true)
    private String id;
    @Getter
    private String Name;
    @Getter
    private String Manufacturer;
    @Getter
    private String Speed;
    @Getter
    private String Modules;
    @Getter
    private String Color;
    @Getter
    private String Voltage;
    @Getter
    private String Timing;
    @Getter
    private Integer CAS_Latency;
    @Getter
    private String ECC_Registered;
    @Getter
    private String First_Word_Latency;
    @Getter
    private String Form_Factor;
    @Getter
    private String Heat_Spreader;
    @Getter
    private String Part_Numero;
    @Getter
    private Integer Specs_Number;
}
