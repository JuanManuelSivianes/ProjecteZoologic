/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoologic.cuidador;

import com.zoologic.especie.Especie;
import com.zoologic.tasca.Tasca;
import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 *
 * @author Arsenik
 */
public class Cuidador {
    private int Id;
    private String nom;
    private ArrayDeque<Tasca> LlistatTasques;
    private ArrayList<Especie> LlistatEspecies;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayDeque<Tasca> getLlistatTasques() {
        return LlistatTasques;
    }

    public void setLlistatTasques(ArrayDeque<Tasca> LlistatTasques) {
        this.LlistatTasques = LlistatTasques;
    }

    public ArrayList<Especie> getLlistatEspecies() {
        return LlistatEspecies;
    }

    public void setLlistatEspecies(ArrayList<Especie> LlistatEspecies) {
        this.LlistatEspecies = LlistatEspecies;
    }

    public Cuidador(int Id, String nom) {
        this.Id = Id;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Cuidador{" + "Id=" + Id + ", nom=" + nom + ", LlistatTasques=" + LlistatTasques + ", LlistatEspecies=" + LlistatEspecies + '}';
    }
    
}
