package com.zoologic.aliment;

import java.util.ArrayDeque;

/**
 * Classe conte tota la informacio dels aliments.
 *
 * @author Sivi, Xavier, Jesus, Toni
 */
public class Aliment {

    /**
     * És la id de l'aliment.
     */
    private int id;
    /**
     * És el nom de l'aliment.
     */
    private String nom;
    /**
     * És la llista que conté la preparació de l'aliment.
     */
    private ArrayDeque<String> preparacio;

    /**
     * Obtenim el valor assignat a l'atribut "id".
     *
     * @return ens torna el valor assignat a l'atribut "id".
     */
    public int getId() {
        return id;
    }

    /**
     * Assignam un valor a l'atribut "id".
     *
     * @param id és el codi d'identificació que té un aliment.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtenim el valor assignat a l'atribut "nom".
     *
     * @return ens torna el valor assignat a l'atribut "nom".
     */
    public String getNom() {
        return nom;
    }

    /**
     * Assignam un valor a l'atribut "nom".
     *
     * @param nom és el nom que té un aliment.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Obtenir els valors assignats a l'atribut "preparacio".
     *
     * @return ens torna els valors assignats a l'atribut "preparacio".
     */
    public ArrayDeque<String> getPreparacio() {
        return preparacio;
    }

    /**
     * Assignar uns valors a l'atribut "preparacio".
     *
     * @param preparacio és la receta que té un aliment.
     */
    public void setPreparacio(ArrayDeque<String> preparacio) {
        this.preparacio = preparacio;
    }

    /**
     * És el constructor dels atributs id i nom. Inicialitzam la llistes.
     *
     * @param id és el codi d'identificació que té un aliment.
     * @param nom és el nom que reb un aliment.
     */
    public Aliment(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.preparacio = new ArrayDeque<>();
    }

    /**
     * És el mètode que retorna una cadena que representa l'objecte Aliment.
     *
     * @return ens torna "Aliment {id= "el codi que té l'aliment", nom= "el nom
     * que té l'aliment", preparacio= "la receta que té l'aliment".
     */
    @Override
    public String toString() {
        return "Aliment{" + "id=" + id + ", nom=" + nom + ", preparacio=" + preparacio + '}';
    }

    /**
     * Aquest métode afegeix una cadena a l'ArrayList preparacio.
     *
     * @param pas és la cadena que afegim a la llista.
     * @return true si la pogut afegir i false si no.
     */
    public boolean afegirPreparacio(String pas) {
        if (preparacio.contains(pas)) {
            return false;
        } else {
            preparacio.add(pas);
            return true;
        }
    }

    /**
     * Aquest métode elimina una cadena de l'ArrayList preparacio.
     *
     * @param pas és la cadena que eliminam de la llista.
     * @return true si la pogut eliminar i false si no.
     */
    public boolean eliminarPreparacio(String pas) {
        if (preparacio.remove(pas)) {
            return true;
        } else {
            return false;
        }
    }

}
