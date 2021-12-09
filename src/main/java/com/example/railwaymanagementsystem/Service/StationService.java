package com.example.railwaymanagementsystem.Service;

import com.example.railwaymanagementsystem.Model.District;
import com.example.railwaymanagementsystem.Model.Station;
import com.example.railwaymanagementsystem.Model.StationDTO;
import com.example.railwaymanagementsystem.Repository.DistrictReposiory;
import com.example.railwaymanagementsystem.Repository.DivisionRepository;
import com.example.railwaymanagementsystem.Repository.StationRepository;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StationService {
    @Autowired
    StationRepository stationRepository;
    @Autowired
    DistrictReposiory districtReposiory;
    public List<Station> get_station_list(){
        return stationRepository.findAll();
    }
    public Station save_station(StationDTO stationDTO){
        Station station= new Station();
        station.setName(stationDTO.getName());
        District district = districtReposiory.findById(stationDTO.getDistrictId()).get();
        station.setDistrict(district);
        return stationRepository.save(station);
    }
}
