// TP1 Exo1 Bigot TDB 23/09/2024
package tp1_manipnombresint_bigot;

import java.util.Scanner;

/**
 *
 * @author etane
 */
public class TP1_manipNombresInt_BIGOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb1;
        int nb2;
        int som;
        int dif;
        int mult;
        int quot;
        int rst;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le premier nombre :");
        nb1 = sc.nextInt();
        System.out.println("Entrer le deuxieme nombre:");
        nb2 = sc.nextInt();
        som = nb1+nb2;
        dif = nb1-nb2;
        mult = nb1*nb2;
        System.out.println("somme : "+som+"");
        System.out.println("difference : "+dif+"");
        System.out.println("multiplication : "+mult+"");
        quot = nb1/nb2;
        rst = nb1%nb2;
        System.out.println("quotient : "+quot+"");
        System.out.println("reste : "+rst+"");
    }
    
}
