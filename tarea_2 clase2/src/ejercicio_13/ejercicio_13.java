/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_13;

import static ejercicio_3.ejercicio_3.STDIN_SCANNER;

/**
 *
 * @author Orvin
 */
public class ejercicio_13 {
     public static void main(String[] args) {
    
    int aux;
        
    System.out.println("Este programa ordena tres números introducidos por teclado.");
    System.out.println("Por favor, vaya introduciendo los tres números y pulsando INTRO:");
    int a = STDIN_SCANNER.nextInt();
    int b = STDIN_SCANNER.nextInt();
    int c = STDIN_SCANNER.nextInt();

    // ordenación de los dos primeros números
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
    
    // ordenación de los dos últimos números
    if (b > c) {
      aux = b;
      b = c;
      c = aux;
    }
    
    // se vuelven a ordenar los dos primeros
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
        
    System.out.println("Los números introducidos ordenados de menor a mayor son " + a + ", " + b + " y " + c + "."); 
  }
    
}
