/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoologic.tasca;

/**
 * Classe que conte tota la informacio de les tasques.
 *
 * @author Sivi,Xavier,Jesus,Toni
 */
public class Tasca {

    /**
     * Descripcio de la tasca.
     */
    private String descripcio;
    /**
     * Observacions de la tasca.
     */
    private String observacions;

    /**
     * Obtenim el valor assignat a l'atribut "Descripcio".
     *
     * @return descripcio de la tasca.
     */
    public String getDescripcio() {
        return descripcio;
    }

    /**
     * Assignam el valor a l'atribut "Descripcio"
     *
     * @param descripcio de la tasca.
     */
    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    /**
     * Assignam el valor a l'atribut "Observacions"
     *
     * @param observacions de la tasca.
     */
    public void setObservacions(String observacions) {
        this.observacions = observacions;
    }

    /**
     * Obtenim el valor assignat a l'atribut "Observacions".
     *
     * @return observacions de la tasca.
     */
    public String getObservacions() {
        return observacions;
    }

    /**
     * Constructor de Tasca amb el parametre descripcio. Les observacions son
     * opcionasl, per aixo no estan al constructor.
     *
     * @param descripcio de la tasca.
     */
    public Tasca(String descripcio) {
        this.descripcio = descripcio;
    }

    /**
     * És el métode que mostra la informacio completa del objecte mostrant el
     * valors del seus atributs.
     *
     * @return informacio completa del objecte.
     */
    @Override
    public String toString() {
        return "Tasca{" + "descripcio=" + descripcio + ", observacions=" + observacions + '}';
    }

    public boolean afegirObservacions(String observacio) {

        Tasca.this.setObservacions(observacio);
        System.out.println("Observacio afegida a la tasca.");
        return true;
    }

    public boolean eliminarObservacions(String observacion) {
        if (Tasca.this.getObservacions() == null) {
            System.out.println("Aquesta tasca no te observacions.");
            return false;
        }
        if (Tasca.this.getObservacions().contains(observacion)) {
            Tasca.this.setObservacions(null);
            System.out.println("Observacio eliminada correctament de la tasca.");
        }
        return true;
    }
}
