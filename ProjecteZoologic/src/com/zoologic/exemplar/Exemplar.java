package com.zoologic.exemplar;

import com.zoologic.especie.Especie;
import com.zoologic.aliment.Aliment;
import java.util.ArrayList;

/**
 *
 * @author Sivi, Xavier, Jesus, Toni
 */
public class Exemplar {

    private int id;
    private static int contadorExemplars = 1;
    private String nom;
    private Especie nomEspecie;
    private ArrayList<Aliment> LlistatAliments;

    /**
     * Obtenim el valor assignat a l'atribut "id".
     *
     * @return codi d'idenfiticacio de l'exemplar.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtenir el valor assignat a l'atribut "nom"
     *
     * @return nom de l'exemplar.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Assignam el valor assignat a l'atribut "nom"
     *
     * @param nom és el nom que reb l'exemplar
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Obteir els valor de la llista LlistaAliments.
     *
     * @return llista de aliments.
     */
    public ArrayList<Aliment> getAliments() {
        return LlistatAliments;
    }

    /**
     * Obtenir el valor assigntat a l'atribut "nomEspecie".
     *
     * @return nom de l'especie de la cual pertany l'exemplar.
     */
    public Especie getEspecie() {
        return nomEspecie;
    }

    /**
     * Assignam un valor a l'atribut "nomEspecie".
     *
     * @param especie és el nom de l'especie de la cual pertany l'exemplar.
     */
    public void setEspecie(Especie especie) {
        this.nomEspecie = especie;
    }

    /**
     * És el constructor dels atributs nom i nomEspecie. L'atribut id es
     * inicialtizat amb un increment de l'atribut contador. Inicialitzam la
     * llista de la classe.
     *
     * @param nom és el nom que té un exemplar.
     * @param nomEspecie és el nom de l'especie que té l'exemplar.
     */
    public Exemplar(String nom, Especie nomEspecie) {
        this.id = contadorExemplars++;
        this.nom = nom;
        this.nomEspecie = nomEspecie;
        this.LlistatAliments = new ArrayList<>();
    }

    /**
     * És el mètode que retorna una cadena que representa l'objecte Especie.
     *
     * @return cadena que representa l'objecte.
     */
    @Override
    public String toString() {
        return "Exemplar{" + "id=" + id + ", nom=" + nom + ", especie=" + nomEspecie + ", aliments=" + LlistatAliments + '}';
    }

    /**
     * Aquest mètode afegeix a l'ArrayList de LlistaAliments un aliment.
     *
     * @param nomAliment és l'aliment que afegim a la llista.
     * @return true si l'ha pogut afegir i false si l'aliment ja estava a la
     * llista.
     */
    public boolean afegirAlimentExemplar(Aliment nomAliment) {
        for (Aliment LlistatAliment : LlistatAliments) {
            if (LlistatAliment.equals(nomAliment)) {
                return false;
            }
        }
        LlistatAliments.add(nomAliment);
        return true;
    }

    /**
     * Aquest mètode elimnia de l'ArrayList de LlistaAliments un aliment.
     *
     * @param nomAliment es l'aliment que volem eliminar.
     * @return true si l'ha pogut eliminar i false, si no.
     */
    public boolean eliminarAliment(Aliment nomAliment) {
        for (int i = 0; i < LlistatAliments.size(); i++) {
            if (LlistatAliments.get(i).equals(nomAliment)) {
                LlistatAliments.remove(nomAliment);
                return true;
            }
        }
        return false;
    }

}
