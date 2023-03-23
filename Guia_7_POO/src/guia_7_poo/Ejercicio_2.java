/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_poo;

import guia_7_poo.newpackage.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Circunferencia circulo = new Circunferencia(5);
        System.out.println("EL area de la circunferencia de radio " + circulo.getRadio() + " es: " + circulo.area());
        System.out.println("El perimetro de la circunferencia de radio " + circulo.getRadio() + " es: " + circulo.perimetro());
        
        System.out.println("Ingrese un radio");
        crearCircunferencia(circulo);
        System.out.println("EL area de la circunferencia de radio " + circulo.getRadio() + " es: " + circulo.area());
        System.out.println("El perimetro de la circunferencia de radio " + circulo.getRadio() + " es: " + circulo.perimetro());

    }

    public static void crearCircunferencia(Circunferencia _circulo) {

        Scanner leer = new Scanner(System.in);

        _circulo.setRadio(leer.nextDouble());
    }

}
