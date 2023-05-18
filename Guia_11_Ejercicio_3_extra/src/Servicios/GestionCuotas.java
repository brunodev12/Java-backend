package Servicios;

import Entidades.Cuota;
import Entidades.Persona;
import Entidades.Poliza;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class GestionCuotas {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private void mostrarCuotasTodas(ArrayList<Poliza> _polizas) {
        for (Poliza poliza : _polizas) {
            ArrayList<Cuota> cuotas = poliza.getCuotas();
            Persona persona = poliza.getPersona();
            System.out.println("Las cuotas de " + persona.getNombre() + " - Dni: " + persona.getDocumento() + " son:");
            for (Cuota cuota : cuotas) {
                System.out.println(cuota);
            }
        }
    }
    
    private void mostrarCuotaPersona(ArrayList<Poliza> _polizas){
     System.out.println("Ingrese el documento de la persona: ");
        long dni = leer.nextLong();
        boolean check=false;
        for (Poliza poliza : _polizas) {
            Persona persona = poliza.getPersona();
            if (persona.getDocumento() == dni) {
                check = true;
                ArrayList<Cuota> cuotas = poliza.getCuotas();
                System.out.println("Las cuotas de " + persona.getNombre() + " - Dni: " + persona.getDocumento() + " son:");
                for (Cuota cuota : cuotas) {
                    System.out.println(cuota);
                }
                break;
            }
        }
        if (!check) {
            System.out.println("No se ha encontrado una persona con ese documento");
        }
    }
    
    private void pagarCuota(ArrayList<Poliza> _polizas) {
        System.out.println("Ingrese el documento de la persona: ");
        long dni = leer.nextLong();
        boolean check=false;
        for (Poliza poliza : _polizas) {
            if (poliza.getPersona().getDocumento() == dni) {
                check = true;
                ArrayList<Cuota> cuotas = poliza.getCuotas();
                for (Cuota cuota : cuotas) {
                    System.out.println(cuota);
                }
                System.out.println("Qué cuota desea marcar como pagada? ");
                int numeroCuota = leer.nextInt() - 1;
                if (numeroCuota >= 0 && numeroCuota < cuotas.size()) {
                    Cuota cuota = cuotas.get(numeroCuota);
                    if (!cuota.isPagada()) {
                        cuota.setPagada(true);
                        System.out.println("Se ha pagado la cuota: " + cuota.getNumeroCuota());
                    } else {
                        System.out.println("Ya se ha pagado esa cuota");
                    }
                } else {
                    System.out.println("No existe esa cuota");
                }
                break;
            }
        }
        if (!check) {
            System.out.println("No se ha encontrado una persona con ese documento");
        }
    }
    
    public void menuCuotas(ArrayList<Poliza> _polizas) {
        int opcion;
        System.out.println("===== Bienvenido al gestor de cuotas =====");
        do {
            System.out.println("Qué desea hacer?");
            System.out.println("1. Mostrar cuotas de un cliente");
            System.out.println("2. Mostrar todas las cuotas de todos los clientes");
            System.out.println("3. Marcar como pagada una cuota de un cliente");
            System.out.println("4. Salir");
            System.out.println("==========================================");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    mostrarCuotaPersona(_polizas);
                    break;
                case 2:
                    mostrarCuotasTodas(_polizas);
                    break;
                case 3:
                    pagarCuota(_polizas);
                    break;
                case 4:
                    System.out.println("Saliendo del gestor de cuotas...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 4);
    }

}
