package com.example.ES2.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "case")
@Data
public class Case {
    @Id
    @Indexed(unique = true)
    private String id;
    @Field("Name")
    private String Name;
    private String Manufacturer;
    private String Type;
    private String Color;
    private String Dimensions;
    private String Volume;
    private String Drive_Bays;
    private String Expansion_Slots;
    private String Front_Panel_USB;
    private String Maximum_Video_Card_Length;
    private String Motherboard_Form_Factor;
    private String Part_Numero;
    private String Power_Supply;
    private String Power_Supply_Shroud;
    private String Side_Panel;

}
