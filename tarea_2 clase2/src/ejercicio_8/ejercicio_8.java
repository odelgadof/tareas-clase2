/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_8;

import static ejercicio_3.ejercicio_3.STDIN_SCANNER;

/**
 *
 * @author Orvin
 */
public class ejercicio_8 {
     public static void main(String[] args) {

double nota1,nota2,nota3;
    System.out.println("Este programa calcula la media de tres notas.");
    
    System.out.print("Por favor, introduzca la primera nota: ");
     nota1 = STDIN_SCANNER.nextDouble();
    
    System.out.print("Ahora introduzca la segunda nota: ");
     nota2 = STDIN_SCANNER.nextDouble();
    
    System.out.print("Por último introduzca la tercera nota: ");
     nota3 = STDIN_SCANNER.nextDouble();

    double media = (nota1 + nota2 + nota3) / 3;

    System.out.printf("La media es %.2f\n", media);
  
    
    if (media < 5) {
      System.out.println("Insuficiente");
    }
    
    if ((media >= 5) && (media < 6)) {
      System.out.println("Suficiente");
    }
    
    if ((media >= 6) && (media < 7)) {
      System.out.println("Bien");
    }
    
    if ((media >= 7) && (media < 9)) {
      System.out.println("Notable");
    }
    
    if (media >= 9) {
      System.out.println("Sobresaliente");
    }
  }
}
