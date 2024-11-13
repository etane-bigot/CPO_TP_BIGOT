/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author etane
 */
public class Epee extends Arme {
    int Finesse;

    public Epee(int Finesse, String nom, int NivAtak) {
        super(nom, NivAtak);
        if(Finesse<100){
            this.Finesse = Finesse;
        }else{
            this.Finesse = 0;   
        }
    }

    @Override
    public String toString() {
        return "Epee{"+super.toString() + "Finesse=" + Finesse + '}';
    }
    
    
    
}
