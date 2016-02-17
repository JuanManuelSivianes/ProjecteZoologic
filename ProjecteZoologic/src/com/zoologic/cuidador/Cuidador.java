package com.zoologic.cuidador;

import com.zoologic.especie.Especie;
import com.zoologic.tasca.Tasca;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Sivi,Xavier,Jesus,Toni
 */
public class Cuidador {

    private int id;
    private String nom;
    private ArrayDeque<Tasca> LlistatTasques;
    private ArrayList<Especie> LlistatEspecies;

    /**
     * Obtenir el valor assignat a l'atribut "id".
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Assigna un valor a l'atribut "id".
     * @param id és el codi d'identificació del cuidador.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtenir el valor assignat a l'atribut "nom".
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     * Assigna un valor a l'atribut "nom".
     * @param nom és el nom del cuidador.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * 
     * @return 
     */
    public ArrayDeque<Tasca> getLlistatTasques() {
        return LlistatTasques;
    }

    /**
     * 
     * @return 
     */
    public ArrayList<Especie> getLlistatEspecies() {
        return LlistatEspecies;
    }

    /**
     * És el constructor dels atributs id i nom.
     * @param id és el codi d'identificació del cuidador.
     * @param nom és el nom del cuidador.
     */
    public Cuidador(int id, String nom) {
        this.id = id;
        this.nom = nom;
        LlistatTasques = new ArrayDeque<>();
        LlistatEspecies = new ArrayList<>();
    }

    /**
     * És el mètode que retorna una cadena que representa l'objecte Cuidador.
     * @return 
     */
    @Override
    public String toString() {
        return "Cuidador{" + "id=" + id + ", nom=" + nom + '}';
    }

    /**
     * Aquest metode afegeix a l'ArrayList de LlistatTasques el nom de la tasca.
     * @param nomTasca és el nom de la tasca del cuidador.
     * @return 
     */
    public boolean afegirTasca(Tasca nomTasca) {

        Iterator<Tasca> it = LlistatTasques.iterator();
        while (it.hasNext()) {
            Tasca i = it.next();
            if (i.getDescripcio().equals(nomTasca.getDescripcio())) {
                System.out.println("Aquesta tasca ja esta en la llista.");
                return false;
            }
        }
        LlistatTasques.add(nomTasca);
        return true;
    }

    /**
     * Aquest metode elimina a l'ArrayList de LlistatTasques el nom de la tasca.
     * @param nomTasca és el nom de la tasca del cuidador.
     * @return 
     */
    public boolean eliminarTasca(Tasca nomTasca) {

        Iterator<Tasca> it = LlistatTasques.iterator();
        while (it.hasNext()) {
            Tasca i = it.next();
            if (i.getDescripcio().equals(nomTasca.getDescripcio())) {
                LlistatTasques.remove(nomTasca);
                return true;
            }
        }
        System.out.println("Aquesta tasca no esta en la llista.");
        return false;
    }

    /**
     * Aquest metode afegeix a l'ArrayList de LlistaEspecies el nom del cuidador.
     * @param nomEspecie és el nom de l'especie que té cura un cuidador.
     * @return 
     */
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