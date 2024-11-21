package com.example.ES2.models;

import com.example.ES2.repositories.CaseRepository;
import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "case")
@Data
public class Case {
    @Id
    @Indexed(unique = true)
    private String id;
    @Getter
    @Field("Name")
    private String Name;
    @Getter
    private String Manufacturer;
    @Getter
    private String Type;
    @Getter
    private String Color;
    @Getter
    private String Dimensions;
    @Getter
    private String Volume;
    @Getter
    private String Drive_Bays;
    @Getter
    private String Expansion_Slots;
    @Getter
    private String Front_Panel_USB;
    @Getter
    private String Maximum_Video_Card_Length;
    @Getter
    private String Motherboard_Form_Factor;
    @Getter
    private String Part_Numero;
    @Getter
    private String Power_Supply;
    @Getter
    private String Power_Supply_Shroud;
    @Getter
    private String Side_Panel;

}
