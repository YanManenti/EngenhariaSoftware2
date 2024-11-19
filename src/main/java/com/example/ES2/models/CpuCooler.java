package com.example.ES2.models;

import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cpu_cooler")
@Data
public class CpuCooler {
    @Id
    @Indexed(unique = true)
    private String id;
    @Getter
    private String Name;
    @Getter
    private String Manufacturer;
    @Getter
    private String Model;
    @Getter
    private String Color;
    @Getter
    private String Height;
    @Getter
    private String Fanless;
    @Getter
    private String CPU_Socket;
    @Getter
    private String Fan_RPM;
    @Getter
    private String Noise_Level;
    @Getter
    private String Part_Numero;
    @Getter
    private String Specs_Number;
    @Getter
    private String Water_Cooled;
}
