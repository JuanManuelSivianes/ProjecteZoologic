/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoologic.zoo;

import com.zoologic.cuidador.Cuidador;
import com.zoologic.tasca.Tasca;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Arsenik
 */
public class Proves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Afegir espais a una determinada especie
         */
        /*ArrayList<Espais> simions = new ArrayList<>();
        HashMap<String,ArrayList> mono = new HashMap<>();
        
        simions.add(Espais.TANCAT);
        simions.add(Espais.PISCINA);
        
        mono.put("Mono", simions);
        
        System.out.println(mono.get("Mono"));*/
        
        Zoologic marineland = new Zoologic();
        Cuidador toni = new Cuidador(000001,"Toni");
        
        System.out.println(marineland.afegirCuidador(toni));
        marineland.mostrarCuidadors();
        
        
    }
    
}
