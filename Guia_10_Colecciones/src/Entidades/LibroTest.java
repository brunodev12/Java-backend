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
public class LibroTest {

    private final String nombre;
    private final Integer numeroCopia;

    public LibroTest(String nombre, Integer numeroCopia) {
        this.nombre = nombre;
        this.numeroCopia = numeroCopia;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", numeroCopia=" + numeroCopia + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getNumeroCopia() {
        return numeroCopia;
    }

//    public static Comparator<Libro> compararCopias = new Comparator<Libro>() {
//        @Override
//        public int compare(Libro l1, Libro l2) {
//            return l2.getNumeroCopia().compareTo(l1.getNumeroCopia());
//        }
//
//    };

    public static Comparator<LibroTest> compararCopias = (LibroTest L1, LibroTest L2) -> L1.getNumeroCopia().compareTo(L2.getNumeroCopia());

}
