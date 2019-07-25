/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_20;

import static ejercicio_7.ejercicio_7.STDIN_SCANNER;

/**
 *
 * @author Orvin
 */
public class ejercicio_20 {
    public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int alturaIntroducida = STDIN_SCANNER.nextInt();

    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = STDIN_SCANNER.next();
    
    int altura = 1;
    int i = 0;
    int espaciosPorDelante = alturaIntroducida - 1;
    int espaciosInternos = 0;
    
    while (altura < alturaIntroducida) {
      
      // inserta espacios delante
      for (i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }
      
      // pinta la línea
      System.out.print(relleno);
      for (i = 1; i < espaciosInternos; i++) {
        System.out.print(" ");
      }
      
      if (altura>1) {
        System.out.print(relleno);
      }
      
      System.out.println();
      altura++;
      espaciosPorDelante--;
      espaciosInternos += 2;
    } // while ////////////////////////////
    
    // base de la pirámide
    for (i = 1; i < altura*2; i++) {
      System.out.print(relleno);
    }
  }
}
