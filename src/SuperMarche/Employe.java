/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperMarche;

/**
 *
 * @author elyah
 */
public class Employe {
    private int idEmploye;
    private String nomEmploye;
    
    public Employe(int unId, String unNom){
        idEmploye=unId;
        nomEmploye=unNom;
    }

    /**
     * @return the idEmploye
     */
    public int getIdEmploye() {
        return idEmploye;
    }

    /**
     * @return the nomEmploye
     */
    public String getNomEmploye() {
        return nomEmploye;
    }
    
}
