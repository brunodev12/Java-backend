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
public class ejercicio_5_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int suma=0;
        System.out.println("Ingrese el número de filas de la matriz");
        int n = leer.nextInt();
        System.out.println("Ingrese el número de columnas de la matriz");
        int m = leer.nextInt();
        int[][] matriz = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                suma += matriz[i][j];
            }
        }
        
        System.out.println("La suma de los elementos de la matriz es " + suma);
    }
    
}
