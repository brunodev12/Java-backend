/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class PerroServicio {
    
    private ArrayList<Perro> _perros = new ArrayList();
    
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void agregarPerro() {
        System.out.print("Ingrese un nombre: ");
        String nombre = leer.next();
        System.out.print("Ingrese la raza: ");
        String raza = leer.next();
        _perros.add(new Perro(nombre, raza));
    }
    
    public void mostrarPerro(){
        _perros.forEach((_perro) -> {
            System.out.println(_perro.getRaza());
        });
    }

}
