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
    private ArrayList<Aliment> LlistatAlimentEspecie;
    /**
     * Llista dels cuidadors de la especie.
     */
    private HashSet<Cuidador> LlistatCuidadorEspecie;
    /**
     * Llista dels espais de la especie.
     */
    private HashSet<Espai> LlistatEspaisEspecie;

    /**
     * Llista dels exemplars de la especie.
     */
    private HashSet<Exemplar> LlistatExemplarsEspecie;

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
    public HashSet<Espai> getLlistatEspais() {
        return LlistatEspaisEspecie;
    }

    /**
     * Obtenim els valors de la llista d'aliments.
     *
     * @return llista d'aliments.
     */
    public ArrayList<Aliment> getLlistatAliment() {
        return LlistatAlimentEspecie;
    }

    /**
     * Obtenim els valors de la llista de cuidadors.
     *
     * @return llista de cuidadors.
     */
    public HashSet<Cuidador> getLlistatCuidador() {
        return LlistatCuidadorEspecie;
    }

    /**
     * Obtenim els valors de la llista de exemplars.
     *
     * @return llista de exemplars.
     */
    public HashSet<Exemplar> getLlistatExemplars() {
        return LlistatExemplarsEspecie;
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
        LlistatAlimentEspecie = new ArrayList<>();
        LlistatCuidadorEspecie = new HashSet<>();
        LlistatEspaisEspecie = new HashSet<>();
        LlistatExemplarsEspecie = new HashSet<>();
    }

    /**
     * És el métode que mostra la informacio completa del objecte mostrant el
     * valors del seus atributs.
     *
     * @return informacio completa del objecte.
     */
    @Override
    public String toString() {
        return "Especie{" + "id=" + id + ", nomComu=" + nomComu + ", nomCientific=" + nomCientific + ", descripcio=" + descripcio + ", LlistatAliment=" + LlistatAlimentEspecie + ", LlistatCuidador=" + LlistatCuidadorEspecie + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nomCientific);
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
        if (!Objects.equals(this.nomCientific, other.nomCientific)) {
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
                if (LlistatCuidadorEspecie.contains(nomCuidador)) {
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
        LlistatCuidadorEspecie.add(nomCuidador);
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

        if (LlistatCuidadorEspecie.isEmpty()) {
            System.out.println("Aquesta especie no te cap cuidador.");
            return false;
        }
        if (LlistatCuidadorEspecie.contains(nomCuidador)) {
            LlistatCuidadorEspecie.remove(nomCuidador);
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
        if (LlistatAlimentEspecie.contains(nomAliment)) {
            System.out.println("Aquesta especie ja te aquest aliment.");
            return false;
        } else {
            LlistatAlimentEspecie.add(nomAliment);
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
        if (LlistatAlimentEspecie.isEmpty()) {
            return false;
        }
        if (LlistatAlimentEspecie.contains(nomAliment)) {
            LlistatAlimentEspecie.remove(nomAliment);
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
                if (LlistatEspaisEspecie.contains(nomEspai)) {
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
        LlistatEspaisEspecie.add(nomEspai);
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
        if (LlistatEspaisEspecie.isEmpty()) {
            return false;
        }
        if (LlistatEspaisEspecie.contains(nomEspai)) {
            LlistatEspaisEspecie.remove(nomEspai);
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

        if (LlistatExemplarsEspecie.contains(nomExemplar)) {
            System.out.println("Aquesta especie ja te aquest exemplar.");
            return false;
        } else {
            LlistatExemplarsEspecie.add(nomExemplar);
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
        if (LlistatExemplarsEspecie.isEmpty()) {
            return false;
        }
        if (LlistatExemplarsEspecie.contains(nomExemplar)) {
            LlistatExemplarsEspecie.remove(nomExemplar);
            System.out.println("Exemplar eliminat correctament de la especie.");
            return true;
        } else {
            System.out.println("Aquesta especie no te aquest exemplar.");
            return false;
        }
    }
}
