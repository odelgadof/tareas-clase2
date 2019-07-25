/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_15;

import static ejercicio_7.ejercicio_7.STDIN_SCANNER;

/**
 *
 * @author Orvin
 */
public class ejercicio_15 {
    public static void main(String[] args) {
     
    System.out.print("Introduzca un número real como base: ");
    double base = STDIN_SCANNER.nextDouble();
    
    System.out.print("Introduzca un múmero entero como exponente: ");
    int exponenteFinal = STDIN_SCANNER.nextInt();

    double potencia;
    int exponente;
        
    for (int i = 1; i <= exponenteFinal; i++) {
        
      potencia = 1;
      exponente = i;
      
      for (int j = 0; j < exponente; j++) {
        potencia *= base;
      }
      
      System.out.println(base + "^" + i + " = " + potencia);
    }
}
}
