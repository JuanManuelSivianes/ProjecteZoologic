package com.zoologic.cuidador;

import com.zoologic.especie.Especie;
import com.zoologic.tasca.Tasca;
import com.zoologic.zoo.Zoologic;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Classe que conte tota la informacio dels cuidadors.
 *
 * @author Sivi, Xavier, Jesus, Toni
 */
public class Cuidador {

    /**
     * ID del cuidador.
     */
    private int idCuidador;
    /**
     * Nom del cuidador.
     */
    private String nomCuidador;
    /**
     * Llistat de les tasques del cuidador.
     */
    private final ArrayDeque<Tasca> llistatTasquesCuidador;
    /**
     * Llistat de les especies del cuidador.
     */
    private final ArrayList<Especie> llistatEspeciesCuidador;

    /**
     * Obtenim el valor assignat a l'atribut "idCuidador".
     *
     * @return idCuidador de l'empleat.
     */
    public int getId() {
        return idCuidador;
    }

    /**
     * Obtenim el valor assignat a l'atribut "nomCuidador".
     *
     * @return nomCuidador de l'empleat.
     */
    public String getNom() {
        return nomCuidador;
    }

    /**
     * Assignam el valor a l'atribut "nomCuidador"
     *
     * @param nom és el nomCuidador del cuidador.
     */
    public void setNom(String nom) {
        this.nomCuidador = nom;
    }

    /**
     * Obtenim els valors de la llista de tasques.
     *
     * @return llista de tasques.
     */
    public ArrayDeque<Tasca> getLlistatTasques() {
        return llistatTasquesCuidador;
    }

    /**
     * Obtenim els valors de la llista de tasques.
     *
     * @return llista de especies.
     */
    public ArrayList<Especie> getLlistatEspecies() {
        return llistatEspeciesCuidador;
    }

    /**
     * És el constructor de Cuidador amb el parametre nomCuidador. Inicialitzam les dues
     * llistes.
     *
     * @param id es el idCuidador del cuidador.
     * @param nom és el nomCuidador del cuidador.
     */
    public Cuidador(int id, String nom) {
        this.idCuidador = id;
        this.nomCuidador = nom;
        llistatTasquesCuidador = new ArrayDeque<>();
        llistatEspeciesCuidador = new ArrayList<>();
    }

    /**
     * És el métode que mostra la informacio completa del objecte mostrant el
     * valors del seus atributs.
     *
     * @return informacio completa del objecte.
     */
    @Override
    public String toString() {
        return "Cuidador{" + "id=" + idCuidador + ", nom=" + nomCuidador + '}';
    }

    @Override
    public int hashCode() {
        return this.idCuidador;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cuidador other = (Cuidador) obj;
        return this.idCuidador == other.idCuidador;
    }

    /**
     * Aquest metode afegeix a l'ArrayDeque de llistatTasquesCuidador una tasca nova.
     *
     * @param nomTasca és la tasca que afegim a la llista.
     * @return true si l'ha pogut afegir i false si la tasca ja esta a la
     * llista.
     */
    public boolean afegirTasca(Tasca nomTasca) {

        Iterator<Tasca> it = llistatTasquesCuidador.iterator();
        while (it.hasNext()) {
            Tasca i = it.next();
            if (i.getDescripcio().equals(nomTasca.getDescripcio())) {
                System.out.println("Aquest cuidador ja te aquesta tasca.");
                return false;
            }
        }
        llistatTasquesCuidador.add(nomTasca);
        System.out.println("Tasca afegida correctament al cuidador.");
        return true;
    }

    /**
     * Aquest metode elimina a l'ArrayDeque de llistatTasquesCuidador una tasca
 nova.Elimina la primera tasca que esta en la coa.
     *
     * @return true si l'ha pogut eliminar i false, si no. Si la llista de
     * tasques esta buida retorna false.
     */
    public boolean eliminarTasca() {

        if (llistatTasquesCuidador.isEmpty()) {
            System.out.println("Aquest cuidador no te cap tasca.");
            return false;
        } else {
            llistatTasquesCuidador.remove();
            System.out.println("Tasca eliminada correctament del cuidador.");
            return true;
        }
    }

    /**
     * Aquest metode afegeix a l'ArrayList de LlistaEspecies una especie nova.
     *
     * @param nomZoologic es el zoologic en el que cercam l'especie.
     * @param nomEspecie és l'objecte especie que afegim a la llista.
     * @return true si l'ha pogut afegir i false si la especie ja estava a la
     * llista, la especie no esta al zoo, el cuidador no esta al zoo o si el
     * cuidador ja te aquesta especie.
     */
    public boolean afegirEspecieCuidador(Zoologic nomZoologic, Especie nomEspecie) {

        if (nomZoologic.getLlistatCuidadors().contains(Cuidador.this)) {
            if (nomZoologic.getLlistatEspecies().contains(nomEspecie)) {
                if (llistatEspeciesCuidador.contains(nomEspecie)) {
                    System.out.println("Aquest cuidador ja te aquesta especie.");
                    return false;
                }
            } else {
                System.out.println("Aquesta especie no esta al zoo.");
                return false;
            }
        } else {
            System.out.println("Aquest cuidador no esta al zoo.");
            return false;
        }

        llistatEspeciesCuidador.add(nomEspecie);
        System.out.println("Especie afegida correctament al cuidador.");
        return true;
    }

    /**
     * Aquest mètode elimina a l'ArrayList de LlistaEspecies una especie.
     *
     * @param nomEspecie és l'objecte especie quevolem eliminar.
     * @return true si l'ha pogut eliminar i false si la llista de especies esta
     * buida o el cuidador no te aquesta especie.
     */
    public boolean eliminarEspecie(Especie nomEspecie) {

        if (llistatEspeciesCuidador.isEmpty()) {
            System.out.println("Aquest cuidador no te cap especie.");
            return false;
        }

        if (llistatEspeciesCuidador.contains(nomEspecie)) {
            llistatEspeciesCuidador.remove(nomEspecie);
            System.out.println("Especie eliminada correctament del cuidador.");
            return true;
        } else {
            System.out.println("El cuidador no te aquesta especie.");
            return false;
        }
    }
}
