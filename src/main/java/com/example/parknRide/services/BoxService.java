package com.example.parknRide.services;

import com.example.parknRide.DTO.BoxDTO;
import com.example.parknRide.repositories.BoxRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;

@Service
public class BoxService {
    @Autowired
    BoxRepo boxRepo;

    public void addBox(BoxDTO box) {
        boxRepo.save(box);
    }

    public List<BoxDTO> getAllBoxes(){
        return boxRepo.findAll();
    }
}
