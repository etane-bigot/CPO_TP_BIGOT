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
public class Baton extends Arme {
    int age;

    public Baton(int age, String nom, int NivAtak) {
        super(nom, NivAtak);
        if (age<100){
            this.age = age;
        }else{
            this.age = 0;
        }
    }

    @Override
    public String toString() {
        return "Baton{"+super.toString() + "age=" + age + '}';
    }
    
}
