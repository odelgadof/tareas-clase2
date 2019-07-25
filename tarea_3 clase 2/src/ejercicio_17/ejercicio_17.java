/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_17;

import static ejercicio_7.ejercicio_7.STDIN_SCANNER;

/**
 *
 * @author Orvin
 */
public class ejercicio_17 {
     public static void main(String[] args) {
    
    int numeroIntroducido = 0;
    
    do {
      System.out.print("Introduzca un número entero positivo: ");
      numeroIntroducido = STDIN_SCANNER.nextInt();
      
      if(numeroIntroducido < 0) {
        System.out.println("El número introducido no es correcto, debe introducir un número positivo.");
      }
    } while (numeroIntroducido < 0);
    
    int suma = 0;
    
    for(int i = numeroIntroducido; i < numeroIntroducido + 100; i++) {
      suma += i;
    }

    System.out.println("La suma de los 100 números siguientes a " + numeroIntroducido + " es " + suma);
  }
}
