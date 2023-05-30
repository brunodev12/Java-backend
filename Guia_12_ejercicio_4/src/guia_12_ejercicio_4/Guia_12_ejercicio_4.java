/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_12_ejercicio_4;

import Entidades.Circulo;
import Entidades.Rectangulo;

/**
 *
 * @author bruno
 */
public class Guia_12_ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(2, 2);
        circulo.calcularArea();
        circulo.calcularPerimetro();
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
        
        System.out.println("Area circulo: " + circulo.getArea());
        System.out.println("Perimetro circulo: " + circulo.getPerimetro());
        System.out.println("Area rectangulo: " + rectangulo.getArea());
        System.out.println("Perimetro rectangulo: " + rectangulo.getPerimetro());
    }
    
}
