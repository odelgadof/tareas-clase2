/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

import java.util.Scanner;
/**
 *
 * @author Orvin
 */

public class ejercicio_2 {
    
          public  static  void  main ( String [] args ) {
    
             Scanner t=new Scanner(System.in);
             double euro=0.0060;
             double cantidad, resultadopeseta;
             System.out.print("cantidad de euros:");
             cantidad=t.nextDouble();
             
             resultadopeseta=cantidad/euro;
             System.out.println("cantidad en pesetas:"+resultadopeseta);
    }
    
    
}
