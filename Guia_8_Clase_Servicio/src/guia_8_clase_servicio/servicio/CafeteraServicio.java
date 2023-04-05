/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_clase_servicio.servicio;

import guia_8_clase_servicio.entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class CafeteraServicio {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cafetera crearCafetera() {
        System.out.print("Cuál es la capacidad máxima de la cafetera?: ");
        double capMax = leer.nextDouble();
        System.out.print("Cuál es la capacidad actual de la cafetera?: ");
        double capActual = leer.nextDouble();
        return new Cafetera(capMax, capActual);
    }

    public void llenarCafetera(Cafetera _cafetera) {
        double capMax = _cafetera.getCapacidadMaxima();
        _cafetera.setCantidadActual(capMax);
    }

    public void servirTaza(Cafetera _cafetera, double _taza) {
        double capActual = _cafetera.getCantidadActual();
        if (capActual > 0) {
            if (_taza <= capActual) {
                _cafetera.setCantidadActual(capActual - _taza);
                System.out.println("La taza está llena");
            } else {
                System.out.println("La taza se lleno hasta " + capActual);
                _cafetera.setCantidadActual(0);
            }
        } else {
            System.out.println("La cafetera está vacía");
        }

    }

    public void vaciarCafetera(Cafetera _cafetera) {
        _cafetera.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera _cafetera) {
        System.out.print("Cuánto café quiere agregar?: ");
        double cafe = leer.nextDouble();
        double capActual = _cafetera.getCantidadActual();
        double capMax = _cafetera.getCapacidadMaxima();
        if (capActual + cafe <= capMax) {
            _cafetera.setCantidadActual(capActual + cafe);
        } else {
            System.out.println("La cantidad de cafe a ingresar es mayor que la capacidad máxima");
        }
    }

    public void mostrarCafe(Cafetera _cafetera) {
        System.out.println(_cafetera.toString());
    }
}
