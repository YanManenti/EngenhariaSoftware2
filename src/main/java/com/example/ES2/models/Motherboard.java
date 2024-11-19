package com.example.ES2.models;

import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "motherboard")
@Data
public class Motherboard {

    @Id
    @Indexed(unique = true)
    private String id;
    @Getter
    private String Name;
    @Getter
    private String Manufacturer;
    @Getter
    private String Chipset;
    @Getter
    private String Color;
    @Getter
    private Object M;
    @Getter
    private String Form_Factor;
    @Getter
    private Integer Half_Mini_PCIe_Slots;
    @Getter
    private String Memory_Max;
    @Getter
    private String Memory_Slots;
    @Getter
    private String Memory_Speed;
    @Getter
    private String Memory_Type;
    @Getter
    private Integer Mini_PCI_mSATA_Slots;
    @Getter
    private Integer Mini_PCIe_Slots;
    @Getter
    private String Onboard_Ethernet;
    @Getter
    private String Onboard_Video;
    @Getter
    private Integer PCI_Slots;
    @Getter
    private Integer PCIe_x16_Slots;
    @Getter
    private Integer PCIe_x1_Slots;
    @Getter
    private Integer PCIe_x4_Slots;
    @Getter
    private Integer PCIe_x8_Slots;
    @Getter
    private String Part_Numero;
    @Getter
    private String RAID_Support;
    @Getter
    private Object SATA_6;
    @Getter
    private String Socket_CPU;
    @Getter
    private String Supports_ECC;
    @Getter
    private Object USB_2;
    @Getter
    private Object USB_3;
    @Getter
    private String Wireless_Networking;
    @Getter
    private Integer mSATA_Slots;
}