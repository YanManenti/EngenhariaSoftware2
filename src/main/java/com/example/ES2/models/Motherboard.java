package com.example.ES2.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "motherboard")
@Data
public class Motherboard {

    @Id
    private String id;
    @Indexed(unique = true)
    private String Name;
    private String Manufacturer;
    private String Chipset;
    private String Color;
    private Object M;
    private String Form_Factor;
    private Integer Half_Mini_PCIe_Slots;
    private String Memory_Max;
    private String Memory_Slots;
    private String Memory_Speed;
    private String Memory_Type;
    private Integer Mini_PCI_mSATA_Slots;
    private Integer Mini_PCIe_Slots;
    private String Onboard_Ethernet;
    private String Onboard_Video;
    private Integer PCI_Slots;
    private Integer PCIe_x16_Slots;
    private Integer PCIe_x1_Slots;
    private Integer PCIe_x4_Slots;
    private Integer PCIe_x8_Slots;
    private String Part_Numero;
    private String RAID_Support;
    private Object SATA_6;
    private String Socket_CPU;
    private String Supports_ECC;
    private Object USB_2;
    private Object USB_3;
    private String Wireless_Networking;
    private Integer mSATA_Slots;
}