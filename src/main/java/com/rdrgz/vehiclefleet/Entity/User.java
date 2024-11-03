package com.rdrgz.vehiclefleet.Entity;

import jakarta.persistence.*;


public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Rol rol;

    public enum Rol{
        MANAGER,
        EMPLOYEE
    }


}
