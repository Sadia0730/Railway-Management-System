package com.example.railwaymanagementsystem.Model;

import javax.persistence.*;
import java.sql.Time;

@Entity
public class Train_Station_mapping_table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    Long trainId;
    @Column(nullable = false)
    Long stationId;

    Time time;

}
