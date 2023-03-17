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
public class Ejercicios_5_8 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        //Ejercicio5
//        int limite, suma, numero;
//        suma = 0;
//        System.out.println("Ingrese un numero limite");
//        limite = leer.nextInt();
//        System.out.println("Ingrese los numeros");
//        do {
//            numero = leer.nextInt();
//            suma += numero;
//        } while (suma <= limite);
//        System.out.println("La suma total es: " + suma);
        //Ejercicio6
//        int num1, num2, menu;
//        String salir;
//        System.out.println("Ingrese dos numeros positivos");
//        do {
//            num1 = leer.nextInt();
//        } while (num1 <= 0);
//
//        do {
//            num2 = leer.nextInt();
//        } while (num2 <= 0);
//
//        System.out.println("MENU");
//        System.out.println("1. Sumar");
//        System.out.println("2. Restar");
//        System.out.println("3. Multiplicar");
//        System.out.println("4. Dividir");
//        System.out.println("5. Salir");
//        System.out.println("");
//        System.out.println("Elija una opción");
//
//        menu = leer.nextInt();
//        
////        switch(menu){
////            case 1:
////                System.out.println("La de los numeros " + num1 + " y " + num2 " es" + (num1+num2));    
////        }
        
        //Ejercicio6
        /*
        int num1, num2, opcion;
        String opcion2 = "";
        System.out.println("Ingrede dos números");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una opción:");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("La suma es: " + (num1+num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (num1-num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es: " + (num1*num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("La division es: " + (num1/num2));
                    }else{
                        System.out.println("No se puede dividir por 0");
                    }
                    break;
                case 5:
                    System.out.println("¿Esta seguro que desea salir del programa (S/N)");
                    opcion2 = leer.next();
                    break;
            }
        } while (!opcion2.equalsIgnoreCase("s"));
        */
        
        //Ejercicio7
        /*
        String cadena;
        int len;
        do {
            System.out.println("Ingrese una cadena RS232");
            cadena = leer.next();
            len = cadena.length();
            if (len >= 2 && len <= 5) {
                if (cadena.substring(0, 1).equals("X") && cadena.substring(len - 1).equals("O")) {
                    System.out.println("Cadena RS232");
                }
            } else {
                System.out.println("Cadena NO RS232");
            }
        } while (!cadena.equals("&&&&&"));
        */
        
        //Ejercicio8
        /*
        int num;
        System.out.println("Ingrese del cuadrado a generar");
        num = leer.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == 1 || i == num || j == 1 || j == num) {
                    System.out.print(" x ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
        */
    }
}