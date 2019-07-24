/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_6;

import static ejercicio_3.ejercicio_3.STDIN_SCANNER;

/**
 *
 * @author Orvin
 */
public class ejercicio_6 {
    // las constantes se declaran fuera del main
  final static double g = 9.81;

  public static void main(String[] args) {
    double h;
    System.out.println("Cálculo del tiempo de caída de un objeto.");
    System.out.print("Por favor, introduzca la altura (en metros) desde la que cae el objeto: ");
     h = STDIN_SCANNER.nextDouble();

    double s = Math.sqrt(2*h/g);

    System.out.printf("El objeto tarda %.2f segundos en caer.\n", s);
  }
}
