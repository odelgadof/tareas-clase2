/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_11;

import static ejercicio_3.ejercicio_3.STDIN_SCANNER;

/**
 *
 * @author Orvin
 */
public class ejercicio_11 {
     public static void main(String[] args) {
    
    System.out.print("A continuación deberá introducir una hora del día, ");
    System.out.println("primero introducirá la hora y luego los minutos.");
    
    System.out.print("hora: ");
    int hora = STDIN_SCANNER.nextInt();
    
    System.out.print("minuto: ");
    int minuto = STDIN_SCANNER.nextInt();

    int segundosTranscurridos = (hora * 3600) + (minuto * 60);
    int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;
            
    //System.out.println("Desde las " + hora + ":" + minuto + " hasta la medianoche faltan " + segundosHastaMedianoche + " segundos.");
    System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos", hora, minuto, segundosHastaMedianoche);
  }
}
    

