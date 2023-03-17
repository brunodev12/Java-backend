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
public class ejercicios_teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        String[] equipo = new String[8];
        
        for (int i = 0; i < 8; i++) {
            
            equipo[i]=leer.next();
            
        }
        
        for (int i = 0; i < 8; i++) {
            System.out.println("Los nombres ingresados son: " + equipo[i]);
            
        }
    }
    
}
