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
import java.util.Iterator;

/**
 *
 * @author Arsenik
 */
public class Cuidador {

    private int id;
    private String nom;
    private ArrayDeque<Tasca> LlistatTasques;
    private ArrayList<Especie> LlistatEspecies;

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

    public ArrayDeque<Tasca> getLlistatTasques() {
        return LlistatTasques;
    }

    public ArrayList<Especie> getLlistatEspecies() {
        return LlistatEspecies;
    }

    public Cuidador(int id, String nom) {
        this.id = id;
        this.nom = nom;
        LlistatTasques = new ArrayDeque<>();
        LlistatEspecies = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Cuidador{" + "id=" + id + ", nom=" + nom + '}';
    }

    public boolean afegirTasca(Tasca nomTasca) {

        Iterator<Tasca> it = LlistatTasques.iterator();
        while (it.hasNext()) {
            Tasca i = it.next();
            if (i.getDescriocio().equals(nomTasca.getDescriocio())) {
                System.out.println("Aquesta tasca ja esta en la llista.");
                return false;
            }
        }
        LlistatTasques.add(nomTasca);
        return true;
    }

    public boolean eliminarTasca(Tasca nomTasca) {

        Iterator<Tasca> it = LlistatTasques.iterator();
        while (it.hasNext()) {
            Tasca i = it.next();
            if (i.getDescriocio().equals(nomTasca.getDescriocio())) {
                LlistatTasques.remove(nomTasca);
                return true;
            }
        }
        System.out.println("Aquesta tasca no esta en la llista.");
        return false;
    }

    public boolean afegirEspecie(Especie nomEspecie) {

        for (int i = 0; i < LlistatEspecies.size(); i++) {
            if (LlistatEspecies.get(i).equals(nomEspecie)) {
                System.out.println("Aquesta especie ja esta en la llista.");
                return false;
            }
        }
        LlistatEspecies.add(nomEspecie);
        return true;
    }

    public boolean eliminarEspecie(Especie nomEspecie) {
        
        for (int i = 0; i < LlistatEspecies.size(); i++) {
            if (LlistatEspecies.get(i).equals(nomEspecie)) {
                LlistatEspecies.remove(nomEspecie);
                return true;
            }
        }
        System.out.println("Aquesta especie no esta en la llista.");
        return false;
    }
}
