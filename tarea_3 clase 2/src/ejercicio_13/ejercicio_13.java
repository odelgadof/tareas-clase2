/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_13;

import static ejercicio_7.ejercicio_7.STDIN_SCANNER;

/**
 *
 * @author Orvin
 */
public class ejercicio_13 {
     public static void main(String[] args) {
  
    System.out.println("Por favor, introduzca 10 números enteros: ");

    int negativos = 0;
    int positivos = 0;
    
    for (int i = 0; i < 10; i++) {
      if (STDIN_SCANNER.nextInt() < 0) {
        negativos++;
      } else {
        positivos++;
      }
    }
    
    System.out.println("Ha introducido " + positivos + " positivos y " + negativos + " negativos");

  }
    
}
