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
        tCelcius=tCelcius+273.15;
        return tCelcius;
    }
    public static double KelvinVersCelcius (double tKelvin){
        tKelvin=tKelvin-273.15;
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
        double fin;
        int conv;
         Scanner sc = new Scanner(System.in);
         System.out.println("Saisir la conversion");
         System.out.println("1) De Celcius vers Kelvin");
         System.out.println("2) Kelvin Vers Celcius");
         System.out.println("3) Farenheit Vers Celcius");
         System.out.println("4) Celcius Vers Farenheit");
         System.out.println("5) Kelvin Vers Farenheit");
         System.out.println("6) De Farenheit vers Kelvin");
         conv = sc.nextInt();
         System.out.println("Saisir la valeur que vous souhaiter convertir");
         val1 = sc.nextDouble();
         if (conv==1){
             fin=CelciusVersKelvin (val1);
             System.out.println(""+val1+" degres celcius est egal a "+fin+" degres Kelvin");
         }
         else if (conv==2){
             fin=KelvinVersCelcius (val1);
             System.out.println(""+val1+" degres Kelvin est egal a "+fin+" degres celcius");
         }
         else if (conv==3){
             fin=FarenheitVersCelcius (val1);
             System.out.println(""+val1+" degres Farenheit est egal a "+fin+" degres celcius");
         }
         else if (conv==4){
             fin=CelciusVersFarenheit (val1);
             System.out.println(""+val1+" degres Celcius est egal a "+fin+" degres Farenheit");
         }
         else if (conv==5){
             fin=KelvinVersFarenheit (val1);
             System.out.println(""+val1+" degres Kelvin est egal a "+fin+" degres Farenheit");
         }
         else if (conv==6){
             fin=FarenheitVersKelvin (val1);
             System.out.println(""+val1+" degres Farenheit est egal a "+fin+" degres Kelvin");
         }

    }
         
    
}
