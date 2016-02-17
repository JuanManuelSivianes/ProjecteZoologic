/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoologic.exemplar;

import com.zoologic.aliment.Aliment;
import java.util.ArrayList;

/**
 *
 * @author Arsenik
 */
public class Exemplar {
    private int id;
    private String nom;
    ArrayList<Aliment> LlistatAliments;

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

    public ArrayList<Aliment> getAliments() {
        return LlistatAliments;
    }

    public Exemplar(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Exemplar{" + "id=" + id + ", nom=" + nom + ", aliments=" + LlistatAliments + '}';
    }
    
    public boolean afegirAlimentExemplar(Aliment nomAliment){
        for (int i = 0; i < LlistatAliments.size(); i++) {
            if (LlistatAliments.get(i).equals(nomAliment)) {
                System.out.println("Aquest aliment ja esta en la llista.");
                return false;
            }
        }
        LlistatAliments.add(nomAliment);
        return true;
    }
    
    public boolean eliminarAliment(Aliment nomAliment) {
        
        for (int i = 0; i < LlistatAliments.size(); i++) {
            if (LlistatAliments.get(i).equals(nomAliment)) {
                LlistatAliments.remove(nomAliment);
                return true;
            }
        }
        System.out.println("Aquest aliment no esta en la llista.");
        return false;
    }
    
}
