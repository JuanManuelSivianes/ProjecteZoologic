/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoologic.exemplar;

<<<<<<< HEAD
import com.zoologic.especie.Especie;
=======
import com.zoologic.aliment.Aliment;
>>>>>>> origin/master
import java.util.ArrayList;

/**
 *
 * @author Arsenik
 */
public class Exemplar {
    private int id;
    private String nom;
<<<<<<< HEAD
    private Especie nomEspecie;
    ArrayList<String> aliments = new ArrayList<>();
=======
    ArrayList<Aliment> LlistatAliments;
>>>>>>> origin/master

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
