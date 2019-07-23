/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author Orvin
 */
public class ejercicio_6 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b,h;
        System.out.print("Ingresa base:");
        b=sc.nextDouble();
        System.out.print("Ingresa altura:");
        h=sc.nextDouble();
        double area;
        area=b*h/2;
       System.out.println("el area es:"+area);
     }
}
    

