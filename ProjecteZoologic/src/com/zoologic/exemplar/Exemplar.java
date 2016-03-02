package com.zoologic.exemplar;

import com.zoologic.especie.Especie;
import com.zoologic.aliment.Aliment;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Classe que conte tota la informacio del exemplars de cada especie.
 *
 * @author Sivi, Xavier, Jesus, Toni
 */
public class Exemplar {

    /**
     * ID de l'exemplar.
     */
    private int idExemplar;
    /**
     * Contador de exemplars creats.
     */
    private static int contadorExemplars = 1;
    /**
     * Nom de l'exemplar.
     */
    private String nomExemplar;
    /**
     * Especie a la que pertany l'exemplar.
     */
    private Especie nomEspecieExemplar;
    /**
     * ArrayList del aliments de l'exemplar.
     */
    private ArrayList<Aliment> llistatAlimentsExemplar;

    /**
     * Obtenim el valor assignat a l'atribut "idEspecie".
     *
     * @return codi d'idenfiticacio de l'exemplar.
     */
    public int getId() {
        return idExemplar;
    }

    /**
     * Obtenir el valor assignat a l'atribut "nomExemplar"
     *
     * @return nomExemplar de l'exemplar.
     */
    public String getNom() {
        return nomExemplar;
    }

    /**
     * Assignam el valor a l'atribut "nomExemplar"
     *
     * @param nom és el nomExemplar que reb l'exemplar
     */
    public void setNom(String nom) {
        this.nomExemplar = nom;
    }

    /**
     * Obteir els valor de la llista LlistaAliments.
     *
     * @return llista de aliments.
     */
    public ArrayList<Aliment> getAliments() {
        return llistatAlimentsExemplar;
    }

    /**
     * Obtenir el valor assigntat a l'atribut "nomEspecie".
     *
     * @return nomExemplar de l'especie de la cual pertany l'exemplar.
     */
    public Especie getEspecie() {
        return nomEspecieExemplar;
    }

    /**
     * Assignam un valor a l'atribut "nomEspecie".
     *
     * @param especie és el nomExemplar de l'especie de la cual pertany l'exemplar.
     */
    public void setEspecie(Especie especie) {
        this.nomEspecieExemplar = especie;
    }

    /**
     * És el constructor de Exemplar amb els parametres nomExemplar i nomEspecie.
     * L'atribut idEspecie es inicialtizat amb un increment de l'atribut contador.
 Inicialitzam la llista de la classe.
     *
     * @param nom és el nomExemplar que té un exemplar.
     * @param nomEspecie és el nomExemplar de l'especie que té l'exemplar.
     */
    public Exemplar(String nom, Especie nomEspecie) {
        this.idExemplar = contadorExemplars++;
        this.nomExemplar = nom;
        this.nomEspecieExemplar = nomEspecie;
        this.llistatAlimentsExemplar = new ArrayList<>();
    }

    /**
     * És el métode que mostra la informacio completa del objecte mostrant el
     * valors del seus atributs.
     *
     * @return informacio completa del objecte.
     */
    @Override
    public String toString() {
        return "Exemplar{" + "id=" + idExemplar + ", nom=" + nomExemplar + ", especie=" + nomEspecieExemplar + ", aliments=" + llistatAlimentsExemplar + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.nomExemplar);
        hash = 11 * hash + Objects.hashCode(this.nomEspecieExemplar);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Exemplar other = (Exemplar) obj;
        if (!Objects.equals(this.nomExemplar, other.nomExemplar)) {
            return false;
        }
        if (!Objects.equals(this.nomEspecieExemplar, other.nomEspecieExemplar)) {
            return false;
        }
        return true;
    }

    /**
     * Aquest mètode afegeix a l'ArrayList de LlistaAliments un aliment.
     *
     * @param nomAliment és l'objecte aliment que afegim a la llista.
     * @return true si l'ha pogut afegir i false si l'aliment ja estava a la
     * llista.
     */
    public boolean afegirAlimentExemplar(Aliment nomAliment) {
        if (llistatAlimentsExemplar.contains(nomAliment)) {
            System.out.println("Aquest exemplar ja te aquest aliment.");
            return false;
        } else {
            llistatAlimentsExemplar.add(nomAliment);
            System.out.println("Aliment afegit correctament a l'exemplar.");
            return true;
        }
    }

    /**
     * Aquest mètode elimnia de l'ArrayList de LlistaAliments un aliment.
     *
     * @param nomAliment es l'objecte aliment que volem eliminar.
     * @return true si l'ha pogut eliminar i false, si no.
     */
    public boolean eliminarAlimentExemplar(Aliment nomAliment) {
        if (llistatAlimentsExemplar.isEmpty()) {
            System.out.println("Aquest exemplar no te cap aliment.");
            return false;
        }
        if (llistatAlimentsExemplar.contains(nomAliment)) {
            llistatAlimentsExemplar.remove(nomAliment);
            System.out.println("Aliment aliminat correctament de l'exemplar.");
            return true;
        } else {
            System.out.println("Aquest exemplar no te aquest aliment.");
            return false;
        }
    }

}
