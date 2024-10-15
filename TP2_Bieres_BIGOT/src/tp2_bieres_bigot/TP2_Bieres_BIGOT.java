/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_bigot;

/**
 *
 * @author etane
 */
public class TP2_Bieres_BIGOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson") ;
        uneBiere.lireEtiquette();
        System.out.println(uneBiere);
        uneBiere.Decapsuler();
        System.out.println(uneBiere);
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ;
        autreBiere.lireEtiquette();
        System.out.println(autreBiere);
        autreBiere.Decapsuler();
        System.out.println(autreBiere);
        BouteilleBiere troisiemebiere = new BouteilleBiere("Pelican", 7.5 ,"novelty") ;
        troisiemebiere.lireEtiquette();
        System.out.println(troisiemebiere);
        troisiemebiere.Decapsuler();
        System.out.println(troisiemebiere);
    }
    
}
