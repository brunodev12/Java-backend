/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Persona;
import Entidades.Poliza;
import Entidades.Vehiculo;
import Enumeraciones.FormaPago;
import Enumeraciones.TipoCobertura;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class GestionPolizas {

    private final ArrayList<Poliza> polizas = new ArrayList();
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private void generarPoliza(ArrayList<Persona> clientes, ArrayList<Vehiculo> vehiculos) {
        for (int i = 0; i < clientes.size(); i++) {
            Persona cliente = clientes.get(i);
            Vehiculo vehiculo = vehiculos.get(i);
            System.out.println("Ingrese el número de Poliza del cliente - " + clientes.get(i).getNombre() + " " + clientes.get(i).getApellido());
            int numeroPoliza = leer.nextInt();
            Date fechaInicio = new Date("01/01/2023");
            Date fechaFin = new Date("01/01/2024");
            System.out.print("Ingrese la cantidad de cuotas: ");
            int cantidadCuotas = leer.nextInt();
            System.out.print("Ingrese el monto asegurado: ");
            long montoAsegurado = leer.nextLong();
            System.out.println("Seguro contra granizo: ");
            System.out.println("1. Si");
            System.out.println("2. No");
            int opcion = leer.nextInt();
            boolean granizo;
            granizo = opcion == 1;
            int montoTotalGranizo = 0;
            if (granizo) {
                System.out.print("Ingrese el monto total asegurado contra granizo: ");
                montoTotalGranizo = leer.nextInt();
            }
            Poliza poliza = new Poliza(cliente, vehiculo, numeroPoliza, fechaInicio, fechaFin, cantidadCuotas, montoAsegurado, granizo, montoTotalGranizo);
            setFormaPago(poliza);
            setTipoCobertura(poliza);
            poliza.setCuotas();
            polizas.add(poliza);
        }
    }

    public ArrayList<Poliza> getPolizas() {
        return polizas;
    }

    private void setFormaPago(Poliza _poliza) {
        int opcion;
        System.out.println("Ingrese una forma de pago: ");
        System.out.println("1. Efectivo");
        System.out.println("2. Transferencia");
        System.out.println("3. Mercado Pago");
        System.out.println("4. Debito");
        System.out.println("5. Credito");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                _poliza.setFormaDePago(FormaPago.EFECTIVO);
                break;
            case 2:
                _poliza.setFormaDePago(FormaPago.TRANSFERENCIA);
                break;
            case 3:
                _poliza.setFormaDePago(FormaPago.MERCADOPAGO);
                break;
            case 4:
                _poliza.setFormaDePago(FormaPago.DEBITO);
                break;
            case 5:
                _poliza.setFormaDePago(FormaPago.CREDITO);
                break;
            default:
                _poliza.setFormaDePago(FormaPago.TRANSFERENCIA);
                break;
        }
    }

    private void setTipoCobertura(Poliza _poliza) {
        int opcion;
        System.out.println("Ingrese un tipo de cobertura: ");
        System.out.println("1. Total");
        System.out.println("2. Contra terceros");
        System.out.println("3. Amplia");
        System.out.println("4. Limitada");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                _poliza.setTipoCobertura(TipoCobertura.TOTAL);
                break;
            case 2:
                _poliza.setTipoCobertura(TipoCobertura.CONTRA_TERCEROS);
                break;
            case 3:
                _poliza.setTipoCobertura(TipoCobertura.AMPLIA);
                break;
            case 4:
                _poliza.setTipoCobertura(TipoCobertura.LIMITADA);
                break;
            default:
                _poliza.setTipoCobertura(TipoCobertura.TOTAL);
                break;
        }
    }

    private void mostrarPolizas() {
        for (Poliza poliza : polizas) {
            System.out.println(poliza);
        }
    }

    public void menuPolizas(ArrayList<Persona> clientes, ArrayList<Vehiculo> vehiculos) {
        int opcion;
        System.out.println("===== Bienvenido al gestor de polizas =====");
        do {
            System.out.println("Qué desea hacer?");
            System.out.println("1. Registrar poliza");
            System.out.println("2. Mostrar polizas");
            System.out.println("3. Salir");
            System.out.println("==========================================");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    generarPoliza(clientes, vehiculos);
                    break;
                case 2:
                    mostrarPolizas();
                    break;
                case 3:
                    System.out.println("Saliendo del gestor de polizas...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion!=3);
    }
}
