package com.example.gelsaprueba.beans;

import com.example.gelsaprueba.dao.RecargaDAO;
import com.example.gelsaprueba.entities.Recarga;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.time.LocalDateTime;

@ManagedBean
@ViewScoped
public class RecargaBean implements Serializable {

    @EJB
    private RecargaDAO recargaDAO;
    private String operador;
    private String vendador;
    private Double valor;

    public void registrarRecarga(){
        Recarga recarga = new Recarga();
        recarga.setOperador(operador);
        recarga.setVendedor(vendador);
        recarga.setFecha(LocalDateTime.now());
        recarga.setValor(valor);
        recargaDAO.guardar(recarga);
        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Recarga registrada exitosamente."));
        operador = "";
        vendador = "";
        valor = null;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getVendador() {
        return vendador;
    }

    public void setVendador(String vendador) {
        this.vendador = vendador;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
