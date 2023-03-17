/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_4_Subprogramas;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        System.out.println("El número es primo? " + esprimo(num));
    }

    public static boolean esprimo(int num) {
        int c = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                c++;
            }
            if (c > 2) {
                return false;
            }
        }
        return true;
    }
}
