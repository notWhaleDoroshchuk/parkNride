package com.example.parknRide.controllers;

import com.example.parknRide.DTO.BoxActionRequest;
import com.example.parknRide.DTO.BoxDTO;
import com.example.parknRide.DTO.BoxImportRequest;
import com.example.parknRide.services.BoxService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Box Controller")
public class BoxController {
    @Autowired
    BoxService boxService;
    @PostMapping(path = "boxes/add")
    @Operation(summary = "Add boxes to map", responses = {
            @ApiResponse(description = "Success", responseCode = "200"),
            @ApiResponse(description = "Bad Request", responseCode = "400")
    })
    public void importBox(@RequestBody BoxImportRequest request){
        boxService.addBox(new BoxDTO(request.getLongitude(), request.getLatitude()));
    }

    @GetMapping(path = "boxes")
    @Operation(summary = "Get Boxes", responses = {
            @ApiResponse(description = "Success", responseCode = "200"),
    })
    public List<BoxDTO> getAllBoxes(){
        return boxService.getAllBoxes();
    }

//    @PostMapping(path = "boxes/open")
//    @Operation(summary = "Action with box", responses = {
//            @ApiResponse(description = "Success", responseCode = "200"),
//            @ApiResponse(description = "Bad Request", responseCode = "400")
//    })
//    public void OpenBox(@RequestBody BoxActionRequest){
//
//    }
}
