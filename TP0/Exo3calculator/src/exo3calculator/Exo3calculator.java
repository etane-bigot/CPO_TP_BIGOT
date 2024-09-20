//Bigot exo 3 calculatrice 20/09/2024
package exo3calculator;

import java.util.Scanner;

/**
 *
 * @author etane
 */
public class Exo3calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int operateur;
        int operande1;
        int operande2;
        int resultat=0;
        System.out.println(" Please enter the operator:");
        System.out.println("1) add");
        System.out.println(" 2) substract");
        System.out.println(" 3) multiply");
        System.out.println("4) divide");
        System.out.println(" 5) modulo");
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        operateur = sc.nextInt();
        System.out.println(" entrer le premier nombre:");
        operande1 = sc.nextInt();
        System.out.println(" entrer le deuxieme nombre:");
        operande2 = sc.nextInt();
        if (operateur<1 || operateur>5){System.out.println(" entrer un nombre ente 1 et 5:");
         System.exit(0);
        }
        else if (operateur==1){
            resultat = operande1+operande2;
        }
        else if (operateur==2){
            resultat = operande1-operande2;
        }
        else if (operateur==3){
            resultat = operande1*operande2;
        }
        else if (operateur==4){
            resultat = operande1/operande2;
        }
        else if (operateur==5){
            resultat = operande1%operande2;
        }
    System.out.println(" le resultat est "+resultat+".");
    }
}
    
        
    
    
               
            
            
            
        
    
    

