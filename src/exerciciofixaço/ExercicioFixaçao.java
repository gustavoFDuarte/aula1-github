/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciofixaço;

import java.util.Locale;

/**
 *
 * @author gusta
 */
public class ExercicioFixaçao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String product1="Computer";
        String product2="Office desk";
        
        
        int age= 30;
        int code= 5290;
        char gender= 'F';
        
        
        double price1= 2100.0;
        double price2= 650.50;
        double measure= 53.234567;
       
       System.out.println("Products:"); 
       Locale.setDefault(Locale.US);
       System.out.printf("%s, which price is $ %.2f  %n", product1,price1 );
       
       System.out.printf("Record: %d years old, code %d  and gender : %c  %n", age,code,gender);
       
       System.out.printf("%nMeasue with decimal places : %f %n", measure);
       System.out.printf("Rouded (three decimal places): %.3f %n", measure);
       System.out.printf("Us decimal point:%.3f %n ", measure);
        
    }
    
}
