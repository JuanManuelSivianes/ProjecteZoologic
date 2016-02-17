/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoologic.exemplar;

import java.util.ArrayList;

/**
 *
 * @author Arsenik
 */
public class Exemplar {
    private int id;
    private String nom;
    ArrayList<String> aliments = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<String> getAliments() {
        return aliments;
    }

    public Exemplar(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Exemplar{" + "id=" + id + ", nom=" + nom + ", aliments=" + aliments + '}';
    }
    
    
}
