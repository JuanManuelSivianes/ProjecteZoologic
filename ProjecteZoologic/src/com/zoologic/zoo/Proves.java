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

    public static void Suma(){
        int a=1;
        int b=2;
        System.out.println(a+b);
    }
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
        
        Tasca tarea1 = new Tasca(1,"Limpiar jaula tigres.");
        Tasca tarea2 = new Tasca(2,"Recoger bananas.");
        tarea1.setObservacions("En simba no meja desde fa 3 dies.");
        
        Cuidador toni = new Cuidador(000001,"Toni");
        
        System.out.println(toni.afegirTasca(tarea1));
        System.out.println(toni.afegirTasca(tarea2));
        
        System.out.println(toni);
        System.out.println(toni.getLlistatTasques());
        System.out.println(toni.eliminarTasca(tarea2));
        System.out.println(toni.getLlistatTasques());
        System.out.println(toni.eliminarTasca(tarea2));
        
    }
    
}
