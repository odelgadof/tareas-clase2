/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_12;

import static ejercicio_7.ejercicio_7.STDIN_SCANNER;

/**
 *
 * @author Orvin
 */
public class ejercicio_12 {
    public static void main(String[] args) {
    
    System.out.println("Este programa muestra los n primeros números de la serie de Fibonacci.");
    System.out.print("Por favor, introduzca n: ");
    int n = STDIN_SCANNER.nextInt();

    switch (n) {
      case 1:
        System.out.print("0");
        break;
      case 2:
        System.out.print("0 1");
        break;
      default:
        System.out.print("0 1");
        int f1 = 0;
        int f2 = 1;
        int aux;
        while(n > 2) {
            aux = f1;
            f1 = f2;
            f2 = aux + f2;
            System.out.print(" " + f2);
            n--;
        }
    }
    System.out.println();
  }
    
}
