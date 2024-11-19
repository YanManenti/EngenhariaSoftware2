package com.example.ES2.models;

import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "gpu")
@Data
public class Gpu {
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
    private String Memory;
    @Getter
    private String Interface;
    @Getter
    private String Color;
    @Getter
    private String Length;
    @Getter
    private String TDP;
    @Getter
    private String Cooling;
    @Getter
    private String Boost_Clock;
    @Getter
    private Integer Case_Expansion_Slot_Width;
    @Getter
    private String Core_Clock;
    @Getter
    private String DVIprivate_D_Dual_Link_Outputs;
    @Getter
    private Object DisplayPort_1;
    @Getter
    private Object DisplayPort_2;
    @Getter
    private String DisplayPort_Outputs;
    @Getter
    private String Effective_Memory_Clock;
    @Getter
    private String External_Power;
    @Getter
    private String Frame_Sync;
    @Getter
    private Object HDMI_2;
    @Getter
    private String HDMI_Outputs;
    @Getter
    private String Memory_Type;
    @Getter
    private String Part_Numero;
    @Getter
    private String SLI_CrossFire;
    @Getter
    private Integer Total_Slot_Width;
}
