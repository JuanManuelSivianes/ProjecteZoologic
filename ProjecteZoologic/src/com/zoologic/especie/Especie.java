package com.zoologic.especie;

import com.zoologic.aliment.Aliment;
import com.zoologic.cuidador.Cuidador;
import com.zoologic.espais.Espai;
import java.util.ArrayList;

/**
 *
 * @author Sivi, Jesus, Toni, Xavier.
 */
public class Especie {

    private int id;
    public static int contadorEspecies = 0;
    private String nomComu;
    private String nomCientific;
    private String descripcio;
    private ArrayList<Aliment> LlistatAliment;
    private ArrayList<Cuidador> LlistatCuidador;
    private ArrayList<Espai> LlistatEspais;

    /**
     * És el Constructor dels atributs nomComu, nomCientific i descripcio.
     *
     * @param nomComu és el nom comú de l'especie.
     * @param nomCientific és el nom científic de l'especie.
     * @param descripcio és una breu descripció de l'especie. L'atribut id es
     * inicialtizat amb el metode incrementarContador. Inicialitzam totes les
     * llistes de la classe.
     */
    public Especie(String nomComu, String nomCientific, String descripcio) {
        this.id = Especie.incrementarContador();
        this.nomComu = nomComu;
        this.nomCientific = nomCientific;
        this.descripcio = descripcio;
        LlistatAliment = new ArrayList<>();
        LlistatCuidador = new ArrayList<>();
        LlistatEspais = new ArrayList<>();

    }

    /**
     * És el métode que retorna una cadena que representa l'objecte Especie.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Especie{" + "id=" + id + ", nomComu=" + nomComu + ", nomCientific=" + nomCientific + ", descripcio=" + descripcio + ", LlistatAliment=" + LlistatAliment + ", LlistatCuidador=" + LlistatCuidador + '}';
    }

    /**
     * Obtenim el valor assignat a l'atribut "id".
     *
     * @return codi d'idenfiticacio.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtenim el valor assignat a l'atribut "NomComu".
     *
     * @return nom comu.
     */
    public String getNomComu() {
        return nomComu;
    }

    /**
     * Assignam un valor a l'atribut "nomComu".
     *
     * @param nomComu és el nom comú de l'especie.
     */
    public void setNomComu(String nomComu) {
        this.nomComu = nomComu;
    }

    /**
     * Obtenim el valor assignat a l'atribut "nomCientific".
     *
     * @return nom científic.
     */
    public String getNomCientific() {
        return nomCientific;
    }

    /**
     * Assignam un valor a l'atribut "nomCientific".
     *
     * @param nomCientific és el nom científic de l'especie.
     */
    public void setNomCientific(String nomCientific) {
        this.nomCientific = nomCientific;
    }

    /**
     * Obtenim el valor assignat a l'atribut "descripcio".
     *
     * @return breu descripcio de l'especie.
     */
    public String getDescripcio() {
        return descripcio;
    }

    /**
     * Assignam un valor a l'atribut "Descripcio".
     *
     * @param descripcio és una breu descripció de l'especie.
     */
    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    /**
     * Obtenim els valors de la llista d'espais.
     *
     * @return llista d'espais.
     */
    public ArrayList<Espai> getLlistatEspais() {
        return LlistatEspais;
    }

    /**
     * Obtenim els valors de la llista d'aliments.
     *
     * @return llista d'aliments.
     */
    public ArrayList<Aliment> getLlistatAliment() {
        return LlistatAliment;
    }

    /**
     * Obtenim els valors de la llista de cuidadors.
     *
     * @return llista de cuidadors.
     */
    public ArrayList<Cuidador> getLlistatCuidador() {
        return LlistatCuidador;
    }

    /**
     * Donam valor al contador d'especies. Cada especie te un rang de mil.
     *
     * @return suma mil al valor actual del contador.
     */
    public static int incrementarContador() {
        return contadorEspecies = contadorEspecies + 1000;
    }

    /**
     * Aquest metode afegeix a l'ArrayList de LlistatCuidador un cuidador.
     *
     * @param nomCuidador és l'objecte cuidador que afegim a la llista.
     * @return true si l'ha pogut afegir i false si el cuidador ja estaba a la
     * llista.
     */
    public boolean afegirCuidador(Cuidador nomCuidador) {
        for (Cuidador LlistatCuidador1 : LlistatCuidador) {
            if (LlistatCuidador1.equals(nomCuidador)) {
                return false;
            }
        }
        LlistatCuidador.add(nomCuidador);
        return true;
    }

    /**
     * Aquest mètode afegeix a l'ArrayList de LlistatAliment un aliment.
     *
     * @param nomAliment és l'aliment que afegim a la llista.
     * @return true si l'ha pogut afegir i false si l'aliment ja estaba a la
     * llista.
     */
    public boolean afegirAliment(Aliment nomAliment) {
        for (Aliment LlistatAliment1 : LlistatAliment) {
            if (LlistatAliment1.equals(nomAliment)) {
                return false;
            }
        }
        LlistatAliment.add(nomAliment);
        return true;
    }

    /**
     * Aquest mètode elimina de l'ArrayList de LlistatCuidador un cuidador.
     *
     * @param nomCuidador és el cuidador que volem eliminar.
     * @return true si l'ha pogut eliminar i false, si no.
     */
    public boolean eliminarCuidador(Cuidador nomCuidador) {
        for (int i = 0; i < LlistatCuidador.size(); i++) {
            if (LlistatCuidador.get(i).equals(nomCuidador)) {
                LlistatCuidador.remove(nomCuidador);
                return true;
            }
        }
        return false;
    }

    /**
     * Aquest mètode elimnia de l'ArrayList de LlistatAliment un aliment.
     *
     * @param nomAliment és l'aliment que volem eliminar.
     * @return true si l'ha pogut eliminar i false, si no.
     */
    public boolean eliminarAliment(Aliment nomAliment) {
        for (int i = 0; i < LlistatAliment.size(); i++) {
            if (LlistatAliment.get(i).equals(nomAliment)) {
                LlistatAliment.remove(nomAliment);
                return true;
            }
        }
        return false;
    }

    /**
     * Aquest mètode afegeix a l'ArrayList de LlistatEspais un espai.
     *
     * @param nomEspai es l'espai que afegim a la llista.
     * @return true si l'ha pogut afegir i false si l'espai ja estaba a la
     * llista.
     */
    public boolean afegirEspai(Espai nomEspai) {
        for (Espai LlistatEspai : LlistatEspais) {
            if (LlistatEspai.equals(nomEspai)) {
                return false;
            }
        }
        LlistatEspais.add(nomEspai);
        return true;
    }

    /**
     * Aquest mètode elimnia de l'ArrayList de LlistatEspais un espai.
     *
     * @param nomEspai es l'espai que volem eliminar.
     * @return true si l'ha pogut eliminar i false, si no.
     */
    public boolean eliminarEspai(Espai nomEspai) {
        for (int i = 0; i < LlistatEspais.size(); i++) {
            if (LlistatEspais.get(i).equals(nomEspai)) {
                LlistatEspais.remove(nomEspai);
                return true;
            }
        }
        return false;
    }

}
