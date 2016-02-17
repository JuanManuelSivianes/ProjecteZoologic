/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoologic.aliment;

import java.util.ArrayDeque;

/**
 *
 * @author Arsenik
 */
public class Aliment {
    private int id;
    private String nom;
    ArrayDeque<String> preparacio = new ArrayDeque<>();

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

    public ArrayDeque<String> getPreparacio() {
        return preparacio;
    }

    public void setPreparacio(ArrayDeque<String> preparacio) {
        this.preparacio = preparacio;
    }

    public Aliment(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Aliment{" + "id=" + id + ", nom=" + nom + ", preparacio=" + preparacio + '}';
    }
    
}
