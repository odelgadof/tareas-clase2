/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_12;

import static ejercicio_3.ejercicio_3.STDIN_SCANNER;

/**
 *
 * @author Orvin
 */
public class ejercicio_12 {
     public static void main(String[] args) {
    
    int puntos = 0;
    String respuesta;
    
    System.out.println("CUESTIONARIO DE 1º DAW");
    
    System.out.println("1. ¿Cuál de los siguientes tipos de datos de Java tiene más precisión?");
    System.out.println("a) int\nb) double\nc) float"); 
    System.out.print("=> ");
    respuesta = STDIN_SCANNER.next();
    if (respuesta.equals("b")) {
      puntos++;
    }

    System.out.println("2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos");
    System.out.println("a) XML\nb) SELECT\nc) SQL"); 
    System.out.print("=> ");
    respuesta = STDIN_SCANNER.next();
    if (respuesta.equals("c")) {
      puntos++;
    }

    System.out.println("3. Para insertar un hiperenlace en una página se utiliza la etiqueta...");
    System.out.println("a) href\nb) a\nc) link"); 
    System.out.print("=> ");
    respuesta = STDIN_SCANNER.next();
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    System.out.println("4. ¿En qué directorio se encuentran los archivos de configuración de Linux?");
    System.out.println("a) /etc\nb) /config\nc) /cfg"); 
    System.out.print("=> ");
    respuesta = STDIN_SCANNER.next();
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("5. ¿Cuál de las siguientes memorias es volátil?");
    System.out.println("a) RAM\nb) EPROM\nc) ROM"); 
    System.out.print("=> ");
    respuesta = STDIN_SCANNER.next();
    if (respuesta.equals("a")) {
      puntos++;
    }

    System.out.println("\nHa obtenido " + puntos + " puntos.");
  }
    
}
