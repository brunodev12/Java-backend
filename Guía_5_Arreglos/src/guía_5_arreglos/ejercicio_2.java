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
public class ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n,c;
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        c=0;
        
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i]=(int) (Math.random()*10);
        }
        
        System.out.println("Ingrese un numero a buscar");
        num = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (vector[i]==num) {
                System.out.println("El numero se ha encontrado en la posición " + i + " del vector");
                c++;
            }
        }
        
        System.out.println("El número se encontró " + c + " veces");
        
    }
    
}
