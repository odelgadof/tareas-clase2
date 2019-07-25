/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_14;

import static ejercicio_7.ejercicio_7.STDIN_SCANNER;

/**
 *
 * @author Orvin
 */
public class ejercicio_14 {
    public static void main(String[] args) {
    
    System.out.println("Cálculo de una potencia");
    
    System.out.print("Introduzca la base: ");
    int base = STDIN_SCANNER.nextInt();
    
    System.out.print("Introduzca el exponente: ");
    int exponente = STDIN_SCANNER.nextInt();

    double potencia = 1;
        
    if (exponente == 0) {
      potencia = 1;
    }
    
    if (exponente > 0) {
      for (int i = 0; i < exponente; i++) {
        potencia *= base;
      }
    }
    
    if (exponente < 0) {
      for (int i = 0; i < -exponente; i++) {
        potencia *= base;
      }
      
      potencia = 1/potencia;
    }

    System.out.println(base + "^" + exponente + " = " + potencia);
  }
    
}
