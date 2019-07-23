/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_9;

import java.util.Scanner;

/**
 *
 * @author Orvin
 */
public class ejercicio_9 {
     public static void main(String[] args){
         double radio,altura,volumen; 
         Scanner valor=new Scanner(System.in);
         System.out.print("ingrese el valor del radio del cono:");
         radio=valor.nextDouble();
         System.out.print("ingrese el valor de la altura del cono:");
         altura=valor.nextDouble();
         volumen=(3.1416*radio*radio*altura)/3;
         System.out.println("el valor del cono es:" + volumen + "unidades cubicas");
         
     }
}
