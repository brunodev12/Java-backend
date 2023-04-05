/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_clase_servicio;

import guia_8_clase_servicio.entidades.Cafetera;
import guia_8_clase_servicio.servicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        int opcion;
        CafeteraServicio cafSer = new CafeteraServicio();

        Cafetera cafecito = cafSer.crearCafetera();

        do {
            System.out.println("========== Ingrese una opción para continuar: ==========");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar cafe");
            System.out.println("5. Mostrar cafe restante");
            System.out.println("6. Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cafSer.llenarCafetera(cafecito);
                    break;
                case 2:
                    System.out.print("Ingrese el tamaño de la taza: ");
                    int taza = leer.nextInt();
                    cafSer.servirTaza(cafecito, taza);
                    break;
                case 3:
                    cafSer.vaciarCafetera(cafecito);
                    break;
                case 4:
                    cafSer.agregarCafe(cafecito);
                    break;
                case 5:
                    cafSer.mostrarCafe(cafecito);
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
