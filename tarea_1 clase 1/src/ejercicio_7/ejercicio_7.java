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
 */
public class ejercicio_7 {
    public static void main(String[] args) {
        // TODO code application logic here
        	int n;

		System.out.print("altura triangulo? ");
		n = STDIN_SCANNER.nextInt();

		for(int k = 1; k <= n - 1; k++) {
			System.out.print(" "); 
		}

		System.out.println("*");

		for(int k = 2; k <= n - 1; k++) {
			for(int j = 1; j <= n - k; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j = 1; j <= 2 * k - 3; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}

		System.out.print("*");
		for(int k = 1; k <= n - 1; k++) {
			System.out.print(" *");
		}

		System.out.println();
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
    }
    

