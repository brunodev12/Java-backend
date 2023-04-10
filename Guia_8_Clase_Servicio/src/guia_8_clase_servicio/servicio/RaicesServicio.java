/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_clase_servicio.servicio;

import guia_8_clase_servicio.entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class RaicesServicio {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Raices crearRaices() {
        System.out.print("Ingrese el coeficiente A: ");
        float a = leer.nextFloat();
        System.out.print("Ingrese el coeficiente B: ");
        float b = leer.nextFloat();
        System.out.print("Ingrese el coeficiente C: ");
        float c = leer.nextFloat();
        return new Raices(a, b, c);
    }

    public double getDiscriminante(Raices _raices) {
        float a = _raices.getA();
        float b = _raices.getB();
        float c = _raices.getC();
        return (Math.pow(b, 2)) - (4 * a * c);
    }

    public boolean tieneRaices(Raices _raices) {
        return this.getDiscriminante(_raices) > 0;
    }

    public boolean tieneRaiz(Raices _raices) {
        return this.getDiscriminante(_raices) == 0;
    }

    public void obtenerRaices(Raices _raices) {
        float a = _raices.getA();
        float b = _raices.getB();
        float c = _raices.getC();
        if (this.tieneRaices(_raices)) {
            double raiz1 = (-b + Math.sqrt((Math.pow(b, 2)) - 4 * a * c)) / (2 * a);
            double raiz2 = (-b - Math.sqrt((Math.pow(b, 2)) - 4 * a * c)) / (2 * a);
            System.out.println("La primer raiz es: " + raiz1);
            System.out.println("La segunda raiz es: " + raiz2);
        }
    }

    public void obtenerRaiz(Raices _raices) {
        float a = _raices.getA();
        float b = _raices.getB();
        if (this.tieneRaiz(_raices)) {
            double raiz = (-b) / (2 * a);
            System.out.println("La única raiz es: " + raiz);
        }
    }

    public void calcular(Raices _raices) {
        if (this.tieneRaices(_raices)) {
            this.obtenerRaices(_raices);
        } else if (this.tieneRaiz(_raices)) {
            this.obtenerRaiz(_raices);
        } else {
            System.out.println("La ecuación no tiene raices o son números complejos");
        }
    }

}
