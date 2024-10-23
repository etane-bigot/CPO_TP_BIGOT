/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_bigot;

/**
 *
 * @author etane
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire ;

    public Voiture(String Modele, String Marque, int PuissanceCV) {
        this.Modele = Modele;
        this.Marque = Marque;
        this.PuissanceCV = PuissanceCV;
        this.Proprietaire=null;
    }

    
    public String toString() { 
        String chaine_a_retourner; 
        chaine_a_retourner ="une "+Modele+" "+Marque+" de "+PuissanceCV+" chevaux";
        return chaine_a_retourner; 
    }
}