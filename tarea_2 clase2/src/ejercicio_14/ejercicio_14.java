/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_14;

import static ejercicio_3.ejercicio_3.STDIN_SCANNER;

/**
 *
 * @author Orvin
 */
public class ejercicio_14 {
     public static void main(String[] args) {
        
    System.out.print("Por favor, introduzca un número entero: ");
    int n = STDIN_SCANNER.nextInt();

    if ((n % 2) == 0) {
      System.out.print("El número introducido es par");
    } else {
      System.out.print("El número introducido es impar");
    }

    if ((n % 5) == 0) {
      System.out.println(" y divisible entre 5.");
    } else {
      System.out.println(" y no es divisible entre 5.");
    }
  }
    
}
