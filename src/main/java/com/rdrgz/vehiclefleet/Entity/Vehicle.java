package com.rdrgz.vehiclefleet.Entity;

import jakarta.persistence.*;


public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "num_placa" , nullable = false, unique = true)
    private String numPlaca;
    private String brand;
    private String modelo;
    private Integer year;
    private Integer kilometraje;

    private String typeCombustible;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    private String img;

    public enum Estado{
        ACTIVE,
        DESACTIVE,
        EN_MATENIMIENTO
    }

}
