package com.example.railwaymanagementsystem.Controller;
import com.example.railwaymanagementsystem.Model.District;
import com.example.railwaymanagementsystem.Service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DistrictController {
    @Autowired
    DistrictService districtService;
    @GetMapping("/get_district_list")
    public List<District> get_district_list(){
        return districtService.get_district_list();
    }
    @PostMapping("district_save")
    public List<District> district_save(@RequestBody List<District> district){
        return districtService.district_save(district);
    }
}
