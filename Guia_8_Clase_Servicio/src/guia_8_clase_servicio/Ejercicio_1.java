/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_clase_servicio;

import guia_8_clase_servicio.entidades.CuentaBancaria;
import guia_8_clase_servicio.servicio.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        
        int opcion;
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();

        CuentaBancaria cuenta1 = cbs.crearCuenta();

        do {
            System.out.println("========== Ingrese una opción para continuar: ==========");
            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Extracción rápida");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Consultar datos");
            System.out.println("6. Salir");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    cbs.ingresar(cuenta1);
                    break;
                case 2:
                    cbs.retirar(cuenta1);
                    break;
                case 3:
                    cbs.extraccionRapida(cuenta1);
                    break;
                case 4:
                    cbs.consultarSaldo(cuenta1);
                    break;
                case 5:
                    cbs.consultarDatos(cuenta1);
                    break;
                case 6:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            
        } while (opcion != 6);

        

        
        
        
        
    }

}
