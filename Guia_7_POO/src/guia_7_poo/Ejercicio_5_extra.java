/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_poo;

import guia_7_poo.newpackage.Cuenta;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Ejercicio_5_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int opcion;

        System.out.println("Ingrese el nombre del titular de la cuenta");
        String titular = leer.nextLine();

        System.out.println("Ingrese el saldo");
        int saldo = leer.nextInt();

        Cuenta banco = new Cuenta(titular, saldo);

        do {
            System.out.println("Seleccione una opción");
            System.out.println("1. Ver saldo");
            System.out.println("2. Retirar");
            System.out.println("3. Depositar");
            System.out.println("4. Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo es: $" + banco.getSaldo());
                    break;
                case 2:
                    System.out.print("Ingrese el monto a retirar: ");
                    banco.retirarDinero(leer.nextInt());
                    break;
                case 3:
                    System.out.print("Ingrese el monto a depositar: ");
                    banco.ingresarDinero(leer.nextInt());
                    break;
                case 4:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 4);

    }
}
