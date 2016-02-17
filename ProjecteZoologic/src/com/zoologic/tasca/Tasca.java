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
    private String descripcio;
    private String observacions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public String getObservacions() {
        return observacions;
    }

    public void setObservacions(String observacions) {
        this.observacions = observacions;
    }

    public Tasca(int id, String descripcio) {
        this.id = id;
        this.descripcio = descripcio;
    }

    @Override
    public String toString() {
        return "Tasca{" + "id=" + id + ", descripcio=" + descripcio + ", observacions=" + observacions + '}';
    }
    
    
}
