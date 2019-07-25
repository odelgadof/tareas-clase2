/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_10;

import static ejercicio_7.ejercicio_7.STDIN_SCANNER;

/**
 *
 * @author Orvin
 */
public class ejercicio_10 {
     public static void main(String[] args) {
    
    double numeros = 0;
    double numeroIntroducido = 0;
    double suma = 0;

    System.out.println("Este programa calcula la media de los números positivos introducidos.");
    System.out.println("Vaya introduciendo números (puede parar introduciendo un número negativo):");

    while (numeroIntroducido >= 0) {
      numeroIntroducido = STDIN_SCANNER.nextDouble();
      numeros++;
      suma += numeroIntroducido;
    }
    
    System.out.println("La media de los números positivos introducidos es " + (suma - numeroIntroducido)/ (numeros - 1));

  }
    
}
