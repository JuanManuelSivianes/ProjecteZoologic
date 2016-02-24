/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoologic.espais;

import java.util.Objects;

/**
 * Classe que conte tota la informacio dels espais.
 *
 * @author Sivi, Xavier, Jesus, Toni
 */
public class Espai {

    /**
     * Nom de l'espai.
     */
    private String nom;

    /**
     * El tipus de espai que és.
     */
    private TipusEspai tipus;

    /**
     * Obtenim el valor assignat a l'atribut "nom".
     *
     * @return nom de l'espai.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Assignam el valor a l'atribut "nom"
     *
     * @param nom nom de l'espai.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Obtenim el valor assignat a l'atribut "Tipus".
     *
     * @return el tipus de espai que és.
     */
    public TipusEspai getTipus() {
        return tipus;
    }

    /**
     * Assignam el valor a l'atribut tipus.
     *
     * @param tipus el tipus de espai que és.
     */
    public void setTipus(TipusEspai tipus) {
        this.tipus = tipus;
    }

    /**
     * Constructor de Espai amb els parametres nom i tipus d'espai.
     *
     * @param nom el nom del espai.
     * @param tipus el tipus de espai.
     */
    public Espai(String nom, TipusEspai tipus) {
        this.nom = nom;
        this.tipus = tipus;
    }

    /**
     * És el métode que mostra la informacio completa del objecte mostrant el
     * valors del seus atributs.
     *
     * @return informacio completa del objecte.
     */
    @Override
    public String toString() {
        return "Espai{" + "nom=" + nom + ", tipus=" + tipus + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nom);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Espai other = (Espai) obj;
        return Objects.equals(this.nom, other.nom);
    }
}
