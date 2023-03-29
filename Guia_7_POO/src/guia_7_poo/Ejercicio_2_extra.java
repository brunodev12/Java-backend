/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_poo;

import guia_7_poo.newpackage.Puntos;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Ejercicio_2_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la coordenada X del punto 1: ");
        double x1 = leer.nextDouble();
        System.out.print("Ingrese la coordenada Y del punto 1: ");
        double y1 = leer.nextDouble();
        System.out.print("Ingrese la coordenada X del punto 2: ");
        double x2 = leer.nextDouble();
        System.out.print("Ingrese la coordenada Y del punto 2: ");
        double y2 = leer.nextDouble();

        Puntos puntos = crearPuntos(x1, y1, x2, y2);
        
        calcularDistancia(puntos);

    }

    public static Puntos crearPuntos(double _x1, double _y1, double _x2, double _y2) {
        Puntos _puntos = new Puntos(_x1, _x2, _y1, _y2);
        return _puntos;
    }

    public static void calcularDistancia(Puntos _puntos) {

        System.out.println("La distancia entre los puntos es: " + _puntos.distancia());
    }
}
