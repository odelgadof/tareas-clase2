/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

/**
 *
 * @author Orvin
 */
public class ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dia;

    System.out.print("Por favor, introduzca un día de la semana y le diré qué asignatura toca a primera hora ese día: ");
    dia = (System.console().readLine()); 
    dia.toLowerCase(); // convierto a minúsculas todas las letras
    
    switch(dia) {
      case "lunes":
        // continúa debajo
      case "martes":
        // continúa debajo
      case "miércoles":
        System.out.println("Programación");
        break;
      case "jueves":
        System.out.println("Sistemas Informáticos");
        break;
      case "viernes":
        System.out.println("Bases de Datos");
        break;
      case "sábado":
        // continúa debajo
      case "domingo":
        System.out.println("¡Ese día no hay clase!");
        break;
      default:
        System.out.println("El día introducido no es correcto.");
    }
  }      
}
