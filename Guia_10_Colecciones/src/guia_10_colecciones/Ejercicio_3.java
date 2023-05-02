/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10_colecciones;

import Entidades.Alumno;
import Servicio.AlumnoServicio;
import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Alumno> alumnos = new ArrayList();
        
        AlumnoServicio AS = new AlumnoServicio();
        
        AS.crearAlumno(alumnos);
        
        System.out.println("La nota final del alumno es: " + AS.notaFinal(alumnos));
        
        AS.allNotas(alumnos);
        
    }
    
}
