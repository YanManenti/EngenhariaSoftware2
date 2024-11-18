package com.example.ES2.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "memory")
@Data
public class Memory {
    @Id
    private String id;
    @Indexed(unique = true)
            private String Name;
            private String Manufacturer;
            private String Speed;
            private String Modules;
            private String Color;
            private String Voltage;
            private String Timing;
            private Integer CAS_Latency;
            private String ECC_Registered;
            private String First_Word_Latency;
            private String Form_Factor;
            private String Heat_Spreader;
            private String Part_Numero;
            private Integer Specs_Number;
}
