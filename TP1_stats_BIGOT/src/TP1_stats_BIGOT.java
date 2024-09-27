
import java.util.Random;
import java.util.Scanner;

//TP1 Exo 4 BIGOT TDB 27/09/2024

/**
 *
 * @author etane
 */
public class TP1_stats_BIGOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m;
        int a;
        double prcent;
        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);
        int [] tab = new int[6];
        for (int i = 0; i < tab.length; i++){
            tab[i]=0;
        }
        System.out.println("choisissez un nombre");
        m=sc.nextInt();
        for (int i = 0; i < m; i++){
            a = generateurAleat.nextInt(6);
            tab[a]+=1;
        }
        for (int i=0; i<tab.length; i++){
            System.out.println(""+i+" : "+tab[i]+"");    
        }
        for (int i=0; i<tab.length; i++){
        prcent=tab[i]*1.0/m*100;
        System.out.println(""+i+" : "+prcent+" %");
        }
    } 
}
        
    
