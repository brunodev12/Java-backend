/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía_5_arreglos;

/**
 *
 * @author bruno
 */
public class ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];
        
        System.out.println("Primer Matriz");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = (int) (Math.random() * 10);
                System.out.print(" " + matrizA[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("Matriz Traspuesta");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[i][j] = matrizA[j][i];
                System.out.print(" " + matrizB[i][j] + " ");
            }
            System.out.println("");
        }

    }

}
