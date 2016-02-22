package com.zoologic.aliment;

import java.util.ArrayDeque;
import java.util.Collections;

/**
 *
 * @author Sivi, Jesus, Xavier, Toni
 */
public class Aliment {

    private int id;
    private String nom;
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
     * És el constructor dels atributs id i nom.
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

    public boolean afegirPreparacio(String prepa) {
        if(preparacio.contains(prepa)){
            return false;
        }else{
         preparacio.add(prepa);
         return true;
        }
    }

    public void eliminarPreparacio(String prepa) {
        preparacio.remove(prepa);
    }

}
