package com.example.parknRide.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BoxActionRequest {
    private UUID boxId;
    private UUID userID;
    private Integer bikesCount;
    private Instant rentTime;
}
