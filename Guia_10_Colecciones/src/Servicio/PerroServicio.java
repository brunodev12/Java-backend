/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class PerroServicio {
    
    private final ArrayList<Perro> _perros = new ArrayList();
    
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void agregarPerro() {
        System.out.print("Ingrese un nombre: ");
        String nombre = leer.next().toLowerCase();
        System.out.print("Ingrese la raza: ");
        String raza = leer.next();
        _perros.add(new Perro(nombre, raza));
    }
    
    public void mostrarPerro(){
        _perros.forEach((_perro) -> {
            System.out.println( _perro.getNombre() + " " + _perro.getRaza() );
        });
    }
    
    public void quitarPerro(){
        System.out.print("Ingrese el nombre del perro a quitar: ");
        String nombre = leer.next();
        Iterator<Perro> iterador = _perros.iterator();
        boolean existe = false;
        while(iterador.hasNext()){
            if (iterador.next().getNombre().equalsIgnoreCase(nombre)) {
                iterador.remove();
                existe = true;
            }
        }
        if (!existe) {
            System.out.println("No se ha encontrado el perro en la lista");
        }
        
        ordernarLista();
    }
    
    private void ordernarLista(){
        _perros.sort(Perro.compararNombre);
    }

}
