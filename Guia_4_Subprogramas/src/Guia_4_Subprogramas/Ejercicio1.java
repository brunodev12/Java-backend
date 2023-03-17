/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_4_Subprogramas;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int opcion;
        float num1, num2, res;
        num1=0;
        num2=1;

        do {
            System.out.println("Ingrese una opcion");
            System.out.println("1: Sumar");
            System.out.println("2: Restar");
            System.out.println("3: Multiplicar");
            System.out.println("4: Dividir");
            System.out.println("5: Salir");
            opcion = leer.nextInt();

            if (opcion > 0 && opcion < 5) {
                System.out.println("Ingrese dos numeros");
                num1 = leer.nextFloat();
                num2 = leer.nextFloat();
            }

            switch (opcion) {
                case 1:
                    res = suma(num1, num2);
                    System.out.println("El resultado de la suma de los numeros: " + res);
                    break;

                case 2:
                    res = restar(num1, num2);
                    System.out.println("El resultado de la resta de los numeros: " + res);
                    break;

                case 3:
                    res = multiplicar(num1, num2);
                    System.out.println("El resultado de la multiplicacion de los numeros: " + res);
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir por 0");
                    } else {
                        res = division(num1, num2);
                        System.out.println("El resultado de la division de los numeros: " + res);
                    }
                    break;

                case 5:
                    System.out.println("Hasta luego");
                    break;
            }
        } while (opcion != 5);
    }
    
    public static float suma(float num1, float num2) {
        float resultado = num1 + num2;
        return resultado;
    }
    
    public static float restar(float num1, float num2) {
        float resultado = num1 - num2;
        return resultado;
    }
    
    public static float multiplicar(float num1, float num2) {
        float resultado = num1 * num2;
        return resultado;
    }
    
    public static float division(float num1, float num2) {
        float resultado;
        resultado = num1 / num2;
        return resultado;
    }
}
