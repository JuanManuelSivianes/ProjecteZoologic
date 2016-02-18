/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoologic.zoo;

import com.zoologic.aliment.Aliment;
import com.zoologic.cuidador.Cuidador;
import com.zoologic.espais.Espai;
import static com.zoologic.espais.TipusEspai.*;
import com.zoologic.especie.Especie;
import com.zoologic.exemplar.Exemplar;
import java.util.ArrayDeque;

/**
 *
 * @author Arsenik
 */
public class Proves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creacion de un Zoologico nuevo.
        Zoologic marineland = new Zoologic("Marineland");
        System.out.println(marineland);
        
        
        Especie g = new Especie("b", "hjih", "jojoj");
        Especie b = new Especie("g", "hjih", "jojoj");
        
        //marineland.afegirEspecie(b);
        //marineland.afegirEspecie(g);
        
        //System.out.println(marineland.mostrarEspecies());
        
        Cuidador toni = new Cuidador(1,"Toni");
        Cuidador paco = new Cuidador(2,"Paco");
        
        g.afegirCuidador(paco);
        g.afegirCuidador(toni);
        
        System.out.println(g.getLlistatCuidador());
        
        Exemplar mono1 = new Exemplar("Monito",b);
        Exemplar mono2 = new Exemplar("Monita",b);
        Exemplar mono3 = new Exemplar("Monitu",g);
        
        System.out.println(mono1);
        System.out.println(mono2);
        System.out.println(mono3);
    }
    
}
