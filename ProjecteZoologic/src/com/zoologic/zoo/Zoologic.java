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

/**
 *
 * @author Arsenik
 */
public class Zoologic {

    private ArrayList<Cuidador> LlistatCuidadors = new ArrayList<>();
    private ArrayList<Especie> LlistatEspecies = new ArrayList<>();
    private ArrayList<Espai> LlistatEspais = new ArrayList<>();

    public boolean afegirCuidador(Cuidador nomCuidador) {
        for (int i = 0; i < LlistatCuidadors.size(); i++) {
            if (LlistatCuidadors.get(i).equals(nomCuidador)) {
                System.out.println("Aquest cuidador ja esta al zoologic.");
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
        System.out.println("Aquest cuidador no esta al zoologic.");
        return false;
    }

    public void mostrarCuidadors() {
        for (int i = 0; i < LlistatCuidadors.size(); i++) {
            System.out.println(LlistatCuidadors.get(i));
        }
    }

    public boolean afegirEspecie(Especie nomEspecie) {
        for (int i = 0; i < LlistatEspecies.size(); i++) {
            if (LlistatEspecies.get(i).equals(nomEspecie)) {
                System.out.println("Aquesta especie ja esta al zoologic.");
                return false;
            }
        }
        LlistatEspecies.add(nomEspecie);
        return true;
    }

    public boolean eliminarEspecie(Especie nomEspecie) {
        for (int i = 0; i < LlistatEspecies.size(); i++) {
            if (LlistatEspecies.get(i).equals(nomEspecie)) {
                LlistatEspecies.remove(nomEspecie);
                return true;
            }
        }
        System.out.println("Aquesta especie no esta al zoologic.");
        return false;
    }

    public void mostrarEspecies() {
        for (int i = 0; i < LlistatEspecies.size(); i++) {
            System.out.println(LlistatEspecies.get(i));
        }
    }

    public boolean afegirEspais(Espai nomEspai) {
        for(int i = 0; i < LlistatEspais.size(); i++){
            if(LlistatEspais.get(i).equals(nomEspai)){
                System.out.println("Aquest espai ja esta a la llista.");
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
}
