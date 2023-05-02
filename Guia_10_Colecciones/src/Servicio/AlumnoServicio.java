/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class AlumnoServicio {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearAlumno(ArrayList<Alumno> _alumnos) {
        String opcion;
        do {
            System.out.println("Ingrese el nombre del alumno: ");
            String nombre = leer.next();
            Integer[] notas = new Integer[3];
            for (int i = 0; i < 3; i++) {
                notas[i] = (int) (Math.random() * 10);
            }
            Alumno nuevoAlumno = new Alumno(nombre, notas);
            _alumnos.add(nuevoAlumno);

            System.out.println("Desea agregar otro alumno? ");
            opcion = leer.next();

        } while (opcion.equalsIgnoreCase("si"));

    }

    public double notaFinal(ArrayList<Alumno> _alumnos) {
        System.out.println("Ingrese el nombre del alumno del cual desea saber la nota final: ");
        String nombre = leer.next();
        int sumaNota = 0;
        boolean existe = false;
        for (Alumno _alumno : _alumnos) {
            if (_alumno.getNombre().equalsIgnoreCase(nombre)) {
                existe = true;
                Integer[] notas = _alumno.getNotas();
                for (Integer nota : notas) {
                    sumaNota += nota;
                }
            }
        }
        if (existe) {
            return sumaNota / 3;
        } else {
            System.out.println("El alumno ingresado no existe");
            return 0;
        }
    }
    
    public void allNotas(ArrayList<Alumno> _alumnos){
        _alumnos.forEach((_alumno) -> {
            int sumaNota = 0;
            Integer[] notas = _alumno.getNotas();
            for (Integer nota : notas) {
                sumaNota += nota;
            }
            System.out.println("La nota final de " + _alumno.getNombre() + " es: " + (sumaNota/3));
        });
    }

}
