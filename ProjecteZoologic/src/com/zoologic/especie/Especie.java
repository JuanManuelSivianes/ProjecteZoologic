package com.zoologic.especie;

import com.zoologic.aliment.Aliment;
import com.zoologic.cuidador.Cuidador;
import com.zoologic.espais.Espai;
import com.zoologic.exemplar.Exemplar;
import java.util.ArrayList;

/**
 * Classe que conte tota la informacio de cada especie.
 *
 * @author Sivi, Jesus, Toni, Xavier.
 */
public class Especie {

    /**
     * ID de la especie.
     */
    private int id;
    /**
     * Contador de les especies creades.
     */
    public static int contadorEspecies = 0;
    /**
     * Nom comu de la especie.
     */
    private String nomComu;
    /**
     * Nom cientific de la especie.
     */
    private String nomCientific;
    /**
     * Descripcio de la especie.
     */
    private String descripcio;
    /**
     * Llista del aliments de la especie.
     */
    private ArrayList<Aliment> LlistatAliment;
    /**
     * Llista dels cuidadors de la especie.
     */
    private ArrayList<Cuidador> LlistatCuidador;
    /**
     * Llista dels espais de la especie.
     */
    private ArrayList<Espai> LlistatEspais;

    /**
     * Llista dels exemplars de la especie.
     */
    private ArrayList<Exemplar> LlistatExemplars;

    /**
     * Obtenim el valor assignat a l'atribut "id".
     *
     * @return codi d'idenfiticacio de l'especie.
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
     * Obtenim els valors de la llista de exemplars.
     *
     * @return llista de exemplars.
     */
    public ArrayList<Exemplar> getLlistatExemplars() {
        return LlistatExemplars;
    }

    /**
     * És el Constructor de Especie amb els parametres nomComu, nomCientific i
     * descripcio. L'atribut id es inicialtizat amb el metode
     * incrementarContadorEspecie. Inicialitzam totes les llistes de la classe.
     *
     * @param nomComu és el nom comú de l'especie.
     * @param nomCientific és el nom científic de l'especie.
     * @param descripcio és una breu descripció de l'especie.
     */
    public Especie(String nomComu, String nomCientific, String descripcio) {
        this.id = Especie.incrementarContadorEspecie();
        this.nomComu = nomComu;
        this.nomCientific = nomCientific;
        this.descripcio = descripcio;
        LlistatAliment = new ArrayList<>();
        LlistatCuidador = new ArrayList<>();
        LlistatEspais = new ArrayList<>();
        LlistatExemplars = new ArrayList<>();
    }

    /**
     * És el métode que mostra la informacio completa del objecte mostrant el
     * valors del seus atributs.
     *
     * @return informacio completa del objecte.
     */
    @Override
    public String toString() {
        return "Especie{" + "id=" + id + ", nomComu=" + nomComu + ", nomCientific=" + nomCientific + ", descripcio=" + descripcio + ", LlistatAliment=" + LlistatAliment + ", LlistatCuidador=" + LlistatCuidador + '}';
    }

    /**
     * Donam valor al contador d'especies. Cada especie te un rang de mil.
     *
     * @return suma mil al valor actual del contador.
     */
    public static int incrementarContadorEspecie() {
        return contadorEspecies = contadorEspecies + 1000;
    }

    /**
     * Aquest metode afegeix a l'ArrayList de LlistatCuidador un cuidador.
     *
     * @param nomCuidador és l'objecte cuidador que afegim a la llista.
     * @return true si l'ha pogut afegir i false si el cuidador ja estava a la
     * llista.
     */
    public boolean afegirCuidadorEspecie(Cuidador nomCuidador) {
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
     * @param nomAliment és l'objecte aliment que afegim a la llista.
     * @return true si l'ha pogut afegir i false si l'aliment ja estava a la
     * llista.
     */
    public boolean afegirAlimentEspecie(Aliment nomAliment) {
        for (Aliment LlistatAliment1 : LlistatAliment) {
            if (LlistatAliment1.equals(nomAliment)) {
                return false;
            }
        }
        LlistatAliment.add(nomAliment);
        return true;
    }

    /**
     * Aquest mètode elimina de l'ArrayList de LlistatCuidador un cuidador. Si
     * la llista de cuidadors esta buida retorna false.
     *
     * @param nomCuidador és l'objecte cuidador que volem eliminar.
     * @return true si l'ha pogut eliminar i false, si no.
     */
    public boolean eliminarCuidadorEspecie(Cuidador nomCuidador) {

        if (LlistatCuidador.isEmpty()) {
            return false;
        }
        for (int i = 0; i < LlistatCuidador.size(); i++) {
            if (LlistatCuidador.get(i).equals(nomCuidador)) {
                LlistatCuidador.remove(nomCuidador);
                return true;
            }
        }
        return false;
    }

    /**
     * Aquest mètode elimnia de l'ArrayList de LlistatAliment un aliment. Si la
     * llista de aliments esta buida retorna false.
     *
     * @param nomAliment és l'objecte aliment que volem eliminar.
     * @return true si l'ha pogut eliminar i false, si no.
     */
    public boolean eliminarAlimentEspecie(Aliment nomAliment) {
        if (LlistatAliment.isEmpty()) {
            return false;
        }
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
     * @param nomEspai es l'objecte espai que afegim a la llista.
     * @return true si l'ha pogut afegir i false si l'espai ja estava a la
     * llista.
     */
    public boolean afegirEspaiEspecie(Espai nomEspai) {
        for (Espai LlistatEspai : LlistatEspais) {
            if (LlistatEspai.equals(nomEspai)) {
                return false;
            }
        }
        LlistatEspais.add(nomEspai);
        return true;
    }

    /**
     * Aquest mètode elimnia de l'ArrayList de LlistatEspais un espai. Si la
     * llista de espais esta buida retorna false.
     *
     * @param nomEspai es l'objecte espai que volem eliminar.
     * @return true si l'ha pogut eliminar i false, si no.
     */
    public boolean eliminarEspaiEspecie(Espai nomEspai) {
        if (LlistatEspais.isEmpty()) {
            return false;
        }
        for (int i = 0; i < LlistatEspais.size(); i++) {
            if (LlistatEspais.get(i).equals(nomEspai)) {
                LlistatEspais.remove(nomEspai);
                return true;
            }
        }
        return false;
    }

    /**
     * Aquest mètode afegeix a l'ArrayList de LlistatExemplars un exemplar.
     *
     * @param nomExemplar es l'objecte exemplar que afegim a la llista.
     * @return true si l'ha pogut afegir i false si l'espai ja estava a la
     * llista.
     */
    public boolean afegirExemplarEspecie(Exemplar nomExemplar) {
        for (Exemplar LlistatExemplar : LlistatExemplars) {
            if (LlistatExemplar.equals(nomExemplar)) {
                return false;
            }
        }
        LlistatExemplars.add(nomExemplar);
        return true;
    }

    /**
     * Aquest mètode elimnia de l'ArrayList de LlistatExemplars un exemplar. Si
     * la llista de exemplars esta buida retorna false.
     *
     * @param nomExemplar es l'objecte exemplar que volem eliminar.
     * @return true si l'ha pogut eliminar i false, si no.
     */
    public boolean eliminarExemplarEspecie(Exemplar nomExemplar) {
        if (LlistatExemplars.isEmpty()) {
            return false;
        }
        for (int i = 0; i < LlistatExemplars.size(); i++) {
            if (LlistatExemplars.get(i).equals(nomExemplar)) {
                LlistatExemplars.remove(nomExemplar);
                return true;
            }
        }
        return false;
    }
}
