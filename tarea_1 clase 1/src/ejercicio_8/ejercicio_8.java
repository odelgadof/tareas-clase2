/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author Orvin
 */
public class ejercicio_8 {
     public static void main(String[] args) {
        int totalLineas = 0, nlinea = 0, nast = 0, nesp = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Piramide de asteriscos:");
        System.out.println("Indique cuantos pisos desea que tenga la piramide (Maximo 40 pisos): ");

        nlinea = scan.nextInt();
        totalLineas = nlinea;

        while (nlinea > 0 && nlinea <= 40) {
            while (nesp < totalLineas - nlinea) {
                System.out.print(" ");
                nesp++;
            }
            
            while (nast < nlinea * 2 - 1) {
                System.out.print("*");
                nast++;
            }
            nesp = 0;
            nast = 0;
            //resto una linea cada vez
            nlinea--;
            System.out.println();
            
        }
    }
    
}
