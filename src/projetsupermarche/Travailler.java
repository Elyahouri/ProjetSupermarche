/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetsupermarche;

/**
 *
 * @author elyah
 */
public class Travailler {
    private Employe unEmploye;
    private int tempsPasse;
    
    public Travailler(Employe unEmploye, int unTempsPasse){
        this.unEmploye=unEmploye;
        tempsPasse=unTempsPasse;
    }

    /**
     * @return the unEmploye
     */
    public Employe getUnEmploye() {
        return unEmploye;
    }

    /**
     * @return the tempsPasse
     */
    public int getTempsPasse() {
        return tempsPasse;
    }
    
}
