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
public class ejercicio_6_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 5; i++) {
            String palabra = checkFrase();
        }
    }
    
    public static String checkFrase(){
        String frase;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese una palabra de mínimo 3 y máximo 5 caracteres");
            frase = leer.next();
        } while (frase.length()<3 || frase.length()>5);
        
        
        return frase;
    }
}
