package com.example.railwaymanagementsystem.Controller;

import com.example.railwaymanagementsystem.Model.Booking;
import com.example.railwaymanagementsystem.Model.BookingDTO;
import com.example.railwaymanagementsystem.Model.Train;
import com.example.railwaymanagementsystem.Service.BookingService;
import com.example.railwaymanagementsystem.Service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingController {
    @Autowired
    BookingService bookingService;

    @GetMapping("/get_booking_list")
    public List<Booking> get_booking_list(){
        return bookingService.get_booking_list();
    }
    @PostMapping("/save_booking")
    public Booking save_booking(@RequestBody BookingDTO bookingDTO){
        return bookingService.save_booking(bookingDTO);
    }

}
