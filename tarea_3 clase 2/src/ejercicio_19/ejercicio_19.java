/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_19;

import static ejercicio_7.ejercicio_7.STDIN_SCANNER;

/**
 *
 * @author Orvin
 */
public class ejercicio_19 {
    public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int alturaIntroducida = STDIN_SCANNER.nextInt();

    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = STDIN_SCANNER.next();
    
    int planta = 1;
    int longitudDeLinea = 1;
    int espacios = alturaIntroducida-1;
    
    while (planta <= alturaIntroducida) {
      
      // inserta espacios
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      // pinta la línea
      for (int i = 1; i <= longitudDeLinea; i++) {
        System.out.print(relleno);
      }

      System.out.println();

      planta++;
      espacios--;
      longitudDeLinea += 2;
    }
  }
}
