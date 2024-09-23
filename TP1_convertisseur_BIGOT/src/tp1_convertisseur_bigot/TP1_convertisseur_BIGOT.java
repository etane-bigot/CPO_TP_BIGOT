// convertiseur BIGOT TDB 23/09/2024
package tp1_convertisseur_bigot;

import java.util.Scanner;

/**
 *
 * @author etane
 */
public class TP1_convertisseur_BIGOT {

    /**
     * @param args the command line arguments
     */
    public static double CelciusVersKelvin (double tCelcius) {
        tCelcius+=273.15;
        return tCelcius;
    }
    public static double KelvinVersCelcius (double tKelvin){
        tKelvin-=273.15;
        return tKelvin;    
    }
    public static double FarenheitVersCelcius (double tFar){
        tFar =(tFar-32)/1.8;
        return tFar;    
    }
    public static double CelciusVersFarenheit (double tCelcius){
        tCelcius =tCelcius*1.8+32;
        return tCelcius;
    }
    public static double KelvinVersFarenheit (double tKelvin){
        tKelvin=KelvinVersCelcius(tKelvin);
        tKelvin=CelciusVersFarenheit(tKelvin);
        return tKelvin;
    }
    public static double FarenheitVersKelvin (double tFar){
        tFar = FarenheitVersCelcius(tFar);
        tFar = CelciusVersKelvin(tFar);
        return tFar;
    }
    public static void main(String[] args) {
        double val1;
        double kelv;
         Scanner sc = new Scanner(System.in);
         System.out.println("System.out.println")
         System.out.println("1) De Celcius vers Kelvin");
         System.out.println("saisir une valeur");
         System.out.println("saisir une valeur");
         System.out.println("saisir une valeur");
         System.out.println("saisir une valeur");
         System.out.println("saisir une valeur");
         val1 = sc.nextDouble();
         System.out.println("celcius : "+val1+"");
         kelv =CelciusVersKelvin(val1);
         System.out.println("kelvin : "+kelv+"");
         // TODO code application logic here
    }
    
}
