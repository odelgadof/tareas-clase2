/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_8;

import static ejercicio_7.ejercicio_7.STDIN_SCANNER;

/**
 *
 * @author Orvin
 */
public class ejercicio_8ç {
    public static void main(String[] args) {
    
    System.out.print("Introduzca un número entero y le mostraré la tabla de multiplicar: ");
    int numeroIntroducido =  STDIN_SCANNER.nextInt();
        
    for (int i = 0; i <= 10; i++) {
      System.out.println(numeroIntroducido + " x " + i + " = " + numeroIntroducido * i);
    }

  }
}
