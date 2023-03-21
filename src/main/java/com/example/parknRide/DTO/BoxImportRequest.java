package com.example.parknRide.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BoxImportRequest {
    private Double longitude;
    private Double latitude;
}
