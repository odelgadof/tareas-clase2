/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author Orvin
 */
public class ejercicio_3 {

    /**
     *
     */
    public final static Scanner STDIN_SCANNER = new Scanner(System.in);
    public static void main(String[] args) {

    String dia;
    int n;

    System.out.print("Por favor, introduzca un número del 1 al 7: ");
      n = STDIN_SCANNER.nextInt();
    
    switch(n) {
      case 1:
        dia = "lunes";
        break;
      case 2:
        dia = "martes";
        break;
      case 3:
        dia = "miércoles";
        break;
      case 4:
        dia = "jueves";
        break;
      case 5:
        dia = "viernes";
        break;
      case 6:
        dia = "sábado";
        break;
      case 7:
        dia = "domingo";
        break;
      default:
        dia = "Debe introducir un número del 1 al 7";
    }
    
    System.out.println(dia);

  }
}
