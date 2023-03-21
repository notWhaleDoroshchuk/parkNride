package com.example.parknRide.services;

import com.example.parknRide.DTO.UserDTO;
import com.example.parknRide.DTO.UserImportRequest;
import com.example.parknRide.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public void addUser(UserImportRequest user) {
        userRepo.save(new UserDTO(user.getEmail(), user.getPassword()));
    }

    public List<UserDTO> getAllUsers(){
        return userRepo.findAll();
    }

    public UserDTO getUser(String email){
        return userRepo.findByEmail(email);
    }
}
