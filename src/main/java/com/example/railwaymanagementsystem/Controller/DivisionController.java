package com.example.railwaymanagementsystem.Controller;

import com.example.railwaymanagementsystem.Model.Division;
import com.example.railwaymanagementsystem.Service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DivisionController {
    @Autowired
    DivisionService divisionService;
    @GetMapping("/get_division_list")
    public List<Division> get_division_list(){
        return divisionService.get_division_list();
    }
    @PostMapping("/save_division")
    public Division save_division(@RequestBody Division division){
        return divisionService.save_division(division);
    }
}
