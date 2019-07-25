/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_16;

import static ejercicio_7.ejercicio_7.STDIN_SCANNER;

/**
 *
 * @author Orvin
 */
public class ejercicio_16 {
     public static void main(String[] args) {
            
    System.out.print("Introduzca un número entero y le diré si es primo: ");
    int numeroIntroducido = STDIN_SCANNER.nextInt();

    boolean esPrimo = true;
    
    for (int i = 2; i < numeroIntroducido; i++) {
      if ((numeroIntroducido % i) == 0) {
        esPrimo = false;
      }
    }
        
    if (esPrimo) {
      System.out.println("El número introducido es primo.");
    } else {
      System.out.println("El número introducido no es primo.");
    }

  }
    
}
