/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy;

import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author etane
 */
public class TP3_Heroic_Fantasy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Epee Exca = new Epee( 7, "Excalibur",5 );
        Epee Dur = new Epee( 4, "Durandal", 7);
        Baton CH = new Baton( 4, "Chêne", 5);
        Baton Cha = new Baton( 5, "Charme", 6);
        
        ArrayList<Arme> Armes = new ArrayList<Arme>();
        Armes.add(CH);
        Armes.add(Cha);
        Armes.add(Exca);
        Armes.add(Dur);
        
        
    }
    
}
