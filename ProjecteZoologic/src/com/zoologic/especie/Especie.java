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
    private String nomComu;
    private String nomCientific;
    private String descripcio;
    private ArrayList <Aliment> LlistatAliment;
    private ArrayList <Cuidador> LlistatCuidador;
    private ArrayList <Espai> LlistatEspais;

    /**
     * És el Constructor dels atributs id, nomComu, nomCientific i descripcio.
     * @param id és el codi d'identificació de l'especie.
     * @param nomComu és el nom comú de l'especie.
     * @param nomCientific és el nom científic de l'especie.
     * @param descripcio és una breu descripció de l'especie.
     */
    public Especie(int id, String nomComu, String nomCientific, String descripcio) {
        this.id = id;
        this.nomComu = nomComu;
        this.nomCientific = nomCientific;
        this.descripcio = descripcio;
        LlistatAliment = new ArrayList<>();
        LlistatCuidador = new ArrayList<>();
        LlistatEspais = new ArrayList<>();
    }

    /**
     * És el métode que retorna una cadena que representa l'objecte Especie.
     * @return
     */
    @Override
    public String toString() {
        return "Especie{" + "id=" + id + ", nomComu=" + nomComu + ", nomCientific=" + nomCientific + ", descripcio=" + descripcio + ", LlistatAliment=" + LlistatAliment + ", LlistatCuidador=" + LlistatCuidador + '}';
    }

    
    /**
     * Obtenim el valor assignat a l'atribut "id".
     * @return codi d'idenfiticacio.
     */
    public int getId() {
        return id;
    }

    /**
     * Assignam un valor a l'atribut "id"
     * @param id és el codi d'identificació de l'especie.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtenim el valor assignat a l'atribut "NomComu".
     * @return nom comu.
     */
    public String getNomComu() {
        return nomComu;
    }

    /**
     * Assignam un valor a l'atribut "nomComu".
     * @param nomComu és el nom comú de l'especie.
     */
    public void setNomComu(String nomComu) {
        this.nomComu = nomComu;
    }

    /**
     * Obtenim el valor assignat a l'atribut "nomCientific".
     * @return nom científic.
     */
    public String getNomCientific() {
        return nomCientific;
    }
    
    /**
     * Assignam un valor a l'atribut "nomCientific".
     * @param nomCientific és el nom científic de l'especie. 
     */
    public void setNomCientific(String nomCientific) {
        this.nomCientific = nomCientific;
    }

    /**
     * Obtenim el valor assignat a l'atribut "descripcio".
     * @return 
     */
    public String getDescripcio() {
        return descripcio;
    }
    
/**
 * Assignam un valor a l'atribut "Descripcio".
 * @param descripcio és una breu descripció de l'especie.
 */
    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }
    
    /**
     * Aquest metode afegeix a l'ArrayList de LlistatCuidador el nom del cuidador.
     * @param nomCuidador és el nom del cuidador de l'especie.
     * @return 
     */
    public boolean afegirCuidador(Cuidador nomCuidador){
        for(int i=0; i<LlistatCuidador.size();i++){
            if (LlistatCuidador.get(i).equals(nomCuidador)){
                System.out.println("Aquest cuidador ja està a la llista.");
                return false;
            }
        }
        LlistatCuidador.add(nomCuidador);
        return true;
    }
    
    /**
     * Aquest mètode afegeix a l'ArrayList de LlistatAliment l'aliment.
     * @param nomAliment és el nom de l'aliment de l'especie.
     * @return 
     */
    public boolean afegirAliment(Aliment nomAliment){
        for(int i=0;i<LlistatAliment.size();i++){
            if (LlistatAliment.get(i).equals(nomAliment)){
                System.out.println("Aquest aliment ja està a la llista.");
                return false;
            }
        }
        LlistatAliment.add(nomAliment);
        return true;
    }
    
    /**
     * Aquest mètode elimina de l'ArrayList de LlistatCuidador el nom del cuidador.
     * @param nomCuidador és el nom del cuidador de l'especie.
     * @return 
     */
    public boolean eliminarCuidador(Cuidador nomCuidador){
        for(int i=0;i<LlistatCuidador.size();i++){
            if (LlistatCuidador.get(i).equals(nomCuidador)){
                LlistatCuidador.remove(nomCuidador);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Aquest mètode elimnia de l'ArrayList de LlistatAliment el nom de l'aliment.
     * @param nomAliment és el nom de l'aliment de l'especie.
     * @return 
     */
    public boolean eliminarAliment(Aliment nomAliment){
        for(int i=0;i<LlistatAliment.size();i++){
            if (LlistatAliment.get(i).equals(nomAliment)){
                LlistatAliment.remove(nomAliment);
                return true;
            }
        }
        return false;
    }
    
    public boolean afegirEspai(Espai nomEspai){
        for(int i=0; i<LlistatEspais.size();i++){
            if (LlistatEspais.get(i).equals(nomEspai)){
                System.out.println("Aquest espai ja està a la llista.");
                return false;
            }
        }
        LlistatEspais.add(nomEspai);
        return true;
    }
    
       public boolean eliminarEspai(Espai nomEspai){
        for(int i=0; i<LlistatEspais.size();i++){
            if (LlistatEspais.get(i).equals(nomEspai)){
                LlistatEspais.remove(nomEspai);
                return true;
            }
        }
           System.out.println("Aquest espai no esta en aquesta especie.");
        return false;
    }
    
}   
