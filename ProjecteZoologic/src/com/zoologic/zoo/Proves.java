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
 * @author Sivi, Xavier, Jesus, Toni
 */
public class Proves {

    /**
     * Métode que inicialitza tot el zoologic. Crea: 1 zoologic, 5 espais, 4
     * cuidadors, 4 especies, 2 especies per exemplar, 1 aliment per especie, 2
     * aliments per exemplar i 2 tasques per cuidador.
     *
     */
    public void inicialitzacioZoologic() {
        /*CREAM UN ZOOLOGIC*/
        Zoologic marineland = new Zoologic("Marineland");
        /*CREAM CINC ESPAIS AMB UN REPETIT*/
        Espai jaula1 = new Espai("Jaula Gorilas", TANCAT);
        Espai jaula2 = new Espai("Jaula Jirafas", TANCAT);
        Espai aquario1 = new Espai("Aquiario Orca", AQUARI);
        Espai piscina1 = new Espai("Piscina Delfines", PISCINA);
        Espai voladores1 = new Espai("Recinto Aves", VOLADOR);
        /*CREAM CUATRE CUIDADORS*/
        Cuidador toni = new Cuidador(43198690, "Toni");
        Cuidador xavi = new Cuidador(43198691, "Xavi");
        Cuidador sivi = new Cuidador(43198692, "Sivi");
        Cuidador jesus = new Cuidador(43198693, "Jesus");
        Cuidador osvaldo = new Cuidador(43198694, "Osvaldo");
        /*CREAM CUATRE ESPECIES UNA PER ESPAI*/
        Especie gorilas = new Especie("Gorilas", "Gorilas Maximus", "Son monos grandes.");
        Especie girafas = new Especie("Girafas", "Girafas Maximus", "Son perros de cuello alto.");
        Especie orcas = new Especie("Orcas", "Orcas Maximus", "Son peces gordos.");
        Especie delfines = new Especie("Delfines", "Delfines Maximus", "Son peces con agujero.");
        Especie aguilas = new Especie("Aguilas", "Aguilas Maximus", "Son pajaros grandes.");
        /*CREAM ELS ALIMENTS DE LES ESPECEIES, UN PER ESPECIE*/
        Aliment platano = new Aliment(1, "Platano");
        Aliment arandanos = new Aliment(2, "Arandano");
        Aliment placton = new Aliment(3, "Placton");
        Aliment sardinas = new Aliment(4, "Sardinas");
        Aliment ratones = new Aliment(5, "Ratones");
        /*CREAM ELS EXEMPLARS DE LES ESPECIES, DOS PER ESPECIE*/
        Exemplar mono1 = new Exemplar("Mowli", gorilas);
        Exemplar mono2 = new Exemplar("Chita", gorilas);
        Exemplar girafa1 = new Exemplar("Cuellerin", girafas);
        Exemplar girafa2 = new Exemplar("Piesito", girafas);
        Exemplar orca1 = new Exemplar("Willy", orcas);
        Exemplar orca2 = new Exemplar("Moby", orcas);
        Exemplar delfin1 = new Exemplar("Fliper", delfines);
        Exemplar delfin2 = new Exemplar("Floper", delfines);
        Exemplar aguila1 = new Exemplar("Imperator", aguilas);
        Exemplar aguila2 = new Exemplar("Black Eagle", aguilas);
        /*CREAM ELS ALIMENTS DELS EXEMPLARS, UN PER EXEMPLAR*/
        Aliment manzana = new Aliment(6, "Manzana");
        Aliment cacahuetes = new Aliment(7, "Cacahuetes");
        Aliment eucaliptus = new Aliment(8, "Eucaliptus");
        Aliment naranjas = new Aliment(9, "Naranjas");
        Aliment pezPayaso = new Aliment(10, "Pez Payaso");
        Aliment pezGlobo = new Aliment(11, "Pez Globo");
        Aliment cranc = new Aliment(12, "Cranc");
        Aliment dorada = new Aliment(13, "Dorada");
        Aliment hamster = new Aliment(14, "Hamster");
        Aliment conejo = new Aliment(15, "Conejo");
        /*CREAM LES TASQUES, DUES PER CUIDADOR*/
        Tasca tarea1 = new Tasca("Limpiar jaula gorilas.");
        Tasca tarea2 = new Tasca("Dar de comer a las aguilas.");
        Tasca tarea3 = new Tasca("Dar de comer a las girafas.");
        Tasca tarea4 = new Tasca("Llevar a Piesito al veterinario.");
        Tasca tarea5 = new Tasca("Limpiar aquario.");
        Tasca tarea6 = new Tasca("Recoger sardinas del almacen.");
        Tasca tarea7 = new Tasca("Entrenar a fliper.");
        Tasca tarea8 = new Tasca("Dar de comer a los delfines.");
        Tasca tarea9 = new Tasca("Hacer demostracion con Black Eagle.");
        Tasca tarea10 = new Tasca("Dar de comer a las aguilas.");
        /*CREAM UNA OBSERVACIO PER TASCA*/
        tarea2.afegirObservacions("Dar medicamento a Chita.");
        tarea4.afegirObservacions("Recoger receta de Piesito.");
        tarea6.afegirObservacions("Hacer inventario de comida.");
        tarea7.afegirObservacions("Observar aleta de Fliper.");
        tarea9.afegirObservacions("Devolver a Black Eagle al recinto.");

        /*CRIDAM A TOTS ELS METODES*/
        /*AFEIM ESPAIS AL ZOOLOGIC*/
        marineland.afegirEspaiZoologic(jaula1);
        marineland.afegirEspaiZoologic(jaula2);
        marineland.afegirEspaiZoologic(aquario1);
        marineland.afegirEspaiZoologic(piscina1);
        marineland.afegirEspaiZoologic(voladores1);

        /*AFEGIM LES ESPECIES AL ZOOLOGIC*/
        marineland.afegirEspeciesZoologic(gorilas);
        marineland.afegirEspeciesZoologic(girafas);
        marineland.afegirEspeciesZoologic(orcas);
        marineland.afegirEspeciesZoologic(delfines);
        marineland.afegirEspeciesZoologic(aguilas);

        /*AFEGIM LES ESPECIES ALS ESPAIS, DOS PER ESPECIE*/
        gorilas.afegirEspaiEspecie(marineland, jaula1);
        girafas.afegirEspaiEspecie(marineland, jaula2);
        orcas.afegirEspaiEspecie(marineland, aquario1);
        delfines.afegirEspaiEspecie(marineland, piscina1);
        aguilas.afegirEspaiEspecie(marineland, voladores1);

        /*AFEGIM ELS ALIMENTS A LES ESPECIES*/
        gorilas.afegirAlimentEspecie(platano);
        girafas.afegirAlimentEspecie(arandanos);
        orcas.afegirAlimentEspecie(placton);
        delfines.afegirAlimentEspecie(sardinas);
        aguilas.afegirAlimentEspecie(ratones);

        /*AFEGIM ELS EXEMPLARS A LES ESPECIES*/
        gorilas.afegirExemplarEspecie(mono1);
        gorilas.afegirExemplarEspecie(mono2);
        girafas.afegirExemplarEspecie(girafa1);
        girafas.afegirExemplarEspecie(girafa2);
        orcas.afegirExemplarEspecie(orca1);
        orcas.afegirExemplarEspecie(orca2);
        delfines.afegirExemplarEspecie(delfin1);
        delfines.afegirExemplarEspecie(delfin2);
        aguilas.afegirExemplarEspecie(aguila1);
        aguilas.afegirExemplarEspecie(aguila2);

        /*AFEGIM ELS ALIMENTS ALS EXEMPLARS*/
        mono1.afegirAlimentExemplar(manzana);
        mono2.afegirAlimentExemplar(cacahuetes);
        girafa1.afegirAlimentExemplar(eucaliptus);
        girafa2.afegirAlimentExemplar(naranjas);
        girafa2.afegirAlimentExemplar(manzana);
        orca1.afegirAlimentExemplar(pezPayaso);
        orca2.afegirAlimentExemplar(pezGlobo);
        delfin1.afegirAlimentExemplar(cranc);
        delfin1.afegirAlimentExemplar(pezPayaso);
        delfin2.afegirAlimentExemplar(dorada);
        aguila1.afegirAlimentExemplar(hamster);
        aguila2.afegirAlimentExemplar(manzana);
        aguila2.afegirAlimentExemplar(conejo);

        /*AFEGIM ELS CUIDADORS AL ZOOLOGIC*/
        marineland.afegirCuidadorsZoologics(toni);
        marineland.afegirCuidadorsZoologics(xavi);
        marineland.afegirCuidadorsZoologics(sivi);
        marineland.afegirCuidadorsZoologics(jesus);
        marineland.afegirCuidadorsZoologics(osvaldo);

        /*AFEGIM ELS CUIDADORS A LES ESPECIES*/
        gorilas.afegirCuidadorEspecie(marineland, toni);
        girafas.afegirCuidadorEspecie(marineland, xavi);
        orcas.afegirCuidadorEspecie(marineland, sivi);
        delfines.afegirCuidadorEspecie(marineland, jesus);
        aguilas.afegirCuidadorEspecie(marineland, osvaldo);

        /*AFEGIM LES ESPCECIES ALS CUIDADORS*/
        toni.afegirEspecieCuidador(marineland, gorilas);
        xavi.afegirEspecieCuidador(marineland, girafas);
        sivi.afegirEspecieCuidador(marineland, orcas);
        jesus.afegirEspecieCuidador(marineland, delfines);
        osvaldo.afegirEspecieCuidador(marineland, aguilas);

        /*AFEGIM LES TASQUES ALS CUIDADORS*/
        toni.afegirTasca(tarea1);
        toni.afegirTasca(tarea2);
        xavi.afegirTasca(tarea3);
        xavi.afegirTasca(tarea4);
        sivi.afegirTasca(tarea5);
        sivi.afegirTasca(tarea6);
        jesus.afegirTasca(tarea7);
        jesus.afegirTasca(tarea8);
        osvaldo.afegirTasca(tarea9);
        osvaldo.afegirTasca(tarea10);

        /*GESTIO DEL PARC*/
        System.out.println("LLISTAR ELS CUIDADORS:");
        System.out.println(marineland.getLlistatCuidadors());
        System.out.println("LLISTAR ELS ESPAIS ON VIU UNA CERTA ESPECIE:");
        System.out.println(gorilas.getLlistatEspais());
        System.out.println(girafas.getLlistatEspais());
        System.out.println(orcas.getLlistatEspais());
        System.out.println(delfines.getLlistatEspais());
        System.out.println(aguilas.getLlistatEspais());
        System.out.println("LLISTAR ELS ESPAIS D'UN CERT TIPUS:");
        System.out.println(marineland.mostrarTipusEspaiZoologic(TANCAT));
        System.out.println(marineland.mostrarTipusEspaiZoologic(PISCINA));
        System.out.println(marineland.mostrarTipusEspaiZoologic(AQUARI));
        System.out.println(marineland.mostrarTipusEspaiZoologic(VOLADOR));
        System.out.println("LLISTAR ELS CUIDADORS D'UNA ESPECIE:");
        System.out.println(gorilas.getLlistatCuidador());
        System.out.println(girafas.getLlistatCuidador());
        System.out.println(orcas.getLlistatCuidador());
        System.out.println(delfines.getLlistatCuidador());
        System.out.println(aguilas.getLlistatCuidador());
        System.out.println("LLISTAR ELS EXEMPLARS QUE MENGEN UN DETERMINAT ALIMENT:");
        System.out.println(marineland.mostrarExemplarsPerAliment(manzana));
        System.out.println(marineland.mostrarExemplarsPerAliment(pezPayaso));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proves creador = new Proves();

        creador.inicialitzacioZoologic();
    }
}
