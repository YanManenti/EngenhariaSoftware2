package com.example.ES2.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cpu")
@Data
public class Cpu {
    @Id
    private String id;
    @Indexed(unique = true)
    private String Name;
    private String Manufacturer;
    private String Series;
    private String Microarchitecture;
    private String Socket;
    private String TDP;
    private String Packaging;
    private String Lithography;
    private Integer Core_Count;
    private String Core_Family;
    private String ECC_Support;
    private String Includes_CPU_Cooler;
    private String Integrated_Graphics;
    private String L2_Cache;
    private String L3_Cache;
    private String Maximum_Supported_Memory;
    private String Part_Numero;
    private String Performance_Core_Boost_Clock;
    private String Performance_Core_Clock;
    private String Simultaneous_Multithreading;
}

