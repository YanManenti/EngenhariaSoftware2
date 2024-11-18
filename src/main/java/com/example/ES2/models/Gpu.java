package com.example.ES2.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "gpu")
@Data
public class Gpu {
    @Id
    private String id;
    @Indexed(unique = true)
    private String Name;
            private String Manufacturer;
            private String Chipset;
            private String Memory;
            private String Interface;
            private String Color;
            private String Length;
            private String TDP;
            private String Cooling;
            private String Boost_Clock;
            private Integer Case_Expansion_Slot_Width;
            private String Core_Clock;
            private String DVIprivate_D_Dual_Link_Outputs;
            private Object DisplayPort_1;
            private Object DisplayPort_2;
            private String DisplayPort_Outputs;
            private String Effective_Memory_Clock;
            private String External_Power;
            private String Frame_Sync;
            private Object HDMI_2;
            private String HDMI_Outputs;
            private String Memory_Type;
            private String Part_Numero;
            private String SLI_CrossFire;
            private Integer Total_Slot_Width;
}
