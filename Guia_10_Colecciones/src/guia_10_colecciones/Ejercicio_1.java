/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10_colecciones;

import Entidades.Perro;
import Servicio.PerroServicio;
import java.util.ArrayList;
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
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PerroServicio PS = new PerroServicio();
        String opcion;
        
        do {
            
            PS.agregarPerro();
            
            System.out.println("Desea seguir agregando perros? ");
            opcion = leer.next();
            
            
        } while (opcion.equalsIgnoreCase("si"));
        
        PS.mostrarPerro();
        
        
        
    }
    
}
