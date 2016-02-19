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
    private final HashMap<Integer, Cuidador> LlistatCuidadors;
    private final ArrayList<Especie> LlistatEspecies;
    private final ArrayList<Espai> LlistatEspais;

    public Zoologic(String nomZoologic) {
        this.nomZoologic = nomZoologic;
        this.idZoologic = contadorZoologics++;
        this.LlistatCuidadors = new HashMap<>();
        this.LlistatEspecies = new ArrayList<>();
        this.LlistatEspais = new ArrayList<>();
    }

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

    @Override
    public String toString() {
        return "Zoologic{" + "nomZoologic=" + nomZoologic + ", idZoologic=" + idZoologic + '}';
    }

    /**
     * TODOS ESTOS METODOS AUN HAY QUE REVISARLOS YA QUE HAY QUE PEDIR UNA
     * INFORMACIONS SOBRE QUE ZOOLOGICO QUEREMOS ESCOGER CON QUE ID Y TODO ESO
     * PARA SABER A QUE ZOO AÑADIRLE LOS CUIDADORES, ESPACIOS, ESPECIES, ETC.
     */
    /*public boolean afegirCuidador(Cuidador nomCuidador) {
     for (Cuidador LlistatCuidador : LlistatCuidadors) {
     if (LlistatCuidador.equals(nomCuidador)) {
     return false;
     }
     }
     LlistatCuidadors.add(nomCuidador);
     return true;
     }

     public boolean eliminarCuidador(Cuidador nomCuidador) {
     for (int i = 0; i < LlistatCuidadors.size(); i++) {
     if (LlistatCuidadors.get(i).equals(nomCuidador)) {
     LlistatCuidadors.remove(nomCuidador);
     return true;
     }
     }
     return false;
     }

     public ArrayList mostrarCuidadors() {
     return LlistatCuidadors;
     }

     public boolean afegirEspecie(Especie nomEspecie) {
     for (int i = 0; i < LlistatEspecies.size(); i++) {
     if (LlistatEspecies.get(i).equals(nomEspecie)) {
     return false;
     }
     }
     LlistatEspecies.add(nomEspecie);
     Especie.contadorEspecies++;
        
     return true;
     }

     public boolean eliminarEspecie(Especie nomEspecie) {
     for (int i = 0; i < LlistatEspecies.size(); i++) {
     if (LlistatEspecies.get(i).equals(nomEspecie)) {
     LlistatEspecies.remove(nomEspecie);
     return true;
     }
     }
     return false;
     }

     public ArrayList mostrarEspecies() {
     return LlistatEspecies;
     }

     public boolean afegirEspais(Espai nomEspai) {
     for(int i = 0; i < LlistatEspais.size(); i++){
     if(LlistatEspais.get(i).equals(nomEspai)){
     return false;
     }
     }
     LlistatEspais.add(nomEspai);
     return true;
     }

     public void mostraTipusEspais(TipusEspai nomEspai) {
     for (int i = 0; i < LlistatEspais.size(); i++) {
     if (LlistatEspais.get(i).getTipus().equals(nomEspai)) {
     System.out.println(LlistatEspais.get(i).getNom());
     }
     }
     }
    
     public void mostrarEspaisEspecie(Especie nomEspecie){
     for (Especie LlistatEspecie : LlistatEspecies) {
     if (LlistatEspecie.equals(nomEspecie)) {
     System.out.println(LlistatEspecie.getLlistatEspais());
     }
     }
     }
    
     public void mostrarCuidadorsEspecie(Especie nomEspecie){
     for(int i = 0; i < LlistatEspecies.size(); i++){
     if(LlistatEspecies.get(i).equals(nomEspecie)){
     System.out.println(nomEspecie.getLlistatCuidador());
     }
     }
     }*/
}
