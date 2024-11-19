package com.example.ES2.models;

import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fan")
@Data
public class Fan {
    @Id
    @Indexed(unique = true)
    private String id;
    @Getter
    private Object Airflow;
    @Getter
    private String Color;
    @Getter
    private String Name;
    @Getter
    private Object Noise_Level;
    @Getter
    private Boolean PWM;
    @Getter
    private Object Rpm;
    @Getter
    private Integer Size;
}
