package com.zoologic.cuidador;

import com.zoologic.especie.Especie;
import com.zoologic.tasca.Tasca;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Classe que conte tota la informacio dels cuidadors.
 *
 * @author Sivi,Xavier,Jesus,Toni
 */
public class Cuidador {

    /**
     * ID del cuidador.
     */
    private int id;
    /**
     * Nom del cuidador.
     */
    private String nom;
    /**
     * Llistat de les tasques del cuidador.
     */
    private ArrayDeque<Tasca> LlistatTasques;
    /**
     * Llistat de les especies del cuidador.
     */
    private ArrayList<Especie> LlistatEspecies;

    /**
     * Obtenim el valor assignat a l'atribut "id".
     *
     * @return id de l'empleat.
     */
    public int getId() {
        return id;
    }

    /**
     * Assignam el valor a l'atribut "id"
     *
     * @param id id de l'empleat.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtenim el valor assignat a l'atribut "nom".
     *
     * @return nom de l'empleat.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Assignam el valor a l'atribut "nom"
     *
     * @param nom és el nom del cuidador.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Obtenim els valors de la llista de tasques.
     *
     * @return llista de tasques.
     */
    public ArrayDeque<Tasca> getLlistatTasques() {
        return LlistatTasques;
    }

    /**
     * Obtenim els valors de la llista de tasques.
     *
     * @return llista de especies.
     */
    public ArrayList<Especie> getLlistatEspecies() {
        return LlistatEspecies;
    }

    /**
     * És el constructor de Cuidador amb el parametre nom. Inicialitzam les dues
     * llistes.
     *
     * @param id es el id del cuidador.
     * @param nom és el nom del cuidador.
     */
    public Cuidador(int id, String nom) {
        this.id = id;
        this.nom = nom;
        LlistatTasques = new ArrayDeque<>();
        LlistatEspecies = new ArrayList<>();
    }

    /**
     * És el métode que mostra la informacio completa del objecte mostrant el
     * valors del seus atributs.
     *
     * @return informacio completa del objecte.
     */
    @Override
    public String toString() {
        return "Cuidador{" + "id=" + id + ", nom=" + nom + '}';
    }

    /**
     * Aquest metode afegeix a l'ArrayDeque de LlistatTasques una tasca nova.
     *
     * @param nomTasca és la tasca que afegim a la llista.
     * @return true si l'ha pogut afegir i false si la tasca ja estava a la
     * llista.
     */
    public boolean afegirTasca(Tasca nomTasca) {

        Iterator<Tasca> it = LlistatTasques.iterator();
        while (it.hasNext()) {
            Tasca i = it.next();
            if (i.getDescripcio().equals(nomTasca.getDescripcio())) {
                System.out.println("Aquesta tasca ja esta en la llista.");
                return false;
            }
        }
        LlistatTasques.add(nomTasca);
        return true;
    }

    /**
     * Aquest metode elimina a l'ArrayDeque de LlistatTasques una tasca nova.
     * Si la llista de tasques esta buida retorna false.
     *
     * @param nomTasca és l'objecte tasca que volem eliminar.
     * @return true si l'ha pogut eliminar i false, si no.
     */
    public boolean eliminarTasca() {
        
        if(LlistatTasques.isEmpty()){
            return false;
        }else{
            LlistatTasques.remove();
            return true;
        }
        /*
        Iterator<Tasca> it = LlistatTasques.iterator();
        while (it.hasNext()) {
            Tasca i = it.next();
            if (i.getDescripcio().equals(nomTasca.getDescripcio())) {
                LlistatTasques.remove(nomTasca);
                return true;
            }
        }*/
    }

    /**
     * Aquest metode afegeix a l'ArrayList de LlistaEspecies una especie nova.
     *
     * @param nomEspecie és l'objecte especie que afegim a la llista.
     * @return true si l'ha pogut afegir i false si la especie ja estava a la
     * llista.
     */
    public boolean afegirEspecie(Especie nomEspecie) {

        for (int i = 0; i < LlistatEspecies.size(); i++) {
            if (LlistatEspecies.get(i).equals(nomEspecie)) {
                return false;
            }
        }
        LlistatEspecies.add(nomEspecie);
        return true;
    }

    /**
     * Aquest mètode elimina a l'ArrayList de LlistaEspecies una especie.
     *
     * @param nomEspecie és l'objecte especie quevolem eliminar.
     * @return true si l'ha pogut eliminar i false, si no.
     */
    public boolean eliminarEspecie(Especie nomEspecie) {

        for (int i = 0; i < LlistatEspecies.size(); i++) {
            if (LlistatEspecies.get(i).equals(nomEspecie)) {
                LlistatEspecies.remove(nomEspecie);
                return true;
            }
        }
        return false;
    }
}
