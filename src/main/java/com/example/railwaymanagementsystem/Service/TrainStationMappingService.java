package com.example.railwaymanagementsystem.Service;
import com.example.railwaymanagementsystem.Model.Station;
import com.example.railwaymanagementsystem.Model.Train;
import com.example.railwaymanagementsystem.Model.TrainStationMappingDTO;
import com.example.railwaymanagementsystem.Model.Train_Station_mapping_table;
import com.example.railwaymanagementsystem.Repository.StationRepository;
import com.example.railwaymanagementsystem.Repository.TrainRepository;
import com.example.railwaymanagementsystem.Repository.TrainStationMappingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.Tuple;
import java.util.Date;
import java.util.List;

@Service
public class TrainStationMappingService {
    @Autowired
    TrainStationMappingRepository trainStationMappingRepository;
    @Autowired
    TrainRepository trainRepository;
    @Autowired
    StationRepository stationRepository;
    public List<Train_Station_mapping_table> get_map_list(){
        return trainStationMappingRepository.findAll();
    }
    public Train_Station_mapping_table save_mapping(TrainStationMappingDTO trainStationMappingDTO){
        Train_Station_mapping_table train_station_mapping_table = new Train_Station_mapping_table();
        Train train = trainRepository.findById(trainStationMappingDTO.getTrainId()).get();
        Station station = stationRepository.findById(trainStationMappingDTO.getStationId()).get();
        train_station_mapping_table.setTrain(train);
        train_station_mapping_table.setStation(station);
        train_station_mapping_table.setDateTime(trainStationMappingDTO.getDateTime());
        return trainStationMappingRepository.save(train_station_mapping_table);
    }
    public List<Train_Station_mapping_table> get_train_by_date(Date dateTime){
        System.out.println(" In Service: "+dateTime);
        return trainStationMappingRepository.get_train_by_date(dateTime);
    }
}
