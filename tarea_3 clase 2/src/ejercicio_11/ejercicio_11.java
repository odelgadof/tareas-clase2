/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_11;

import static ejercicio_7.ejercicio_7.STDIN_SCANNER;

/**
 *
 * @author Orvin
 */
public class ejercicio_11 {
     public static void main(String[] args) {
    
    System.out.print("Introduzca un número: ");
    int numeroIntroducido = STDIN_SCANNER.nextInt();

    for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
      System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
    }
  }
}
