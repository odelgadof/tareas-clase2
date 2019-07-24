/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5;

import static ejercicio_3.ejercicio_3.STDIN_SCANNER;

/**
 *
 * @author Orvin
 */
public class ejercicio_5 {
    public static void main(String[] args) {
        double a, b;
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Por favor, introduzca el valor de a: ");

        a = STDIN_SCANNER.nextDouble();
        System.out.print("Ahora introduzca el valor de b: ");
        b = STDIN_SCANNER.nextDouble();

        if (a == 0) {
            System.out.println("Esa ecuación no tiene solución real.");
        } else {
            System.out.println("x = " + (-b / a));
        }
    }
    
}
