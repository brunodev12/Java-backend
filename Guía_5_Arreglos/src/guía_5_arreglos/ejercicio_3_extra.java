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
public class ejercicio_3_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        int n;
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        int[] vector = new int[n];
        
        vector = llenar(n);
        
        mostrar(vector, n);
        
    }

    public static int[] llenar(int n) {
        int[] _vector = new int[n];
        for (int i = 0; i < n; i++) {
            _vector[i]=(int)(Math.random()*10);
        }
        return _vector;
    }
    
    public static void mostrar(int[] _vector, int n){
        for (int i = 0; i < n; i++) {
            System.out.print(_vector[i] + " ");
        }
        System.out.println("");
    }
}
