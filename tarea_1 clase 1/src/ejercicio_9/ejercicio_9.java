/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_9;

/**
 *
 * @author Orvin
 */
public class ejercicio_9 {
     public static void main(String[] args) {
        silla();
    }

    private static void silla() {
        for (int i = 0; i < 3; i++) {
            System.out.println("*");
        }

        for (int b = 0; b < 5; b++) {
            System.out.print("*");
        }

        System.out.println();

        for (int a = 0; a < 2; a++) {
            System.out.print("*");
            for (int c = 0; c < 3; c++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }

    private static void sillaMueve() {
        int esp = 0;
        for (int move = 0; move < 10; move++) {
            for (int i = 0; i < 3; i++) {
                esp = 0;
                while (esp < move) {
                    System.out.print(" ");
                    esp++;
                }
                System.out.println("*");
            }

            esp = 0;
            for (int b = 0; b < 5; b++) {
                while (esp < move) {
                    System.out.print(" ");
                    esp++;
                }
                System.out.print("*");
            }

            System.out.println();

            for (int a = 0; a < 2; a++) {
                esp = 0;
                while (esp < move) {
                    System.out.print(" ");
                    esp++;
                }
                System.out.print("*");
                for (int c = 0; c < 3; c++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            System.out.println();
        }
    }

    private static void cama() {

    }
    
}
