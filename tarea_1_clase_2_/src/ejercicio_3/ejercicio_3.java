/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author Orvin
 */
public class ejercicio_3 {
     public  static  void  main ( String [] args ) {
    
             Scanner t=new Scanner(System.in);
             double peseta=166.386;
             double cantidad, resultadoeuro;
             System.out.print("cantidad de pesetas:");
             cantidad=t.nextDouble();
             
             resultadoeuro=cantidad/peseta;
             System.out.println("cantidad en euros:"+resultadoeuro);
    }
    
}
