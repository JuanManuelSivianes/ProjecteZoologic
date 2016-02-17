/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoologic.espais;

/**
 *
 * @author Arsenik
 */
public class Espai {
    private String nom;
    private TipusEspai tipus;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public TipusEspai getTipus() {
        return tipus;
    }

    public void setTipus(TipusEspai tipus) {
        this.tipus = tipus;
    }

    public Espai(String nom, TipusEspai tipus) {
        this.nom = nom;
        this.tipus = tipus;
    }

    @Override
    public String toString() {
        return "Espai{" + "nom=" + nom + ", tipus=" + tipus + '}';
    }
    
    
}
