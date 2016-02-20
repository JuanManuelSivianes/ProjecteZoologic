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

/**
 *
 * @author Arsenik
 */
public class Proves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*CREAR ZOOLOGICO*/
        Zoologic marineland = new Zoologic("Marineland");
        Zoologic wakambu = new Zoologic("Wakambu");
        Zoologic Aquapark = new Zoologic("Aquapark");
        System.out.println(marineland);
        System.out.println(wakambu);
        
        /*AÑADIMOS LOS ZOOLOGICOS A LA LISTA*/
        marineland.afegirZoologic(marineland);
        wakambu.afegirZoologic(wakambu);
        System.out.println(marineland.getLlistatZoologics());
        wakambu.setNomZoologic("Marineland");
        System.out.println(marineland.getLlistatZoologics());
        System.out.println(wakambu);

        /*CREAR ESPECIES*/
        Especie gorilas = new Especie("Gorilas", "Gorilus Maximus", "Monos Grandes");
        Especie delfines = new Especie("Delfines", "Dolfinus Maximus", "Peces con agujeros");

        /*CREAR CUIDADORES*/
        Cuidador toni = new Cuidador(43198690, "Toni");
        Cuidador paco = new Cuidador(43198691, "Paco");
        
        /*AÑADIR CUIDADORES A UN ZOO*/
        System.out.println(marineland.afegirCuidadorsZoologics(toni));

        /*AÑADIR CUIDADORES A LAS ESPECIES*/
        gorilas.afegirCuidadorEspecie(paco);
        gorilas.afegirCuidadorEspecie(toni);
        System.out.println(gorilas.getLlistatCuidador());

        /*CREAR EJEMPLARES DE UNA ESPECIE*/
        Exemplar mono1 = new Exemplar("Monito", gorilas);
        Exemplar delfin1 = new Exemplar("Delfinu", delfines);
        
        /*AÑADIMOS UN EJEMPLAR A UNA ESPECIE*/
        gorilas.afegirExemplarEspecie(mono1);
        delfines.afegirExemplarEspecie(delfin1);
        System.out.println(gorilas.getLlistatExemplars());
        System.out.println(delfines.getLlistatExemplars());
        
        /*CREAR TAREAS*/
        Tasca tarea1 = new Tasca("Netejar el tancat dels lleons.");
        Tasca tarea2 = new Tasca("Buidar piscina dels dofins");
        tarea2.setObservacions("En Delfinu fa temps que no menja");
        Tasca tarea3 = new Tasca("Tancar els llums del zoo.");
        
        /*AÑADIR TAREAS A CUIDADORES*/
        toni.afegirTasca(tarea1);
        toni.afegirTasca(tarea2);
        toni.afegirTasca(tarea3);
        System.out.println(toni.getLlistatTasques());
        toni.eliminarTasca();
        System.out.println(toni.getLlistatTasques());
        
        /*CREAMOS ESPACIOS*/
        Espai jaula1 = new Espai("Jaula Gorilas",TANCAT);
        Espai jaula2 = new Espai("Jaula Tigres",TANCAT);
        Espai jaula3 = new Espai("Jaula Gorilas",TANCAT);
        Espai aquiario1 = new Espai("Aquaiario delfines",AQUARI);
        
        /*AÑADIMOS ESPACIOS A LAS ESPECIES*/
        gorilas.afegirEspaiEspecie(jaula1);
        gorilas.afegirEspaiEspecie(jaula2);
        delfines.afegirEspaiEspecie(aquiario1);
        System.out.println(gorilas.getLlistatEspais());
        System.out.println(delfines.getLlistatEspais());
        
        /*AÑADIR UNA ESPECIE A UN ZOO*/
        //marineland.afegirEspeciesZoologic(gorilas);
        //System.out.println(marineland.getLlistatEspecies());
        
        /*AÑADIR UNA ESPECIE A UN CUIDADOR*/
        Especie momo = new Especie("MOMO", "MOMO", "MOMO");
        marineland.afegirEspeciesZoologic(momo);
        System.out.println(toni.afegirEspecie(marineland, momo));
        System.out.println("ESPECIES DEL CUIDADOR TONI:");
        System.out.println(toni.getLlistatEspecies());
        System.out.println(toni.eliminarEspecie(momo));
        marineland.afegirEspaiZoologic(jaula1);
        marineland.afegirEspaiZoologic(jaula2);
        marineland.afegirEspaiZoologic(jaula3);
        System.out.println(marineland.getLlistatEspais());
        marineland.eliminarEspaiZoologic(aquiario1);
        marineland.eliminarEspaiZoologic(jaula1);
    }

}
