/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author Orvin
 */
public class ejercicio_8 {
    public static void main(String[] args) {

   

        int horasTrabajadas, salario;

        System.out.println("ingrese las horas trabajadas");
        horasTrabajadas = Integer.parseInt(new Scanner(System.in).nextLine());

        salario = horasTrabajadas * 12;
        System.out.println("Su sueldo es de:" + salario);

			
		}

}
    

