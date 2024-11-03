package com.rdrgz.vehiclefleet.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;


public class VehicleUse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "" , nullable = false)
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "" , nullable = false)
    private User user;

    private LocalDateTime fechaHoraUso;
    private Integer kilometrajeInicial;
    private Integer kilometraFinal;
    private String motivoUso;

}
