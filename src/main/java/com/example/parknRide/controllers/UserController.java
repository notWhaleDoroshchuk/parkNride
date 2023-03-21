package com.example.parknRide.controllers;

import com.example.parknRide.DTO.BoxDTO;
import com.example.parknRide.DTO.UserDTO;
import com.example.parknRide.DTO.UserImportRequest;
import com.example.parknRide.services.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping(path = "users/add")
    @Operation(summary = "Add user", responses = {
            @ApiResponse(description = "Success", responseCode = "200"),
            @ApiResponse(description = "Bad Request", responseCode = "400")
    })
    public void addUser(@RequestBody UserImportRequest request){
        userService.addUser(request);
    }

    @GetMapping(path = "users")
    @Operation(summary = "Get all users", responses = {
            @ApiResponse(description = "Success", responseCode = "200"),
    })
    public List<UserDTO> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping(path = "users/{email}")
    @Operation(summary = "Get user by email", responses = {
            @ApiResponse(description = "Success", responseCode = "200"),
            @ApiResponse(description = "User not found", responseCode = "404")
    })
    public UserDTO getAllUsers(@PathVariable String email){
        return userService.getUser(email);
    }

}
