/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_clase_servicio.servicio;

import guia_8_clase_servicio.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class PersonaServicio {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        System.out.print("Nombre: ");
        String nombre = leer.next();
        System.out.print("Edad: ");
        int edad = leer.nextInt();
        String sexo = validarSexo();
        System.out.print("Peso (kg): ");
        int peso = leer.nextInt();
        System.out.print("Altura (m): ");
        float altura = leer.nextFloat();
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    private String validarSexo() {
        String sexo = "";
        do {
            System.out.println("Ingrese sexo: ");
            System.out.println("H) Hombre");
            System.out.println("M) Mujer");
            System.out.println("O) Otro");
            sexo = leer.next();

            if (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O")) {
                System.out.println("Opción no válida");
            }

        } while (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O"));
        return sexo;
    }

    public boolean mayorEdad(Persona _persona) {
        return _persona.getEdad() >= 18;
    }

    public int calcularIMC(Persona _persona) {
        int peso = _persona.getPeso();
        float altura = _persona.getAltura();

        if (peso / Math.pow(altura, 2) < 20) {
            return -1;
        } else if (peso / Math.pow(altura, 2) >= 20 && peso / Math.pow(altura, 2) <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
}
