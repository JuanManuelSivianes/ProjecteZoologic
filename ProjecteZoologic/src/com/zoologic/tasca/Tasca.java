/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoologic.tasca;

/**
 *
 * @author Arsenik
 */
public class Tasca {
    private int id;
    private String descriocio;
    private String observacions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescriocio() {
        return descriocio;
    }

    public void setDescriocio(String descriocio) {
        this.descriocio = descriocio;
    }

    public String getObservacions() {
        return observacions;
    }

    public void setObservacions(String observacions) {
        this.observacions = observacions;
    }

    public Tasca(int id, String descriocio) {
        this.id = id;
        this.descriocio = descriocio;
    }

    @Override
    public String toString() {
        return "Tasca{" + "id=" + id + ", descriocio=" + descriocio + ", observacions=" + observacions + '}';
    }
    
    
}
