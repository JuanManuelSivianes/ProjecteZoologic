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

/**
 *
 * @author Arsenik
 */
public class Proves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Zoologic marineland = new Zoologic("Marineland");
        Tasca tarea1 = new Tasca("Limpiar jaula tigres.");
        Especie gorilas = new Especie("Gorilas", "Gorilas Maximus", "Son monos grandes.");
        
        Cuidador toni = new Cuidador(43198690, "Toni");
        Cuidador xavi = new Cuidador(43198691, "Xavi");
        Cuidador sivi = new Cuidador(43198692, "Sivi");
        
        Espai jaula1 = new Espai("Jaula Gorilas", TANCAT);
        Espai jaula2 = new Espai("Jaula Gorilas Dos", TANCAT);
        Espai aquiario1 = new Espai("Aquiario Gorilas", AQUARI);
        
        /*LLISTAR ELS CUIDADORS*/
        marineland.afegirCuidadorsZoologics(toni);
        marineland.afegirCuidadorsZoologics(xavi);
        marineland.afegirCuidadorsZoologics(sivi);
        System.out.println(marineland.getLlistatCuidadors());
        System.out.println("");
        
        /*LISTAR ELS ESPAIS ON VIU UNA CERTA ESPECIE*/
        marineland.afegirEspeciesZoologic(gorilas);
        marineland.afegirEspaiZoologic(jaula1);
        marineland.afegirEspaiZoologic(jaula2);
        marineland.afegirEspaiZoologic(aquiario1);
        gorilas.afegirEspaiEspecie(marineland, jaula1);
        gorilas.afegirEspaiEspecie(marineland, jaula2);
        gorilas.afegirEspaiEspecie(marineland, aquiario1);
        System.out.println(gorilas.getLlistatEspais());
        System.out.println("");
        
        /*LLISTAR ELS ESPAIS D'UN CERT TIPUS*/
        System.out.println(marineland.mostrarTipusEspaiZoologic(TANCAT));
        System.out.println(marineland.mostrarTipusEspaiZoologic(AQUARI));
        System.out.println("");
        
        /*LLISTAR ELS CUIDADORS D'UNA CERTA ESPECIE*/
        gorilas.afegirCuidadorEspecie(marineland, toni);
        gorilas.afegirCuidadorEspecie(marineland, xavi);
        gorilas.afegirCuidadorEspecie(marineland, sivi);
        System.out.println(gorilas.getLlistatCuidador());
        System.out.println("");
        
        /*LLISTAR ELS EXEMPLARS DE LES ESPECIES QUE MENGEN UN ALIMENT*/
        Exemplar mono1 = new Exemplar("MonoUno", gorilas);
        Exemplar mono2 = new Exemplar("MonoDos", gorilas);
        Exemplar mono3 = new Exemplar("MonoTres", gorilas);
        Exemplar mono4 = new Exemplar("MonoCuatro", gorilas);
        Aliment manzana = new Aliment(1, "Manzana");
        Aliment platano = new Aliment(2, "Platano");
        
        mono1.afegirAlimentExemplar(manzana);
        mono2.afegirAlimentExemplar(manzana);
        mono3.afegirAlimentExemplar(manzana);
        mono4.afegirAlimentExemplar(platano);
        
        gorilas.afegirExemplarEspecie(mono1);
        gorilas.afegirExemplarEspecie(mono2);
        gorilas.afegirExemplarEspecie(mono3);
        gorilas.afegirExemplarEspecie(mono4);
        
        System.out.println(gorilas.mostrarExemplarsPerAliment(manzana));
    }
}
