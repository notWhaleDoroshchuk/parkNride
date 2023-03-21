package com.example.parknRide.repositories;

import com.example.parknRide.DTO.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepo extends JpaRepository<UserDTO, UUID> {
    UserDTO findByEmail(String email);
}
