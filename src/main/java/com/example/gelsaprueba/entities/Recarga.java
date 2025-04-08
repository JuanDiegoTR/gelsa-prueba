package com.example.gelsaprueba.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Recarga {

    @Id
    @GeneratedValue
    private Long id;

    private String operador;

    private String vendedor;

    private Double valor;

    private LocalDateTime fecha;

    public Recarga() {
    }

    public Recarga(Long id, String operador, String vendedor, Double valor, LocalDateTime fecha) {
        this.id = id;
        this.operador = operador;
        this.vendedor = vendedor;
        this.valor = valor;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
