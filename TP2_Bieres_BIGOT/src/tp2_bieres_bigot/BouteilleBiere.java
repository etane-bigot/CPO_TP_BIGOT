/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_bigot;

/**
 *
 * @author etane
 */
public class BouteilleBiere {
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    public void lireEtiquette() { 
        System.out.println("Bouteille de " + nom +" (" + degreAlcool + 
        " degres) \nBrasserie : " + brasserie ) ;
    }
    public boolean Decapsuler(){
        if(ouverte==true){
            System.out.println("erreur la biere est deja ouverte");
            return false;
        }else{
            System.out.println("la biere a ete ouverte");
            return true;
        }
    }
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie){
        nom = unNom; 
        degreAlcool = unDegre; 
        brasserie = uneBrasserie; 
        ouverte = false; 
    }
}


