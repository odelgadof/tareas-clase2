/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_11;

import java.util.Scanner;

/**
 *
 * @author Orvin
 */
public class ejercicio_11 {
     static Scanner entrada =new Scanner(System.in);
    public  static  void  main ( String [] args ) {
    
     float Kb;
     System.out.print("ingrese los KiloBytes:");
     Kb =entrada.nextFloat();
     System.out.println("los MegaBytes son:"+(Kb/1024));
    }
    
}
