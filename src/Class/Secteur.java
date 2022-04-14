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
public class Secteur {
    private int idSecteur;
    private String nomSecteur;
    private ArrayList<Rayon> lesRayons;
    
    public Secteur(int unId,String unNom){
        idSecteur=unId;
        nomSecteur=unNom;
        lesRayons=new ArrayList<>();
    
    }

    /**
     * @return the idSecteur
     */
    public int getIdSecteur() {
        return idSecteur;
    }

    /**
     * @return the nomSecteur
     */
    public String getNomSecteur() {
        return nomSecteur;
    }

    /**
     * @return the lesRayons
     */
    public ArrayList<Rayon> getLesRayons() {
        return lesRayons;
    }
    
}
