package com.example.railwaymanagementsystem.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    Long no_of_seats;

    @Column(nullable = false,updatable = false)
    Date day;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "train")
    private List<Booking> booking;





}
