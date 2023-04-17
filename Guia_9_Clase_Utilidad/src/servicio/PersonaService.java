/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class PersonaService {
    FechaService fechaServicio = new FechaService();
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        System.out.print("Ingrese un nombre: ");
        String nombre=leer.next();
        
        Date fechaNacimiento = fechaServicio.fechaNacimiento();
        
        return new Persona(nombre, fechaNacimiento);
    }
    
    public void calcularEdad(Persona _persona){
        Date _fechaActual = fechaServicio.fechaActual();
        Date edad = fechaServicio.diferencia(_persona.getFechaNacimiento(), _fechaActual);
        System.out.println("La edad es: " + edad.getYear());
    }
    
}
