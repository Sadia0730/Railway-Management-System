package com.example.railwaymanagementsystem.Service;

import com.example.railwaymanagementsystem.Model.*;
import com.example.railwaymanagementsystem.Repository.BookingRepository;
import com.example.railwaymanagementsystem.Repository.DistrictReposiory;
import com.example.railwaymanagementsystem.Repository.StationRepository;
import com.example.railwaymanagementsystem.Repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookingService {
    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    DistrictReposiory districtReposiory;
    @Autowired
    TrainRepository trainRepository;
    @Autowired
    StationRepository stationRepository;
    public List<Booking> get_booking_list(){
        return bookingRepository.findAll();
    }
    public Booking save_booking(BookingDTO bookingDTO){
        Booking booking = new Booking();
        booking.setPassengerName(bookingDTO.getPassengerName());
        booking.setSeatBooked(bookingDTO.getSeatBooked());
        booking.setTravelDateTime(bookingDTO.getTravelDateTime());
        Train train = trainRepository.findById(bookingDTO.getTrainId()).get();
        booking.setTrain(train);
        Station station= stationRepository.findById(bookingDTO.getStationId()).get();
        booking.setStation(station);
        return bookingRepository.save(booking);

    }
}
