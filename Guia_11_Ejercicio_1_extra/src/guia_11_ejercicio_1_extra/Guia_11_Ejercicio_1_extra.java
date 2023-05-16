/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_11_ejercicio_1_extra;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Guia_11_Ejercicio_1_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Perro dog1 = new Perro("Neron", "Doberman", 3, "Grande");
        Perro dog2 = new Perro("Cleo", "Pitbull", 2, "Mediano");
        Perro dog3 = new Perro("Jaime", "Salchicha", 7, "Pequeño");
        Perro dog4 = new Perro("Pancho", "Salchicha", 8, "Pequeño");
        Perro dog5 = new Perro("Luna", "Lazy", 4, "Mediano");
        Perro dog6 = new Perro("Simon", "Mantonegro", 5, "Grande");
        Perro dog7 = new Perro("Carpincho", "Barbincho", 4, "Pequeño");
        Persona p1 = new Persona("Jorge", "Monasterio", 34, 19000);
        Persona p2 = new Persona("Manolo", "Castillo", 45, 25000);
        Persona p3 = new Persona("Bruno", "Tower", 26, 25000);
        Persona p4 = new Persona("Nico", "Crack", 19, 25000);
        Persona p5 = new Persona("Victoria", "Correa", 25, 25000);
        Persona p6 = new Persona("Matias", "Insaurralde", 27, 25000);
        Persona p7 = new Persona("Nadia", "Rojas", 23, 25000);

        ArrayList<Perro> dogs = new ArrayList();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        dogs.add(dog5);
        dogs.add(dog6);
        dogs.add(dog7);
        ArrayList<Persona> personas = new ArrayList();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);
        personas.add(p6);
        personas.add(p7);
        
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " qué perro quiere adoptar? ");
            for (Perro dog : dogs) {
                System.out.println(dog.getNombre());
            }
            boolean check=false;
            do {
                System.out.println("Ingrese el nombre del perro a adoptar");
                String nombre = leer.next();
                for (Perro dog : dogs) {
                    if (nombre.equalsIgnoreCase(dog.getNombre())) {
                        check = persona.setPerro(dog);
                    }
                }
            } while (!check);
        }
        
//        ArrayList<Perro> perros = new ArrayList();
        for (Persona persona : personas) {
            System.out.println(persona);
//            ArrayList<Perro> perros = persona.getPerros();
//            for (Perro perro : perros) {
//                System.out.println(perro);
//            }
        }
    }
}
