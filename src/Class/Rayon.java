/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.ArrayList;

/**
 *
 * @author elyah
 */
public class Rayon {
    private int idRayon;
    private String nomRayon;
    private ArrayList<Travailler> lesTravailler;
    
    public Rayon(int unId,String unNom){
        idRayon=unId;
        nomRayon=unNom;
        lesTravailler=new ArrayList<>();
    }

    /**
     * @return the idRayon
     */
    public int getIdRayon() {
        return idRayon;
    }

    /**
     * @return the nomRayon
     */
    public String getNomRayon() {
        return nomRayon;
    }

    /**
     * @return the lesTravailler
     */
    public ArrayList<Travailler> getLesTravailler() {
        return lesTravailler;
    }
    
    
}
