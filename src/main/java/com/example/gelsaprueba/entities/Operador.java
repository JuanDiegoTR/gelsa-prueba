package com.example.gelsaprueba.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Operador {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Operador() {
    }

    public Operador(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
