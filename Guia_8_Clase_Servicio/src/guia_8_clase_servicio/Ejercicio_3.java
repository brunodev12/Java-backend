/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_clase_servicio;

import guia_8_clase_servicio.entidades.Persona;
import guia_8_clase_servicio.servicio.PersonaServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
        PersonaServicio ps = new PersonaServicio();
        int cont = 1;
        int opcion;
        int mayorEdad = 0;
        int menorEdad = 0;
        int debajoPeso = 0;
        int pesoIdeal = 0;
        int sobrePeso = 0;
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese los datos para la persona " + cont);
            Persona persona = ps.crearPersona();
//            Persona persona = null;
//            try {
//                persona.getNombre();
//            } catch (NullPointerException e) {
//                System.out.println(e);
//                System.out.println("Ha ingresado un objeto nulo");
//                persona = ps.crearPersona();
//            }
            listaPersonas.add(persona);
            opcion = validarOpcion(leer);
            cont++;

        } while (opcion != 2);

        int totalPersonas = listaPersonas.size();

        for (int i = 0; i < totalPersonas; i++) {
            Persona _persona = listaPersonas.get(i);
            String nombre = _persona.getNombre();

            int edad = _persona.getEdad();

            System.out.println("========================= " + nombre + " =========================");
            if (ps.mayorEdad(_persona)) {
                System.out.println("Es mayor de edad " + "(" + edad + ")");
                mayorEdad++;
            } else {
                System.out.println("No es mayor de edad " + "(" + edad + ")");
                menorEdad++;
            }

            switch (ps.calcularIMC(_persona)) {
                case -1:
                    System.out.println("Está debajo de su peso ideal");
                    debajoPeso++;
                    break;
                case 0:
                    System.out.println("Está en su peso ideal");
                    pesoIdeal++;
                    break;
                case 1:
                    System.out.println("Está por encima de su peso ideal");
                    sobrePeso++;
                    break;
            }
        }

        System.out.println("==========================================================");
        System.out.println("El %" + (mayorEdad * 100 / totalPersonas) + " de las personas son mayores de edad");
        System.out.println("El %" + (menorEdad * 100 / totalPersonas) + " de las personas son menores de edad");
        System.out.println("El %" + (debajoPeso * 100 / totalPersonas) + " de las personas está debajo de su peso ideal");
        System.out.println("El %" + (pesoIdeal * 100 / totalPersonas) + " de las personas está en su peso ideal");
        System.out.println("El %" + (sobrePeso * 100 / totalPersonas) + " de las personas está por encima de su peso ideal");

    }

    private static int validarOpcion(Scanner _leer) {
        int opcion = 0;

        do {
            System.out.println("Desea seguir agregando personas?");
            System.out.println("1. Si");
            System.out.println("2. No");
            opcion = _leer.nextInt();

            if (opcion != 1 && opcion != 2) {
                System.out.println("Opción no válida");
            }

        } while (opcion != 1 && opcion != 2);
        return opcion;
    }

}
