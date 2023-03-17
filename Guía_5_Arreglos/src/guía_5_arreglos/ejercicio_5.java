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
public class ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int c = 0;

        System.out.println("Primer Matriz");

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                matrizA[i][j] = leer.nextInt();
                //System.out.print(" " + matrizA[i][j] + " ");
            }
            //System.out.println("");
        }

        System.out.println("Matriz Traspuesta");

        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                matrizB[i][j] = matrizA[j][i];
                //System.out.print(" " + matrizB[i][j] + " ");
            }
            //System.out.println("");
        }

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                if (matrizA[i][j] == matrizB[i][j] * -1) {
                    c++;
                }
            }
        }

        if (c++ == matrizA.length*matrizB.length) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }
    }

}
