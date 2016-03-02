package com.zoologic.aliment;

import java.util.ArrayDeque;

/**
 * Classe conte tota la informacio dels aliments.
 *
 * @author Sivi, Xavier, Jesus, Toni
 */
public class Aliment {

    /**
     * És la idAliment de l'aliment.
     */
    private int idAliment;
    /**
     * És el nomAliment de l'aliment.
     */
    private String nomAliment;
    /**
     * És la llista que conté la preparació de l'aliment.
     */
    private ArrayDeque<String> preparacioAliment;

    /**
     * Obtenim el valor assignat a l'atribut "idAliment".
     *
     * @return ens torna el valor assignat a l'atribut "idAliment".
     */
    public int getId() {
        return idAliment;
    }

    /**
     * Assignam un valor a l'atribut "idAliment".
     *
     * @param id és el codi d'identificació que té un aliment.
     */
    public void setId(int id) {
        this.idAliment = id;
    }

    /**
     * Obtenim el valor assignat a l'atribut "nomAliment".
     *
     * @return ens torna el valor assignat a l'atribut "nomAliment".
     */
    public String getNom() {
        return nomAliment;
    }

    /**
     * Assignam un valor a l'atribut "nomAliment".
     *
     * @param nom és el nomAliment que té un aliment.
     */
    public void setNom(String nom) {
        this.nomAliment = nom;
    }

    /**
     * Obtenir els valors assignats a l'atribut "preparacioAliment".
     *
     * @return ens torna els valors assignats a l'atribut "preparacioAliment".
     */
    public ArrayDeque<String> getPreparacio() {
        return preparacioAliment;
    }

    /**
     * Assignar uns valors a l'atribut "preparacioAliment".
     *
     * @param preparacio és la receta que té un aliment.
     */
    public void setPreparacio(ArrayDeque<String> preparacio) {
        this.preparacioAliment = preparacio;
    }

    /**
     * És el constructor dels atributs idAliment i nomAliment. Inicialitzam la llistes.
     *
     * @param id és el codi d'identificació que té un aliment.
     * @param nom és el nomAliment que reb un aliment.
     */
    public Aliment(int id, String nom) {
        this.idAliment = id;
        this.nomAliment = nom;
        this.preparacioAliment = new ArrayDeque<>();
    }

    /**
     * És el mètode que retorna una cadena que representa l'objecte Aliment.
     *
     * @return ens torna "Aliment {idAliment= "el codi que té l'aliment", nomAliment= "el nomAliment
 que té l'aliment", preparacioAliment= "la receta que té l'aliment".
     */
    @Override
    public String toString() {
        return "Aliment{" + "id=" + idAliment + ", nom=" + nomAliment + ", preparacio=" + preparacioAliment + '}';
    }

    /**
     * Aquest métode afegeix una cadena a l'ArrayList preparacioAliment.
     *
     * @param pas és la cadena que afegim a la llista.
     * @return true si la pogut afegir i false si no.
     */
    public boolean afegirPreparacio(String pas) {
        if (preparacioAliment.contains(pas)) {
            return false;
        } else {
            preparacioAliment.add(pas);
            return true;
        }
    }

    /**
     * Aquest métode elimina una cadena de l'ArrayList preparacioAliment.
     *
     * @param pas és la cadena que eliminam de la llista.
     * @return true si la pogut eliminar i false si no.
     */
    public boolean eliminarPreparacio(String pas) {
        if (preparacioAliment.remove(pas)) {
            return true;
        } else {
            return false;
        }
    }

}
