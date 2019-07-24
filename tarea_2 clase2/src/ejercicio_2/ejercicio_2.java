/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

import static ejercicio_3.ejercicio_3.STDIN_SCANNER;

/**
 *
 * @author Orvin
 */
public class ejercicio_2 {
    public static void main(String[] args) {
        int hora;
     System.out.print("Por favor, introduzca una hora del día (0 - 23): ");
     hora = STDIN_SCANNER.nextInt();
    
    if ((hora >= 6) && (hora <= 12)) {
      System.out.println("Buenos días");
    }
        
    if ((hora >= 13) && (hora <= 20)) {
      System.out.println("Buenas tardes");
    }
      
    if (((hora >= 21) && (hora < 24)) || ((hora <= 5) && (hora >= 0))) {
      System.out.println("Buenas noches");
    }
      
    if ((hora >= 24) || (hora < 0)) {
      System.out.println("La hora introducida no es correcta.");
    }
  }
    
}
