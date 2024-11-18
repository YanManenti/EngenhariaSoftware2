package com.example.ES2.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cpu_cooler")
@Data
public class CpuCooler {
    @Id
    private String id;
    @Indexed(unique = true)
            private String Name;
            private String Manufacturer;
            private String Model;
            private String Color;
            private String Height;
            private String Fanless;
            private String CPU_Socket;
            private String Fan_RPM;
            private String Noise_Level;
            private String Part_Numero;
            private String Specs_Number;
            private String Water_Cooled;
}
