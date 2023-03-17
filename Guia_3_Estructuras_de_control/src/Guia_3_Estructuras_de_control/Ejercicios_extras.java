/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_3_Estructuras_de_control;

import java.util.Scanner;


/**
 *
 * @author bruno
 */
public class Ejercicios_extras {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        float minutos;
        float dia, horas;
        double _dia, _horas;
        System.out.println("Ingrese un tiempo en minutos");
        minutos = leer.nextFloat();
        
        horas = minutos/60;
        System.out.println(horas);
        _horas = Math.floor(horas);
        System.out.println(_horas);
        dia = horas/24;
        System.out.println(dia);
        _dia = Math.floor(dia);
        System.out.println(_dia);
        System.out.println("El tiempo ingresado es: " + _dia + " días y " + (_horas%24) + " horas" );
        //Ejercicio 9
        
        /*
        float dividendo, divisor, cociente, resto, valorInicial;
        cociente = 0;
        System.out.println("Ingresa el dividendo");
        dividendo = leer.nextFloat();
        System.out.println("Ingresa el divisor");
        divisor = leer.nextFloat();

        valorInicial = dividendo;

        do {
            resto = dividendo - divisor;
            cociente++;
            dividendo = resto;
        } while (resto >= divisor);

        System.out.println("La division entre: " + valorInicial + " y " + divisor + " es");
        System.out.println(cociente);
        System.out.println("El resto es: " + resto);
         */
        
        //Ejercicio10
        /*
        int num1, num2, numUser;
        
        num1 = (int) ((Math.random() + 0.1) * 10);
        num2 = (int) ((Math.random() + 0.1) * 10);
        System.out.println("los numeros generados son: ");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);

        do {
            System.out.println("Ingrese un numero");
            numUser = leer.nextInt();
        } while (numUser != (num1*num2));
        
        System.out.println("Felicitaciones a encontrado el resultado: " + (num1*num2));
         */
        
        //Ejercicio11
        /*
        long numero, i;
        i = 0;
        System.out.println("Ingrese un numero");
        numero = leer.nextLong();

        do {
            numero = numero / 10;
            i++;
        } while (numero != 0);

        System.out.println("La cantidad de dígitos es: "  + i );
        */
        
        //Ejercicio 12
        
    }
}
