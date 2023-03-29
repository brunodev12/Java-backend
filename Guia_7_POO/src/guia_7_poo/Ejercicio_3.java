/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_poo;

import guia_7_poo.newpackage.Operacion;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Operacion calculos = new Operacion();

        crearOperacion(calculos);
        double numero2 = calculos.getNumero2();
        System.out.println("El numero 1 es " + calculos.getNumero1());
        System.out.println("El numero 2 es " + numero2);
        System.out.println("El resultado de la suma es: " + calculos.sumar());
        System.out.println("El resultado de la resta es: " + calculos.restar());

        if (calculos.multiplicar() == 0) {
            System.out.println("Se está ejecutando una multiplicación por 0, por lo que el resultado es 0");
        } else {
            System.out.println("El resultado de la multiplicación es: " + calculos.multiplicar());
        }

        if (calculos.division() == 0 && numero2 == 0) {
            System.out.println("No se puede dividir un número por 0");
        } else {
            System.out.println("El resultado de la división es " + calculos.division());
        }
    }

    public static void crearOperacion(Operacion _calculos) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros para comenzar las operaciones");
        _calculos.setNumero1(leer.nextDouble());
        _calculos.setNumero2(leer.nextDouble());
    }

}
