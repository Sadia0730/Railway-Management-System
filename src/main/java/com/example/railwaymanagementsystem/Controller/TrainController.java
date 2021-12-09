package com.example.railwaymanagementsystem.Controller;

import com.example.railwaymanagementsystem.Model.Train;
import com.example.railwaymanagementsystem.Service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class TrainController {
    @Autowired
    TrainService trainService;

    @GetMapping("/get_train_list")
    public List<Train> get_train_list(){
        return trainService.get_train_list();
    }
    @PostMapping("/save_train")
    public Train save_train(@RequestBody Train train){
        return trainService.save_train(train);
    }



}
