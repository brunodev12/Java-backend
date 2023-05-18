package guia_11_ejercicio_3_extra;

import Servicios.GestionClientes;
import Servicios.GestionCuotas;
import Servicios.GestionPolizas;
import Servicios.GestionVehiculos;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Guia_11_Ejercicio_3_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        GestionClientes gestorCliente = new GestionClientes();
        GestionVehiculos gestorVehiculos = new GestionVehiculos();
        GestionPolizas gestorPolizas = new GestionPolizas();
        GestionCuotas gestorCuotas = new GestionCuotas();
        
        int opcion;
        System.out.println("===== Bienvenido al Gestor de La Tercera Seguros =====");
        do {
            System.out.println("Qué desea hacer?");
            System.out.println("1. Ingresar al gestor de clientes");
            System.out.println("2. Ingresar al gestor de vehiculos");
            System.out.println("3. Ingresar al gestor de polizas");
            System.out.println("4. Ingresar al gestor de cuotas");
            System.out.println("5. Salir");
            System.out.println("==========================================");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    gestorCliente.menuClientes();
                    break;
                case 2:
                    gestorVehiculos.menuVehiculos();
                    break;
                case 3:
                    gestorPolizas.menuPolizas(gestorCliente.getClientes(), gestorVehiculos.getVehiculos());
                    break;
                case 4:
                    gestorCuotas.menuCuotas(gestorPolizas.getPolizas());
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            
        } while (opcion!=5);
    }
    
}
