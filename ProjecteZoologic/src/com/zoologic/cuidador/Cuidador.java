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
    private int id;
    /**
     * Nom del cuidador.
     */
    private String nom;
    /**
     * Llistat de les tasques del cuidador.
     */
    private final ArrayDeque<Tasca> LlistatTasques;
    /**
     * Llistat de les especies del cuidador.
     */
    private final ArrayList<Especie> LlistatEspecies;

    /**
     * Obtenim el valor assignat a l'atribut "id".
     *
     * @return id de l'empleat.
     */
    public int getId() {
        return id;
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

    @Override
    public int hashCode() {
        return this.id;
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
        return this.id == other.id;
    }

    /**
     * Aquest metode afegeix a l'ArrayDeque de LlistatTasques una tasca nova.
     *
     * @param nomTasca és la tasca que afegim a la llista.
     * @return true si l'ha pogut afegir i false si la tasca ja esta a la
     * llista.
     */
    public boolean afegirTasca(Tasca nomTasca) {

        Iterator<Tasca> it = LlistatTasques.iterator();
        while (it.hasNext()) {
            Tasca i = it.next();
            if (i.getDescripcio().equals(nomTasca.getDescripcio())) {
                System.out.println("Aquest cuidador ja te aquesta tasca.");
                return false;
            }
        }
        LlistatTasques.add(nomTasca);
        System.out.println("Tasca afegida correctament al cuidador.");
        return true;
    }

    /**
     * Aquest metode elimina a l'ArrayDeque de LlistatTasques una tasca
     * nova.Elimina la primera tasca que esta en la coa.
     *
     * @return true si l'ha pogut eliminar i false, si no. Si la llista de
     * tasques esta buida retorna false.
     */
    public boolean eliminarTasca() {

        if (LlistatTasques.isEmpty()) {
            System.out.println("Aquest cuidador no te cap tasca.");
            return false;
        } else {
            LlistatTasques.remove();
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
                if (LlistatEspecies.contains(nomEspecie)) {
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

        LlistatEspecies.add(nomEspecie);
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

        if (LlistatEspecies.isEmpty()) {
            System.out.println("Aquest cuidador no te cap especie.");
            return false;
        }

        if (LlistatEspecies.contains(nomEspecie)) {
            LlistatEspecies.remove(nomEspecie);
            System.out.println("Especie eliminada correctament del cuidador.");
            return true;
        } else {
            System.out.println("El cuidador no te aquesta especie.");
            return false;
        }
    }
}
