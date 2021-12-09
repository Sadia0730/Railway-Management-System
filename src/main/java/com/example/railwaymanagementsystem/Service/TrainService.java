package com.example.railwaymanagementsystem.Service;

import com.example.railwaymanagementsystem.Model.Train;
import com.example.railwaymanagementsystem.Repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {
    @Autowired
    TrainRepository trainRepository;
    public List<Train> get_train_list(){
        return trainRepository.findAll();
    }
    public Train save_train(Train train){
        return trainRepository.save(train);
    }
}
