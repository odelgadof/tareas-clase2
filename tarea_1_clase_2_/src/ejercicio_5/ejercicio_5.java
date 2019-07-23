/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author Orvin
 */
public class ejercicio_5 {
    public static void main(String []agrs)
    {
        double area;
        Scanner sc=new Scanner(System.in);
        System.out.print("ingrese la base del rectangulo:");
        double a=sc.nextDouble();  
        System.out.print("ingrese la altura del rectangulo:");
        double b=sc.nextDouble(); 
        area=a*b;
        System.out.println("el area es:"+ area);   
       
    }
}
