package com.example.gelsaprueba.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Vendedor {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private String documento;

}
