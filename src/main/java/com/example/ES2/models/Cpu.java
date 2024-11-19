package com.example.ES2.models;

import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cpu")
@Data
public class Cpu {
    @Id
    @Indexed(unique = true)
    private String id;
    @Getter
    private String Name;
    @Getter
    private String Manufacturer;
    @Getter
    private String Series;
    @Getter
    private String Microarchitecture;
    @Getter
    private String Socket;
    @Getter
    private String TDP;
    @Getter
    private String Packaging;
    @Getter
    private String Lithography;
    @Getter
    private Integer Core_Count;
    @Getter
    private String Core_Family;
    @Getter
    private String ECC_Support;
    @Getter
    private String Includes_CPU_Cooler;
    @Getter
    private String Integrated_Graphics;
    @Getter
    private String L2_Cache;
    @Getter
    private String L3_Cache;
    @Getter
    private String Maximum_Supported_Memory;
    @Getter
    private String Part_Numero;
    @Getter
    private String Performance_Core_Boost_Clock;
    @Getter
    private String Performance_Core_Clock;
    @Getter
    private String Simultaneous_Multithreading;
}

