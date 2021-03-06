/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoologic.tasca;

/**
 * Classe que conte tota la informacio de les tasques.
 *
 * @author Sivi, Xavier, Jesus, Toni
 */
public class Tasca {

    /**
     * Descripcio de la tasca.
     */
    private String descripcioTasca;
    /**
     * Observacions de la tasca.
     */
    private String observacionsTasca;

    /**
     * Obtenim el valor assignat a l'atribut "Descripcio".
     *
     * @return descripcioTasca de la tasca.
     */
    public String getDescripcio() {
        return descripcioTasca;
    }

    /**
     * Assignam el valor a l'atribut "Descripcio"
     *
     * @param descripcio de la tasca.
     */
    public void setDescripcio(String descripcio) {
        this.descripcioTasca = descripcio;
    }

    /**
     * Assignam el valor a l'atribut "Observacions"
     *
     * @param observacions de la tasca.
     */
    public void setObservacions(String observacions) {
        this.observacionsTasca = observacions;
    }

    /**
     * Obtenim el valor assignat a l'atribut "Observacions".
     *
     * @return observacionsTasca de la tasca.
     */
    public String getObservacions() {
        return observacionsTasca;
    }

    /**
     * Constructor de Tasca amb el parametre descripcioTasca. Les observacionsTasca son
 opcionasl, per aixo no estan al constructor.
     *
     * @param descripcio de la tasca.
     */
    public Tasca(String descripcio) {
        this.descripcioTasca = descripcio;
    }

    /**
     * És el métode que mostra la informacio completa del objecte mostrant el
     * valors del seus atributs.
     *
     * @return informacio completa del objecte.
     */
    @Override
    public String toString() {
        return "Tasca{" + "descripcio=" + descripcioTasca + ", observacions=" + observacionsTasca + '}';
    }

    /**
     * Métode que afegeix una cadena a la variable observacionsTasca de la tasca.
     *
     * @param observacio és la cadena que afegim.
     * @return true si la afegit i false si no.
     */
    public boolean afegirObservacions(String observacio) {

        Tasca.this.setObservacions(observacio);
        System.out.println("Observacio afegida a la tasca.");
        return true;
    }

    /**
     * Métode que elimina una cadena de la variable observacionsTasca de la tasca.
     *
     * @param observacion és la cadena que eliminam.
     * @return true si la pogut eliminar i false si no.
     */
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
