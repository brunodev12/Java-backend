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
public class Ejercicio_1_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int n, suma=0;
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        int[] vector = new int[n];
        
        System.out.println("Ingrese los elementos del vector");
        for (int i = 0; i < n; i++) {
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        
        System.out.println("La suma de los elementos es " + suma);
    }
    
}
