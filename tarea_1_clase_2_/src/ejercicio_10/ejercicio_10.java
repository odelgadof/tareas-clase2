/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_10;

import java.util.Scanner;

/**
 *
 * @author Orvin
 */
public class ejercicio_10 {
    static Scanner entrada =new Scanner(System.in);
    public  static  void  main ( String [] args ) {
    
     float Mb;
     System.out.print("ingrese los MegaBytes:");
     Mb =entrada.nextFloat();
     System.out.println("KiloBytes:"+(Mb*1024));
    }
    
}
