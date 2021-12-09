package com.example.railwaymanagementsystem.Service;

import com.example.railwaymanagementsystem.Model.Division;
import com.example.railwaymanagementsystem.Repository.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionService {
    @Autowired
    DivisionRepository divisionRepository;

    public List<Division> get_division_list(){
        return divisionRepository.findAll();
    }
    public Division save_division(Division division){
        return divisionRepository.save(division);
    }
}
