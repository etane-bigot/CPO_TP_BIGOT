/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy;

/**
 *
 * @author etane
 */
public abstract class Personnage {
    String nom;
    int vie;

    public Personnage(String nom, int vie) {
        this.nom = nom;
        this.vie = vie;
    }

    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", vie=" + vie + '}';
    }
    
    
}
