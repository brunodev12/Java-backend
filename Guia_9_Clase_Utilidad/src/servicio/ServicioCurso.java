/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class ServicioCurso {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private String[] cargarAlumnos(){
        String[] nombres = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno: ");
            nombres[i] = leer.next();
        }
        return nombres;
    }
    
    public Curso crearCurso(){
        System.out.print("Ingrese nombre del curso: ");
        String nombreCurso = leer.next();
        System.out.print("Ingrese la cantidad de horas por día: ");
        int cantidadHorasDia = leer.nextInt();
        System.out.print("Ingrese la cantidad de días por semana: ");
        int cantidadDiaSemana = leer.nextInt();
        System.out.print("Ingrese el turno: ");
        String turno = leer.next();
        System.out.print("Ingrese el precio por hora: ");
        int precioHora = leer.nextInt();
        String[] alumnos = this.cargarAlumnos();
        return new Curso(nombreCurso, cantidadHorasDia, cantidadDiaSemana, turno, precioHora, alumnos);
    }
    
    public void calcularGananciaSemanal(Curso _curso){
        int cantidadHorasDia = _curso.getCantidadHorasPorDia();
        int precioHora = _curso.getPrecioPorHora();
        int cantidadAlumnos = _curso.getAlumnos().length;
        int cantidadDiaSemana = _curso.getCantidadDiasPorSemana();
        System.out.println("La ganancia semanal es: $" + (cantidadHorasDia*precioHora*cantidadAlumnos*cantidadDiaSemana));
    }
    
}
