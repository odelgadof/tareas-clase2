/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_18;

import static ejercicio_7.ejercicio_7.STDIN_SCANNER;

/**
 *
 * @author Orvin
 */
public class ejercicio_18 {
    public static void main(String[] args) {
    
    int primerNumero;
    int segundoNumero;
    
    // pide dos números y se verifica que sean distintos
    do {
      System.out.print("Introduzca un número entero: ");
      primerNumero = STDIN_SCANNER.nextInt();
      System.out.print("Introduzca otro número entero distinto al anterior: ");
      segundoNumero = STDIN_SCANNER.nextInt();
      
      if(primerNumero == segundoNumero) {
        System.out.println("Los números introducidos no son válidos, deben ser distintos.");
      }
    } while (primerNumero == segundoNumero);
    
    // si el primer número es mayor que el segundo, se intercambian los valores
    if (primerNumero > segundoNumero) {
      int aux = primerNumero;
      primerNumero = segundoNumero;
      segundoNumero = aux;
    }
    
    for(int i = primerNumero; i <= segundoNumero; i += 7) {
      System.out.print(i + " ");
    }
    
    System.out.println();
  }
}
