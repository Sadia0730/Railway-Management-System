package com.example.railwaymanagementsystem.Controller;

import com.example.railwaymanagementsystem.Model.Station;
import com.example.railwaymanagementsystem.Model.StationDTO;
import com.example.railwaymanagementsystem.Model.Train;
import com.example.railwaymanagementsystem.Service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StationController {
    @Autowired
    StationService stationService;
    @GetMapping("/get_station_list")
    public List<Station> get_station_list(){
        return stationService.get_station_list();
    }
    @PostMapping("/save_station")
    public Station save_station(@RequestBody StationDTO stationDTO){
        return stationService.save_station(stationDTO);
    }


}
