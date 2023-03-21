/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía_5_arreglos;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class ejercicio_7_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N = leer.nextInt();
        int[] vector = new int[N];
        
        
        for (int i = 0; i < N; i++) {
            if (i <= 1) {
                vector[i] = 1;
            } else {
                vector[i] = vector[i - 1] + vector[i - 2];
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }
}
