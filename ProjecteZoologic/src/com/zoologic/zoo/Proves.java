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
        Cuidador paco2 = new Cuidador(43198691, "dd");

        /*AÑADIR CUIDADORES A UN ZOO*/
        System.out.println(marineland.afegirCuidadorsZoologics(toni));

        /*AÑADIR CUIDADORES A LAS ESPECIES*/
        //gorilas.afegirCuidadorEspecie(paco);
        //gorilas.afegirCuidadorEspecie(toni);
        System.out.println(gorilas.getLlistatCuidador());

        /*CREAR EJEMPLARES DE UNA ESPECIE*/
        Exemplar mono1 = new Exemplar("Monito", gorilas);
        Exemplar delfin1 = new Exemplar("Delfinu", delfines);

        /*CREAMOS ESPACIOS*/
        Espai jaula1 = new Espai("Jaula", TANCAT);
        Espai jaula2 = new Espai("Jaula2", TANCAT);
        Espai aquario = new Espai("Aquario delfines", AQUARI);

        Tasca tarea1 = new Tasca("Limpiar jaula monos");
        Tasca tarea2 = new Tasca("Limpiar jaula monos");

        toni.afegirTasca(tarea1);

        marineland.afegirEspeciesZoologic(delfines);

        gorilas.afegirCuidadorEspecie(marineland, toni);
        delfines.afegirCuidadorEspecie(marineland, paco);
        delfines.afegirCuidadorEspecie(marineland, toni);
        delfines.afegirCuidadorEspecie(marineland, toni);

        delfines.eliminarCuidadorEspecie(paco2);
        delfines.eliminarCuidadorEspecie(toni);
        delfines.eliminarCuidadorEspecie(toni);

        System.out.println(marineland.getLlistatCuidadors());
        delfines.afegirEspaiEspecie(jaula2);
        System.out.println(delfines.getLlistatEspais());

        marineland.afegirEspaiZoologic(jaula2);
        System.out.println(marineland.mostrarTipusEspaiZoologic(TANCAT));

        delfines.afegirCuidadorEspecie(marineland, toni);
        System.out.println(delfines.getLlistatCuidador());

        Aliment poma = new Aliment(1, "Manzana");
        System.out.println(poma);

        poma.afegirPreparacio("Coger una manzana");
        poma.afegirPreparacio("Coger una manzanaeeeeee");

        
        System.out.println(poma);
        poma.afegirPreparacio("Coger una manzana");
        System.out.println(poma);
        poma.eliminarPreparacio("Coger una manzana");
        System.out.println(poma);
    }
}
