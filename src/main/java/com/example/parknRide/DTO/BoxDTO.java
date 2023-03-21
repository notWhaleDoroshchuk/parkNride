package com.example.parknRide.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

@Table(name = "boxes")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BoxDTO implements Serializable {
    @Id
    @GeneratedValue
    private UUID id;
    private Double longitude;
    private Double latitude;
    private int available;
    private ConditionEnum condition;

    public BoxDTO(Double longitude, Double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
