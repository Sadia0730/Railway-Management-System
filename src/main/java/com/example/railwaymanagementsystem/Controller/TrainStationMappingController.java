package com.example.railwaymanagementsystem.Controller;

import com.example.railwaymanagementsystem.Model.*;
import com.example.railwaymanagementsystem.Service.StationService;
import com.example.railwaymanagementsystem.Service.TrainStationMappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Tuple;
import java.util.Date;
import java.util.List;

@RestController
public class TrainStationMappingController {
    @Autowired
    TrainStationMappingService trainStationMappingService;
    @GetMapping("/get_map_list")
    public List<Train_Station_mapping_table> get_map_list(){
        return trainStationMappingService.get_map_list();
    }
    @PostMapping("/save_map")
    public Train_Station_mapping_table save_map(@RequestBody TrainStationMappingDTO trainStationMappingDTO){
        return trainStationMappingService.save_mapping(trainStationMappingDTO);
    }
    @GetMapping("/search/{dateTime}")
    public List<Train_Station_mapping_table> get_train_by_date(@PathVariable("dateTime") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date dateTime){
        System.out.println("In Controller"+dateTime);
        Date date = new Date(String.valueOf(dateTime));
       return trainStationMappingService.get_train_by_date(dateTime);
    }
}
