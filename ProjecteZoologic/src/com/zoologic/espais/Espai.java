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
    private String nomEspai;

    /**
     * El tipusDelEspai de espai que és.
     */
    private TipusEspai tipusDelEspai;

    /**
     * Obtenim el valor assignat a l'atribut "nomEspai".
     *
     * @return nomEspai de l'espai.
     */
    public String getNom() {
        return nomEspai;
    }

    /**
     * Assignam el valor a l'atribut "nomEspai"
     *
     * @param nom nomEspai de l'espai.
     */
    public void setNom(String nom) {
        this.nomEspai = nom;
    }

    /**
     * Obtenim el valor assignat a l'atribut "Tipus".
     *
     * @return el tipusDelEspai de espai que és.
     */
    public TipusEspai getTipus() {
        return tipusDelEspai;
    }

    /**
     * Assignam el valor a l'atribut tipusDelEspai.
     *
     * @param tipus el tipusDelEspai de espai que és.
     */
    public void setTipus(TipusEspai tipus) {
        this.tipusDelEspai = tipus;
    }

    /**
     * Constructor de Espai amb els parametres nomEspai i tipusDelEspai d'espai.
     *
     * @param nom el nomEspai del espai.
     * @param tipus el tipusDelEspai de espai.
     */
    public Espai(String nom, TipusEspai tipus) {
        this.nomEspai = nom;
        this.tipusDelEspai = tipus;
    }

    /**
     * És el métode que mostra la informacio completa del objecte mostrant el
     * valors del seus atributs.
     *
     * @return informacio completa del objecte.
     */
    @Override
    public String toString() {
        return "Espai{" + "nom=" + nomEspai + ", tipus=" + tipusDelEspai + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nomEspai);
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
        return Objects.equals(this.nomEspai, other.nomEspai);
    }
}
