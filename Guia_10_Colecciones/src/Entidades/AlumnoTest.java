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
public class AlumnoTest {

    private final String nombre;
    private final String apodo;
    private final Integer dni;

    public AlumnoTest(String nombre, String apodo, Integer dni) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public Integer getDni() {
        return dni;
    }

    public static Comparator<AlumnoTest> compararDni = new Comparator<AlumnoTest>() {
        @Override
        public int compare(AlumnoTest a1, AlumnoTest a2) {
            return a1.getDni().compareTo(a2.getDni());
        }

    };

//    public static Comparator<Alumno> compararDni = (Alumno a1, Alumno a2) -> a1.getDni().compareTo(a2.getDni());

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apodo=" + apodo + ", dni=" + dni + '}';
    }
}
