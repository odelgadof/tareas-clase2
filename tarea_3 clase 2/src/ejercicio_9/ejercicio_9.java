/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_9;

import static ejercicio_7.ejercicio_7.STDIN_SCANNER;

/**
 *
 * @author Orvin
 */
public class ejercicio_9 {
    public static void main(String[] args) {
    
    int numeroDeDigitos = 1, n, numeroIntroducido;

    System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
    numeroIntroducido =  STDIN_SCANNER.nextInt();
    
    n = numeroIntroducido;
    
    while (n > 10) {
      n /= 10;
      numeroDeDigitos++;
    }
    
    System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");

  }
    
}
