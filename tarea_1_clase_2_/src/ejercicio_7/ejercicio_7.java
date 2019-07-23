/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author Orvin
 * 
 */
public class ejercicio_7 {
   
 
    

    public  static  void  main ( String [] args ) {
        double base;
       double porcentaje;
       double total;
       double iva;
       Scanner leer = new Scanner(System.in);
       CalculaIva calculador = null;
        
 
       System.out.println("Ingrese base:");
       base = leer.nextDouble();
 
       System.out.println("Ingrese porcentaje de iva:");
       porcentaje = leer.nextDouble();
       iva = calculador.obtenerIva(base, porcentaje);
       total = base + iva;
 
       System.err.println("Base: " + base);
       System.err.println("IVA: " + iva);
       System.err.println("Total: " + total);
 
 
    }
        
  }

  

    

