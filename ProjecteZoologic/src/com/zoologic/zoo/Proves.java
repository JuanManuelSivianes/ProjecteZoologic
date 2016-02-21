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

        
        /*CREAMOS ESPACIOS*/
        Espai jaula1 = new Espai("Jaula Gorilas",TANCAT);
        Espai jaula2 = new Espai("Jaula Tigres",TANCAT);
        Espai jaula3 = new Espai("Jaula Gorilas",TANCAT);
        Espai aquario = new Espai("Aquario delfines",AQUARI);

        marineland.afegirEspaiZoologic(jaula1);
        marineland.afegirEspaiZoologic(jaula2);
        marineland.afegirEspaiZoologic(aquario);
        
        System.out.println(marineland.mostrarTipusEspaiZoologic(AQUARI));
        
    }

}
