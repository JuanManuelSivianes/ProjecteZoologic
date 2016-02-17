/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoologic.zoo;

import com.zoologic.cuidador.Cuidador;
import java.util.ArrayList;

/**
 *
 * @author Arsenik
 */
public class Zoologic {

    private ArrayList<Cuidador> LlistatCuidadors = new ArrayList<>();

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
}
