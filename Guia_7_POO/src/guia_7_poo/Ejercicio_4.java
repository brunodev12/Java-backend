/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_poo;

import guia_7_poo.newpackage.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la base del rectangulo: "); int base = leer.nextInt();
        System.out.print("Ingrese la altura del rectangulo: "); int altura = leer.nextInt();
        
        Rectangulo rectangulo = new Rectangulo(base, altura);
        
        System.out.println("La superficie del rectangulo es: " + rectangulo.superficie());
        System.out.println("El perímetro del rectangulo es: " + rectangulo.perimetro());
        System.out.println("=======================================");
        rectangulo.dibujar();
        
    }
    
}
