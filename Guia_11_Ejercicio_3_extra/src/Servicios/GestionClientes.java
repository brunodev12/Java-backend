/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class GestionClientes {

    private final ArrayList<Persona> clientes = new ArrayList();
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private void registrarCliente() {
        System.out.print("Ingrese el nombre: ");
        String nombre = leer.next();
        System.out.print("Ingrese el apellido: ");
        String apellido = leer.next();
        System.out.print("Ingrese el documento: ");
        long dni = leer.nextLong();
        System.out.print("Ingrese el correo: ");
        String mail = leer.next();
        System.out.print("Ingrese el domicilio: ");
        String domicilio = leer.next();
        System.out.print("Ingrese el telefono: ");
        long telefono = leer.nextLong();
        Persona cliente = new Persona(nombre, apellido, dni, mail, domicilio, telefono);
        clientes.add(cliente);
    }

    public ArrayList<Persona> getClientes() {
        return clientes;
    }

    private void mostrarClientes() {
        for (Persona cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void menuClientes() {
        int opcion;
        System.out.println("===== Bienvenido al gestor de clientes =====");
        do {
            System.out.println("Qué desea hacer?");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Mostrar clientes");
            System.out.println("3. Salir");
            System.out.println("==========================================");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    registrarCliente();
                    break;
                case 2:
                    mostrarClientes();
                    break;
                case 3:
                    System.out.println("Saliendo del gestor de clientes...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 3);
    }
}
