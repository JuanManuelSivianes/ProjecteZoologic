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
        HashMap<Especie,ArrayList> mono = new HashMap<>();
        
        simions.add(Espais.TANCAT);
        simions.add(Espais.PISCINA);
        
        mono.put("Mono", simions);
        
        System.out.println(mono.get("Mono"));*/
        
        Zoologic marineland = new Zoologic();
        Cuidador toni = new Cuidador(000001,"Toni");
        Cuidador paco = new Cuidador(000002,"Paco");
        
        Espai sala1 = new Espai("Sala1",TANCAT);
        Espai sala2 = new Espai("Sala2",TANCAT);
        Espai sala3 = new Espai("Sala3",TANCAT);
        Espai sala4 = new Espai("Sala4",PISCINA);
        
        marineland.afegirEspais(sala1);
        marineland.afegirEspais(sala2);
        marineland.afegirEspais(sala3);
        marineland.afegirEspais(sala4);
        
        
        marineland.mostraTipusEspais(TANCAT);
        
        
        System.out.println(marineland.afegirCuidador(toni));
        marineland.mostrarCuidadors();
        
        Especie gorilas = new Especie(1000,"Gorilas","GorilasMaximus","Son osos grandes");
        gorilas.afegirEspai(sala1);
        gorilas.afegirEspai(sala4);
        gorilas.afegirCuidador(toni);
        gorilas.afegirCuidador(paco);
         
        marineland.afegirEspecie(gorilas);
        
        marineland.mostrarEspaisEspecie(gorilas);
        
        marineland.mostrarCuidadorsEspecie(gorilas);
        
        
        
        
    }
    
}
