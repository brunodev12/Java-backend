/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Comparator;

/**
 *
 * @author bruno
 */
public class Perro {
    private final String nombre;
    private final String raza;

    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }
    
    public static Comparator<Perro> compararNombre = (Perro p1, Perro p2) -> p1.getNombre().compareTo(p2.getNombre());
    
}
