/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoologic.exemplar;

import com.zoologic.especie.Especie;
import java.util.ArrayList;

/**
 *
 * @author Arsenik
 */
public class Exemplar {
    private int id;
    private String nom;
    private Especie nomEspecie;
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

    public Especie getEspecie() {
        return nomEspecie;
    }

    public void setEspecie(Especie especie) {
        this.nomEspecie = especie;
    }    

    public Exemplar(int id, String nom, Especie nomEspecie) {
        this.id = id;
        this.nom = nom;
        this.nomEspecie = nomEspecie;
    }

    @Override
    public String toString() {
        return "Exemplar{" + "id=" + id + ", nom=" + nom + ", especie="+ nomEspecie + ", aliments=" + aliments + '}';
    }
    
    
}
