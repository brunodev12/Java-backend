/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Vehiculo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class GestionVehiculos {
    private final ArrayList<Vehiculo> vehiculos = new ArrayList();
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private void registrarVehiculo(){
        System.out.print("Ingrese la marca: ");
        String marca = leer.next();
        System.out.print("Ingrese el modelo: ");
        String modelo = leer.next();
        System.out.print("Ingrese el año: ");
        int anio = leer.nextInt();
        System.out.print("Ingrese el numero de motor: ");
        int numeroMotor = leer.nextInt();
        System.out.print("Ingrese el numero de chasis: ");
        int chasis = leer.nextInt();
        System.out.print("Ingrese el color: ");
        String color = leer.next();
        System.out.print("Ingrese el tipo: ");
        String tipo = leer.next();
        Vehiculo vehiculo = new Vehiculo(marca,modelo,anio,numeroMotor,chasis,color,tipo);
        vehiculos.add(vehiculo);
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    
    private void mostrarVehiculos(){
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }
    
    public void menuVehiculos() {
        int opcion;
        System.out.println("===== Bienvenido al gestor de vehiculos =====");
        do {
            System.out.println("Qué desea hacer?");
            System.out.println("1. Registrar vehiculo");
            System.out.println("2. Mostrar vehiculos");
            System.out.println("3. Salir");
            System.out.println("==========================================");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    registrarVehiculo();
                    break;
                case 2:
                    mostrarVehiculos();
                    break;
                case 3:
                    System.out.println("Saliendo del gestor de vehiculos...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 3);
    }
    
}
