/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoologic.zoo;

import com.zoologic.cuidador.Cuidador;
import com.zoologic.espais.Espai;
import com.zoologic.espais.TipusEspai;
import com.zoologic.especie.Especie;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Arsenik
 */
public class Zoologic {

    private String nomZoologic;
    private int idZoologic;
    private static int contadorZoologics = 1;
    private static ArrayList<Zoologic> LlistatZoologics;
    private final HashMap<Zoologic, Cuidador> LlistatCuidadors;
    private final ArrayList<Especie> LlistatEspecies;
    private final HashMap<Zoologic, Espai> LlistatEspais;

    public String getNomZoologic() {
        return nomZoologic;
    }

    public void setNomZoologic(String nomZoologic) {
        this.nomZoologic = nomZoologic;
    }

    public int getIdZoologic() {
        return idZoologic;
    }

    public void setIdZoologic(int idZoologic) {
        this.idZoologic = idZoologic;
    }

    public ArrayList<Zoologic> getLlistatZoologics() {
        return LlistatZoologics;
    }

    public ArrayList<Especie> getLlistatEspecies() {
        return LlistatEspecies;
    }

    public Zoologic(String nomZoologic) {
        this.nomZoologic = nomZoologic;
        this.idZoologic = contadorZoologics++;
        this.LlistatZoologics = new ArrayList<>();
        this.LlistatCuidadors = new HashMap<>();
        this.LlistatEspecies = new ArrayList<>();
        this.LlistatEspais = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Zoologic{" + "idZoologic=" + idZoologic + ", nomZoologic=" + nomZoologic + '}';
    }

    public boolean afegirZoologic(Zoologic nomZoologic) {
        for (int i = 0; i < LlistatZoologics.size(); i++) {
            if (LlistatZoologics.get(i).equals(nomZoologic)) {
                System.out.println("Aquest zoo ja esta en la llista.");
                return false;
            }
        }
        LlistatZoologics.add(nomZoologic);
        return true;
    }

    public boolean afegirEspeciesZoologic(Especie nomEspecie) {
        for (int i = 0; i < LlistatEspecies.size(); i++) {
            if (LlistatEspecies.get(i).equals(nomEspecie)) {
                System.out.println("Aquesta especie ja esta al zoo.");
                return false;
            }
        }
        LlistatEspecies.add(nomEspecie);
        System.out.println("Especie añadida correctamente.");
        return true;
    }
}
