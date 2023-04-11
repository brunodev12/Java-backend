/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_clase_servicio.servicio;

import guia_8_clase_servicio.entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class NIFService {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public NIF crearNif() {
        long dni;
        do {
            System.out.print("Ingrese el DNI del usuario: ");
            dni = leer.nextLong();
            if (dni <= 0) {
                System.out.println("El DNI debe ser mayor a 0");
            }
        } while (dni <= 0);

        char letra = getLetra(dni);
        return new NIF(dni, letra);
    }

    private char getLetra(long _dni) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int posicion = (int) (_dni % 23);
        return letras[posicion];
    }

    public void mostrar(NIF _nif) {
        System.out.println("El NIF es: " + _nif.getDNI() + "-" + _nif.getLetra());
    }
}
