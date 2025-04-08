package com.example.gelsaprueba.dao;

import com.example.gelsaprueba.entities.Recarga;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class RecargaDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void guardar(Recarga recarga){
        entityManager.persist(recarga);
    }

}
