package com.zoologic.especie;

import com.zoologic.aliment.Aliment;
import com.zoologic.cuidador.Cuidador;
import com.zoologic.espais.Espai;
import com.zoologic.exemplar.Exemplar;
import com.zoologic.zoo.Zoologic;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/**
 * Classe que conte tota la informacio de cada especie.
 *
 * @author Sivi, Xavier, Jesus, Toni
 */
public class Especie {

    /**
     * ID de la especie.
     */
    private int idEspecie;
    /**
     * Contador de les especies creades.
     */
    public static int contadorEspecies = 0;
    /**
     * Nom comu de la especie.
     */
    private String nomComuEspecie;
    /**
     * Nom cientific de la especie.
     */
    private String nomCientificEspecie;
    /**
     * Descripcio de la especie.
     */
    private String descripcioEspecie;
    /**
     * Llista del aliments de la especie.
     */
    private ArrayList<Aliment> llistatAlimentEspecie;
    /**
     * Llista dels cuidadors de la especie.
     */
    private HashSet<Cuidador> llistatCuidadorEspecie;
    /**
     * Llista dels espais de la especie.
     */
    private HashSet<Espai> llistatEspaisEspecie;

    /**
     * Llista dels exemplars de la especie.
     */
    private HashSet<Exemplar> llistatExemplarsEspecie;

    /**
     * Obtenim el valor assignat a l'atribut "idEspecie".
     *
     * @return codi d'idenfiticacio de l'especie.
     */
    public int getId() {
        return idEspecie;
    }

    /**
     * Obtenim el valor assignat a l'atribut "NomComu".
     *
     * @return nom comu.
     */
    public String getNomComu() {
        return nomComuEspecie;
    }

    /**
     * Assignam un valor a l'atribut "nomComuEspecie".
     *
     * @param nomComu és el nom comú de l'especie.
     */
    public void setNomComu(String nomComu) {
        this.nomComuEspecie = nomComu;
    }

    /**
     * Obtenim el valor assignat a l'atribut "nomCientificEspecie".
     *
     * @return nom científic.
     */
    public String getNomCientific() {
        return nomCientificEspecie;
    }

    /**
     * Assignam un valor a l'atribut "nomCientificEspecie".
     *
     * @param nomCientific és el nom científic de l'especie.
     */
    public void setNomCientific(String nomCientific) {
        this.nomCientificEspecie = nomCientific;
    }

    /**
     * Obtenim el valor assignat a l'atribut "descripcioEspecie".
     *
     * @return breu descripcioEspecie de l'especie.
     */
    public String getDescripcio() {
        return descripcioEspecie;
    }

    /**
     * Assignam un valor a l'atribut "Descripcio".
     *
     * @param descripcio és una breu descripció de l'especie.
     */
    public void setDescripcio(String descripcio) {
        this.descripcioEspecie = descripcio;
    }

    /**
     * Obtenim els valors de la llista d'espais.
     *
     * @return llista d'espais.
     */
    public HashSet<Espai> getLlistatEspais() {
        return llistatEspaisEspecie;
    }

    /**
     * Obtenim els valors de la llista d'aliments.
     *
     * @return llista d'aliments.
     */
    public ArrayList<Aliment> getLlistatAliment() {
        return llistatAlimentEspecie;
    }

    /**
     * Obtenim els valors de la llista de cuidadors.
     *
     * @return llista de cuidadors.
     */
    public HashSet<Cuidador> getLlistatCuidador() {
        return llistatCuidadorEspecie;
    }

    /**
     * Obtenim els valors de la llista de exemplars.
     *
     * @return llista de exemplars.
     */
    public HashSet<Exemplar> getLlistatExemplars() {
        return llistatExemplarsEspecie;
    }

    /**
     * És el Constructor de Especie amb els parametres nomComuEspecie, nomCientificEspecie i
 descripcioEspecie. L'atribut idEspecie es inicialtizat amb el metode
 incrementarContadorEspecie. Inicialitzam totes les llistes de la classe.
     *
     * @param nomComu és el nom comú de l'especie.
     * @param nomCientific és el nom científic de l'especie.
     * @param descripcio és una breu descripció de l'especie.
     */
    public Especie(String nomComu, String nomCientific, String descripcio) {
        this.idEspecie = Especie.incrementarContadorEspecie();
        this.nomComuEspecie = nomComu;
        this.nomCientificEspecie = nomCientific;
        this.descripcioEspecie = descripcio;
        llistatAlimentEspecie = new ArrayList<>();
        llistatCuidadorEspecie = new HashSet<>();
        llistatEspaisEspecie = new HashSet<>();
        llistatExemplarsEspecie = new HashSet<>();
    }

    /**
     * És el métode que mostra la informacio completa del objecte mostrant el
     * valors del seus atributs.
     *
     * @return informacio completa del objecte.
     */
    @Override
    public String toString() {
        return "Especie{" + "id=" + idEspecie + ", nomComu=" + nomComuEspecie + ", nomCientific=" + nomCientificEspecie + ", descripcio=" + descripcioEspecie + ", LlistatAliment=" + llistatAlimentEspecie + ", LlistatCuidador=" + llistatCuidadorEspecie + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nomCientificEspecie);
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
        final Especie other = (Especie) obj;
        if (!Objects.equals(this.nomCientificEspecie, other.nomCientificEspecie)) {
            return false;
        }
        return true;
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
     * Aquest metode afegeix a l'ArrayList de LlistatCuidadorEspecie un
     * cuidador.
     *
     * @param nomZoologic es el zoologic en el que cercam el cuidador i la
     * especie.
     * @param nomCuidador és l'objecte cuidador que afegim a la llista.
     * @return true si l'ha pogut afegir i false si el cuidador ja estava a la
     * llista, el cuidador no esta al zoo, la especie no esta al zoo o si la
     * especie ja te aquest cuidador.
     */
    public boolean afegirCuidadorEspecie(Zoologic nomZoologic, Cuidador nomCuidador) {
        if (nomZoologic.getLlistatEspecies().contains(Especie.this)) {
            if (nomZoologic.getLlistatCuidadors().contains(nomCuidador)) {
                if (llistatCuidadorEspecie.contains(nomCuidador)) {
                    System.out.println("Aquesta especie ja te aquest cuidador.");
                    return false;
                }
            } else {
                System.out.println("Aquest cuidador no esta al zoologic.");
                return false;
            }
        } else {
            System.out.println("Aquesta especie no esta al zoologic.");
            return false;
        }
        llistatCuidadorEspecie.add(nomCuidador);
        System.out.println("Cuidador afegit correctament a la especie.");
        return true;
    }

    /**
     * Aquest mètode elimina de l'ArrayList de LlistatCuidadorEspecie un
     *
     * @param nomCuidador és l'objecte cuidador que volem eliminar.
     * @return true si l'ha pogut eliminar i false si la llista de cuidadors
     * esta buida o la especie no te aquest cuidador..
     */
    public boolean eliminarCuidadorEspecie(Cuidador nomCuidador) {

        if (llistatCuidadorEspecie.isEmpty()) {
            System.out.println("Aquesta especie no te cap cuidador.");
            return false;
        }
        if (llistatCuidadorEspecie.contains(nomCuidador)) {
            llistatCuidadorEspecie.remove(nomCuidador);
            System.out.println("Cuidador eliminat correctament de la especie.");
            return true;
        } else {
            System.out.println("La especie no te aquest cuidador.");
            return false;
        }
    }

    /**
     * Aquest mètode afegeix a l'ArrayList de LlistatAlimentEspecie un aliment.
     *
     * @param nomAliment és l'objecte aliment que afegim a la llista.
     * @return true si l'ha pogut afegir i false si l'aliment ja estava a la
     * llista.
     */
    public boolean afegirAlimentEspecie(Aliment nomAliment) {
        if (llistatAlimentEspecie.contains(nomAliment)) {
            System.out.println("Aquesta especie ja te aquest aliment.");
            return false;
        } else {
            llistatAlimentEspecie.add(nomAliment);
            System.out.println("Aliment afegit correctament a la especie.");
            return true;
        }
    }

    /**
     * Aquest mètode elimnia de l'ArrayList de LlistatAlimentEspecie un aliment.
     * Si la llista de aliments esta buida retorna false.
     *
     * @param nomAliment és l'objecte aliment que volem eliminar.
     * @return false si la llista esta buida, true si l'ha pogut eliminar i
     * false si la especie no te aquest aliment.
     */
    public boolean eliminarAlimentEspecie(Aliment nomAliment) {
        if (llistatAlimentEspecie.isEmpty()) {
            System.out.println("Aquesta especie no te cap aliment.");
            return false;
        }
        if (llistatAlimentEspecie.contains(nomAliment)) {
            llistatAlimentEspecie.remove(nomAliment);
            System.out.println("Aliment eliminat correctament de la especie.");
            return true;
        } else {
            System.out.println("Aquesta especie no te aquest aliment.");
            return false;
        }
    }

    /**
     * Aquest mètode afegeix a l'ArrayList de LlistatEspaisEspecie un espai.
     *
     * @param nomZoologic
     * @param nomEspai es l'objecte espai que afegim a la llista.
     * @return true si l'ha pogut afegir i false si l'espai ja estava a la
     * llista, l'espai no esta al zoo, la especie no esta al zoo o si la especie
     * ja te aquest espai.
     */
    public boolean afegirEspaiEspecie(Zoologic nomZoologic, Espai nomEspai) {
        if (nomZoologic.getLlistatEspecies().contains(Especie.this)) {
            if (nomZoologic.getLlistatEspais().contains(nomEspai)) {
                if (llistatEspaisEspecie.contains(nomEspai)) {
                    System.out.println("Aquesta especie ja te aquest espai.");
                    return false;
                }
            } else {
                System.out.println("Aquest espai no esta al zoologic.");
                return false;
            }
        } else {
            System.out.println("Aquesta especie no esta al zoologic.");
            return false;
        }
        llistatEspaisEspecie.add(nomEspai);
        System.out.println("Espai afegit correctament a la especie.");
        return true;
    }

    /**
     * Aquest mètode elimnia de l'ArrayList de LlistatEspaisEspecie un espai.
     *
     * @param nomEspai es l'objecte espai que volem eliminar.
     * @return false si la llista esta buida, true si l'ha pogut eliminar i
     * false si l'espai no esta en la llista.
     */
    public boolean eliminarEspaiEspecie(Espai nomEspai) {
        if (llistatEspaisEspecie.isEmpty()) {
            System.out.println("Aquesta especie no te cap espai.");
            return false;
        }
        if (llistatEspaisEspecie.contains(nomEspai)) {
            llistatEspaisEspecie.remove(nomEspai);
            System.out.println("Espai eliminat correctmane de la especie.");
            return true;
        } else {
            System.out.println("Aquesta especie no te aquest espai.");
            return false;
        }
    }

    /**
     * Aquest mètode afegeix a l'ArrayList de LlistatExemplarsEspecie un
     * exemplar.
     *
     * @param nomExemplar es l'objecte exemplar que afegim a la llista.
     * @return true si l'ha pogut afegir i false si l'exemplar ja estava a la
     * llista.
     */
    public boolean afegirExemplarEspecie(Exemplar nomExemplar) {

        if (llistatExemplarsEspecie.contains(nomExemplar)) {
            System.out.println("Aquesta especie ja te aquest exemplar.");
            return false;
        } else {
            llistatExemplarsEspecie.add(nomExemplar);
            System.out.println("Exemplar afegit correctament a la especie.");
            return true;
        }
    }

    /**
     * Aquest mètode elimnia de l'ArrayList de LlistatExemplarsEspecie un
     * exemplar.
     *
     * @param nomExemplar es l'objecte exemplar que volem eliminar.
     * @return false si la llista esta buida, true si l'ha pogut eliminar i
     * false si l'exemplar no esta en la llista.
     */
    public boolean eliminarExemplarEspecie(Exemplar nomExemplar) {
        if (llistatExemplarsEspecie.isEmpty()) {
            System.out.println("Aquesta especie no te cap exemplar.");
            return false;
        }
        if (llistatExemplarsEspecie.contains(nomExemplar)) {
            llistatExemplarsEspecie.remove(nomExemplar);
            System.out.println("Exemplar eliminat correctament de la especie.");
            return true;
        } else {
            System.out.println("Aquesta especie no te aquest exemplar.");
            return false;
        }
    }
}
