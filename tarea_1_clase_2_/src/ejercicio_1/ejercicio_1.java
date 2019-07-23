/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

import java.util.Scanner;

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
        byte Numero1;
        byte Numero2;
        short Resultado;

        System.out.print(" Ingrese el numero 1: ");
        Numero1 = Byte.parseByte(new Scanner(System.in).nextLine());
        System.out.print(" Ingrese el numero 2: ");

        Numero2 = Byte.parseByte(new Scanner(System.in).nextLine());

        Resultado = (short) (Numero1 * Numero2);
        System.out.printf(" La multiplicacion es:%1$s" + "\r\n", Resultado);

		

        
    }
    
}
