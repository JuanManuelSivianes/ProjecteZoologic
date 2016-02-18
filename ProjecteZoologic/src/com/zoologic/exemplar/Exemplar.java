package com.zoologic.exemplar;

import com.zoologic.especie.Especie;
import com.zoologic.aliment.Aliment;
import java.util.ArrayList;

/**
 *
 * @author Sivi, Xavier, Jesus, Toni
 */
public class Exemplar {
    private int id;
    private static int contadorExemplars = 1;
    private String nom;
    private Especie nomEspecie;
    private ArrayList<Aliment> LlistatAliments;

    /**
     * Obtenir el valor assignat a l'atribut "id".
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * Assignam un valor a l'atribut "id".
     * @param id és el codi d'identificació de l'exemplar.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtenir el valor assignat a l'atribut "nom"
     * @return 
     */
    public String getNom() {
        return nom;
    }

    /**
     * Assignam el valor assignat a l'atribut "nom"
     * @param nom és el nom que reb l'exemplar
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Obteir els valor assignats a l'atribut "LlistaAliments".
     * @return 
     */
    public ArrayList<Aliment> getAliments() {
        return LlistatAliments;
    }

    /**
     * Obtenir el valor assigntat a l'atribut "nomEspecie".
     * @return 
     */
    public Especie getEspecie() {
        return nomEspecie;
    }

    /**
     * Assignam un valor a l'atribut "nomEspecie".
     * @param especie és el nom de l'especie de la cual pertany l'exemplar.
     */
    public void setEspecie(Especie especie) {
        this.nomEspecie = especie;
    }    


    /**
     * És el constructor dels atributs id, nom i nomEspecie.
     * @param id és el codi d'identificació de l'exemplar.
     * @param nom és el nom que té un exemplar.
     * @param nomEspecie és el nom de l'especie que té l'exemplar.
     */
    public Exemplar(int id, String nom, Especie nomEspecie) {
        this.id = id;
        this.nom = nom;
        this.nomEspecie = nomEspecie;
        this.LlistatAliments = new ArrayList<>();
    }

    /**
     * És el mètode que retorna una cadena que representa l'objecte Especie.
     * @return 
     */
    @Override
    public String toString() {
        return "Exemplar{" + "id=" + id + ", nom=" + nom + ", especie="+ nomEspecie + ", aliments=" + LlistatAliments + '}';
    }
    
    /**
     * Aquest mètode afegeix a l'ArrayList de "LlistaAliments" el nom de l'aliment.
     * @param nomAliment és el nom que té l'aliment que té l'exemplar.
     * @return 
     */
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
    
    /**
     * 
     * @param nomAliment
     * @return 
     */
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
