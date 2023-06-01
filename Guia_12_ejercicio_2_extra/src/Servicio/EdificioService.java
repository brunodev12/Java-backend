/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import Enumeraciones.TipoInstalacion;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class EdificioService {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Edificio crearEdificio() {
        int opcion;
        do {
            System.out.println("Ingrese el tipo de edificio que desea crear: ");
            System.out.println("1. Polideportivo");
            System.out.println("2. Oficina");
            opcion = leer.nextInt();
        } while (opcion != 1 && opcion != 2);

        System.out.print("Ingrese el ancho del edificio: ");
        int ancho = leer.nextInt();
        System.out.print("Ingrese el largo del edificio: ");
        int largo = leer.nextInt();
        System.out.print("Ingrese la altura del edificio: ");
        int alto = leer.nextInt();
        if (opcion == 1) {
            TipoInstalacion instalacion;
            System.out.print("Ingrese el nombre del polideportivo: ");
            String nombre = leer.next();
            System.out.print("El polideportivo es techado? ");
            String techado = leer.next();
            if (techado.equalsIgnoreCase("si")) {
                instalacion = TipoInstalacion.TECHADO;
            } else {
                instalacion = TipoInstalacion.ABIERTO;
            }
            return new Polideportivo(nombre, instalacion, ancho, alto, largo);
        } else {
            System.out.print("Ingrese la cantidad de personas por oficina: ");
            int personasPorOficina = leer.nextInt();
            System.out.print("Ingrese la cantidad de oficinas por piso: ");
            int oficinas = leer.nextInt();
            System.out.print("Ingrese la cantidad de pisos: ");
            int pisos = leer.nextInt();
            return new EdificioDeOficinas(oficinas, personasPorOficina, pisos, ancho, alto, largo);
        }
    }

}
