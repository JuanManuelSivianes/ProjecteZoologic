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
import java.util.HashSet;
import java.util.Iterator;

/**
 * Classe que conte tota la informacio dels zoologics.
 *
 * @author Sivi,Xavier,Jesus,Toni
 */
public class Zoologic {

    /**
     * Nom del zoologic.
     */
    private String nomZoologic;
    /**
     * ID del zoologic.
     */
    private final int idZoologic;
    /**
     * Contador per saber quants de zoologics tenim.
     */
    private static int contadorZoologics = 1;
    /**
     * Llistat dels zoologics creats.
     */
    private static HashMap<Integer, String> LlistatZoologics;
    /**
     * Llistat de les especies de un zoologic.
     */
    private final HashSet<Especie> LlistatEspecies;
    /**
     * Llistat dels cuidadors de un zoologic.
     */
    private final HashSet<Cuidador> LlistatCuidadors;
    /**
     * Llistat dels espais de un zoologic.
     */
    private final HashSet<Espai> LlistatEspais;

    /**
     * obtenim el valor assignat a l'atribut "nom".
     *
     * @return nom del zoologic.
     */
    public String getNomZoologic() {
        return nomZoologic;
    }

    /**
     * Assignam un valor a l'atribut "nom". Si el nom del zoologic ja el te un
     * altre zoologic ens avisara de que no li podem posar aquest nom.
     *
     * @param nomZoologic nom del zoologic.
     */
    public void setNomZoologic(String nomZoologic) {
        if (LlistatZoologics.containsValue(nomZoologic)) {
            System.out.println("Aquest nom ja esta agafat.");
        } else {
            this.nomZoologic = nomZoologic;
        }
    }

    /**
     * Obtenim el valor assignat a l'atribut Id;
     *
     * @return id del zoologic.
     */
    public int getIdZoologic() {
        return idZoologic;
    }

    /**
     * Obtenim els valors del mapa de zoologics creats..
     *
     * @return valors del mapa de zoologics.
     */
    public HashMap<Integer, String> getLlistatZoologics() {
        return LlistatZoologics;
    }

    /**
     * Obtenim els valors de la llista d'especies de un zoologic.
     *
     * @return valors de la llista d'especies de un zoologic.
     */
    public HashSet<Especie> getLlistatEspecies() {
        return LlistatEspecies;
    }

    /**
     * Obtenim els valors de la llista de cuidadors de un zoologic.
     *
     * @return valors de la llista de cuidadors de un zoologic.
     */
    public HashSet<Cuidador> getLlistatCuidadors() {
        return LlistatCuidadors;
    }

    /**
     * Obtenim els valors de la llista d'espais de un zoologic.
     *
     * @return valors de la llista d'espais de un zoologic.
     */
    public HashSet<Espai> getLlistatEspais() {
        return LlistatEspais;
    }

    /**
     * És el constructor de Zoologic amb el parametre nom. Inicialitzam totes
     * les llistes i donam valor a l'atribut "id" amb el contador.
     *
     * @param nomZoologic nom del zoologic.
     */
    public Zoologic(String nomZoologic) {
        this.nomZoologic = nomZoologic;
        this.idZoologic = contadorZoologics++;
        Zoologic.LlistatZoologics = new HashMap<>();
        this.LlistatEspecies = new HashSet<>();
        this.LlistatCuidadors = new HashSet<>();
        this.LlistatEspais = new HashSet<>();
    }

    /**
     * És el métode que mostra la informacio completa del objecte mostrant el
     * valors del seus atributs.
     *
     * @return informacio completa del objecte.
     */
    @Override
    public String toString() {
        return "Zoologic{" + "idZoologic=" + idZoologic + ", nomZoologic=" + nomZoologic + '}';
    }

    /**
     * Aquest metode afegeix un zoologic a la llista.
     *
     * @param nomZoologic és l'objecte zoologic que volem afegir a la llista.
     * @return true si el zoologic no esta en la llista i l'ha afegit i false si
     * el zoologic ja estava en la llista.
     */
    public boolean afegirZoologic(Zoologic nomZoologic) {
        if (LlistatZoologics.containsValue(nomZoologic.getNomZoologic())) {
            System.out.println("Zoologic duplicat.");
            return false;
        } else {
            LlistatZoologics.put(idZoologic, nomZoologic.getNomZoologic());
            System.out.println("Zoologic afegit correctament.");
            return true;
        }
    }

    /**
     * Aquest metode elimina un zoologic de la llista.
     *
     * @param nomZoologic és l'objecte zoologic que volem afegir a la llista.
     * @return true si el zoologic s'ha pogut eliminar i false si no.
     */
    public boolean eliminarZoologic(Zoologic nomZoologic) {
        if (LlistatZoologics.containsValue(nomZoologic.getNomZoologic())) {
            LlistatZoologics.remove(nomZoologic.getIdZoologic());
            System.out.println("Zoologic eliminat correctament de la llista");
            return true;
        } else {
            System.out.println("Aquest zoologic no esta en la llista.");
            return false;
        }
    }

    /**
     * Aquest metode afegeix un espai a un zoologic.
     *
     * @param nomEspai és l'objecte espai que volem afegir a la llista.
     * @return true si l'espai no esta en la llista i l'ha afegit i false si
     * l¡espai ja estava en la llista del zoologic.
     */
    public boolean afegirEspaiZoologic(Espai nomEspai) {
        if (LlistatEspais.add(nomEspai)) {
            System.out.println("Espai afegit correctament al zoo.");
            return true;
        } else {
            System.out.println("Espai duplicat.");
            return false;
        }
    }

    /**
     * Aquest metode elimina un espai de un zoologic.
     *
     * @param nomEspai és l'objecte espai que volem eliminar de la llista.
     * @return true si l'espai s'ha pogut eliminar i false si no.
     */
    public boolean eliminarEspaiZoologic(Espai nomEspai) {
        if (LlistatEspais.contains(nomEspai)) {
            LlistatEspais.remove(nomEspai);
            System.out.println("Espai eliminat correctament del zoo.");
            return true;
        } else {
            System.out.println("Aquest espai no esta al zoo.");
            return false;
        }
    }

    /**
     * Aquest metode retorna una llista dels espais del zoologic del tipus que
     * cercam.
     *
     * @param tipusEspai és el tipus de espai que cercam.
     * @return llistat dels espais de un cert tipus.
     */
    public ArrayList mostrarTipusEspaiZoologic(TipusEspai tipusEspai) {
        ArrayList listadoEspacios = new ArrayList();
        
        Iterator<Espai> itr = LlistatEspais.iterator();
        while (itr.hasNext()) {
            Espai o = itr.next();
            if (o.getTipus().equals(tipusEspai)) {
                listadoEspacios.add(o);
            }
        }
        return listadoEspacios;
    }

    /**
     * Aquest metode afegeix una especie a un zoologic.
     *
     * @param nomEspecie és l'objecte especie que volem afegir a la llista.
     * @return true si la especie no esta en la llista i l'ha afegit i false si
     * la especie ja estava en la llista del zoologic.
     */
    public boolean afegirEspeciesZoologic(Especie nomEspecie) {
        if (LlistatEspecies.add(nomEspecie)) {
            System.out.println("Especie afegida correctament.");
            return true;
        } else {
            System.out.println("Especie duplicada.");
            return false;
        }
    }

    /**
     * Aquest metode elimina una especie de un zoologic.
     *
     * @param nomEspecie és l'objecte especie que volem eliminar de la llista.
     * @return true si la especie s'ha pogut eliminar i false si no.
     */
    public boolean eliminarEspecieZoologic(Especie nomEspecie) {
        if (LlistatEspecies.contains(nomEspecie)) {
            LlistatEspecies.remove(nomEspecie);
            System.out.println("Especie eliminada correctament del zoo.");
            return true;
        } else {
            System.out.println("Aquesta especie no esta al zoo.");
            return false;
        }
    }

    /**
     * Aquest metode afegeix un cuidador a un zoologic.
     *
     * @param nomCuidador és l'objecte cuidador que volem afegir a la llista.
     * @return true si el cuidador no esta a la llista i ho ha afegit i false si
     * el cuidador ja estava en la llista del zoologic.
     */
    public boolean afegirCuidadorsZoologics(Cuidador nomCuidador) {
        if (LlistatCuidadors.add(nomCuidador)) {
            System.out.println("Cuidador afegit correctament al zoo.");
            return true;
        } else {
            System.out.println("Cuidador duplicat.");
            return false;
        }
    }

    /**
     * Aquest metode elimina un cuidador de un zoologic.
     *
     * @param nomCuidador és l'objecte cuidador que volem eliminar de la llista.
     * @return true si el cuidador s'ha pogut eliminar i false si no.
     */
    public boolean eliminarCuidadorsZoologic(Cuidador nomCuidador) {
        if (LlistatCuidadors.contains(nomCuidador)) {
            LlistatCuidadors.remove(nomCuidador);
            System.out.println("Cuidador eliminat correctament del zoo.");
            return true;
        } else {
            System.out.println("Aquest cuidador no esta al zoo.");
            return false;
        }
    }
}
