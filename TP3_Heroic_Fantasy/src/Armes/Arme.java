/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author etane
 */
public abstract class Arme {
    String nom;
    int NivAtak;
    
    public Arme(String nom, int NivAtak){
        this.nom=nom;
        if (NivAtak<=100){
            this.NivAtak=NivAtak;
        }else{
        this.NivAtak=0;
        }
    }
    
    @Override
    public String toString() {
        return "l'arme:"+nom+" a un niveau d'attaque de "+NivAtak;
    }
}    

