/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_23;

import static ejercicio_7.ejercicio_7.STDIN_SCANNER;

/**
 *
 * @author Orvin
 */
public class ejercicio_23 {
    public static void main(String[] args) {

    System.out.println("Por favor, vaya introduciendo números.");
    System.out.println("El programa terminará cuando la suma de los números sea mayor que 10000.");
    
    int numeroIntroducido;
    int suma = 0;
    int numeroDeElementos = 0;
    
    do {
      numeroIntroducido = STDIN_SCANNER.nextInt();
      suma += numeroIntroducido;
      numeroDeElementos++;
    } while (suma <= 10000);
    
    System.out.println("Ha introducido un total de " + numeroDeElementos + " números.");
    System.out.println("La suma total es " + suma + ".");
    System.out.println("La media es " + suma / numeroDeElementos + ".");
  } 
}
