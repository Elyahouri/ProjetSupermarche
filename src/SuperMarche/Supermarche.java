/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SuperMarche;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author elyah
 */
public class Supermarche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Les objets de type Secteur
        Secteur sect1 = new Secteur(1,"Produits frais");
        Secteur sect2 = new Secteur(2,"Multimédia");
        
        //Les objets de type Rayon
        Rayon ray1 = new Rayon(1,"Légumes");
        Rayon ray2 = new Rayon(2,"Fruits");
        Rayon ray3 = new Rayon(3,"Poissons");
        Rayon ray4 = new Rayon(4,"Informatique");
        Rayon ray5 = new Rayon(5,"TV & divers");
        
        //Les objets de type Employe
        Employe emp1 = new Employe(1,"François");
        Employe emp2 = new Employe(2,"Marie");
        Employe emp3 = new Employe(3,"Lucile");
        Employe emp4 = new Employe(4,"Pierre");
        Employe emp5 = new Employe(5,"Stéphanie");
        Employe emp6 = new Employe(6,"Paul");
        
        //Les objets de type Travailler
        Travailler trav1 = new Travailler(emp1,4);
        Travailler trav2 = new Travailler(emp2,8);
        Travailler trav3 = new Travailler(emp3,4);
        Travailler trav4 = new Travailler(emp4,2);
        Travailler trav5 = new Travailler(emp5,6);
        Travailler trav6 = new Travailler(emp6,5);
        Travailler trav7 = new Travailler(emp1,4);
        Travailler trav8 = new Travailler(emp3,3);
        Travailler trav9 = new Travailler(emp2,9);
        Travailler trav10 = new Travailler(emp4,2);
        Travailler trav11 = new Travailler(emp5,5);
        
        //Ajout des employés et leur temps travaillé dans chaque rayon
        //Rayon 1
        ray1.getLesTravailler().add(trav1);ray1.getLesTravailler().add(trav2);ray1.getLesTravailler().add(trav3);
        //Rayon 2
        ray2.getLesTravailler().add(trav4);ray2.getLesTravailler().add(trav5);
        //Rayon 3
        ray3.getLesTravailler().add(trav6);ray3.getLesTravailler().add(trav7);ray3.getLesTravailler().add(trav8);
        //Rayon 4
        ray4.getLesTravailler().add(trav9);ray4.getLesTravailler().add(trav10);ray4.getLesTravailler().add(trav11);
        //Rayon 5
        ray5.getLesTravailler().add(trav1);ray5.getLesTravailler().add(trav3);ray5.getLesTravailler().add(trav5);
        
        //Ajout des rayons dans chaque secteur
        //Secteur 1
        sect1.getLesRayons().add(ray1);sect1.getLesRayons().add(ray2);sect1.getLesRayons().add(ray3);
        //Secteur 2
        sect2.getLesRayons().add(ray4);sect2.getLesRayons().add(ray5);
        
        //Création d'une collection des objets 'Secteur' nommée 'lesSecteurs'
        ArrayList<Secteur> lesSecteurs = new ArrayList<Secteur>();
        lesSecteurs.add(sect1);lesSecteurs.add(sect2);
        
        Scanner sc = new Scanner(System.in);
        int choix = 0;
        do {
            do {
                System.out.println("1 : Afficher toutes les infos");
                System.out.println("2 : Temps total pour un employé");
                System.out.println("3 : Temps moyen travaillé par l'ensemble des employés");
                System.out.println("0 : Quitter le programme");
                choix = sc.nextInt();

            } while (choix < 0 || choix > 4);

            switch (choix) {
                case 1:
                    for(Secteur s : lesSecteurs){
                        System.out.println("Id secteur = "+s.getIdSecteur()+" Nom secteur = "+s.getNomSecteur());
                        System.out.println("///////////////////////////////");
                        for(Rayon r : s.getLesRayons()){
                            System.out.println("Id rayon = "+r.getIdRayon()+" Nom rayon = "+ r.getNomRayon());
                            System.out.println("*******************************");
                            for(Travailler t : r.getLesTravailler()){
                                System.out.println("Id employe = "+t.getUnEmploye().getIdEmploye()+" Nom employe = "+t.getUnEmploye().getNomEmploye());
                                System.out.println("Temps passe = "+t.getTempsPasse());
                                System.out.println("-------------------------");
                            }
                        }
                    
                    }
                    
                    
                case 2:
                    
                case 3:
                    
                case 0:
                    System.out.println("FIN DU PROGRAME");
                    break;
            }
        } while (choix != 0);
    }
        
        
        
        
        
        
        
        
        
}
    

