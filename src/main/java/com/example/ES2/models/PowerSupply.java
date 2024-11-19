package com.example.ES2.models;

import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "power_supply")
@Data
public class PowerSupply {
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
    private String Type;
    @Getter
    private String Wattage;
    @Getter
    private String Length;
    @Getter
    private String Modular;
    @Getter
    private String Color;
    @Getter
    private String Fanless;
    @Getter
    private Integer ATX_4Pin_Connectors;
    @Getter
    private Integer EPS_8Pin_Connectors;
    @Getter
    private String Efficiency_Rating;
    @Getter
    private String Molex_4Pin_Connectors;
    @Getter
    private Integer PCIe_12Pin_Connectors;
    @Getter
    private Integer PCIe_12_4Pin_12VHPWR_Connectors;
    @Getter
    private Integer PCIe_6Pin_Connectors;
    @Getter
    private Integer PCIe_6_2Pin_Connectors;
    @Getter
    private Integer PCIe_8Pin_Connectors;
    @Getter
    private String Part_Numero;
    @Getter
    private String SATA_Connectors;
    @Getter
    private Integer Specs_Number;
}
