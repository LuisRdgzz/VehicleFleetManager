package com.rdrgz.vehiclefleet.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;


public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "vehicle_id" , nullable = false)
    private Vehicle vehicle;
    private LocalDate  dateMaintenance;
    private String serviceDescription;
    private Double serviceCost;
    private LocalDate nextMaintence;

}
