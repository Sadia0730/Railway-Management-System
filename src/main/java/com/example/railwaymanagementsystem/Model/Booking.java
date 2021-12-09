package com.example.railwaymanagementsystem.Model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "train_id", nullable = false)
    Train train;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "station_id", nullable = false)
    Station station;
    private String passengerName;
    private Long seatBooked;
    @Column(nullable = false,updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    Date travelDateTime;
}
