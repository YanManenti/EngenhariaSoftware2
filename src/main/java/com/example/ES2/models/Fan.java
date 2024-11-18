package com.example.ES2.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fan")
@Data
public class Fan {
    @Id
    private String id;
    @Indexed(unique = true)
            private Object Airflow;
            private String Color;
            private String Name;
            private Object Noise_Level;
            private Boolean PWM;
            private Object Rpm;
            private Integer Size;
}
