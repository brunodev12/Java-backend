/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9_clase_utilidad;

import entidades.Persona;
import java.util.Scanner;
import servicio.PersonaService;

/**
 *
 * @author bruno
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        PersonaService personaServicio = new PersonaService();
        
        Persona persona = personaServicio.crearPersona();
        
        System.out.println(persona.getNombre());
        System.out.println(persona.getFechaNacimiento());
        
        System.out.println("La edad es: " + personaServicio.calcularEdad(persona));
        
        System.out.print("Ingrese una edad: ");
        int edad = leer.nextInt();
        System.out.println("La persona es menor que: " + personaServicio.menorQue(persona, edad));
        
        personaServicio.mostrarPersona(persona);
    }
    
}
