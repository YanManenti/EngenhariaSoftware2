package com.example.ES2.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "power_supply")
@Data
public class PowerSupply {
    @Id
    private String id;
    @Indexed(unique = true)
    private String Name;
            private String Manufacturer;
            private String Model;
            private String Type;
            private String Wattage;
            private String Length;
            private String Modular;
            private String Color;
            private String Fanless;
            private Integer ATX_4Pin_Connectors;
            private Integer EPS_8Pin_Connectors;
            private String Efficiency_Rating;
            private String Molex_4Pin_Connectors;
            private Integer PCIe_12Pin_Connectors;
            private Integer PCIe_12_4Pin_12VHPWR_Connectors;
            private Integer PCIe_6Pin_Connectors;
            private Integer PCIe_6_2Pin_Connectors;
            private Integer PCIe_8Pin_Connectors;
            private String Part_Numero;
            private String SATA_Connectors;
            private Integer Specs_Number;
}
