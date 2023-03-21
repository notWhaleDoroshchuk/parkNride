package com.example.parknRide.repositories;

import com.example.parknRide.DTO.BoxDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BoxRepo extends JpaRepository<BoxDTO, UUID> {
}
