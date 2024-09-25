// TP1 exo 3 BIGOT TDB 24/09/2024
package tp1_guessmynumber_bigot;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author etane
 */
public class TP1_guessMyNumber_BIGOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);
        int a = generateurAleat.nextInt(100);
        int guess=101;
        int cmp=1;
        int niv;
        //System.out.println(a);
        System.out.println("choisissez un niveau de difficulté");
        System.out.println("1) facile");
        System.out.println("2) moyen");
        System.out.println("3) difficile");
        niv=sc.nextInt();
        if (niv==1){
            while (guess != a) {
                cmp+=1;
                System.out.println("devinez le nombre");
                guess = sc.nextInt();
                if (guess > a) {
                    System.out.println("trop grand");
                } else if (guess < a) {
                    System.out.println("trop petit");
                } else if (guess == a) {
                    System.out.println("gagne");
                    System.out.println("vous avez effectue "+cmp+" tentatives");
                }
            }// TODO code application logic here
        }
        else if (niv==2){
            while (guess != a || cmp<15) {
                cmp+=1;
                System.out.println("devinez le nombre");
                guess = sc.nextInt();
                if (guess > a) {
                    System.out.println("trop grand");
                } else if (guess < a) {
                    System.out.println("trop petit");
                } else if (guess == a) {
                    System.out.println("gagne");
                    System.out.println("vous avez effectue "+cmp+" tentatives");
                }
            }// TODO code application logic here
        }
        else if (niv==3){
            while (cmp<7 || guess != a) {
                cmp+=1;
                System.out.println("devinez le nombre");
                guess = sc.nextInt();
                if (guess > a) {
                    System.out.println("trop grand");
                } else if (guess < a) {
                    System.out.println("trop petit");
                } else if (guess == a) {
                    System.out.println("gagne");
                    System.out.println("vous avez effectue "+cmp+" tentatives");
                }
            }// TODO code application logic here
        }

    }
}
