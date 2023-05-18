/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_11_ejercicio_4_extra;

import Entidades.Alumno;
import Entidades.Voto;
import Servicio.Simulador;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author bruno
 */
public class Guia_11_Ejercicio_4_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Simulador simulador = new Simulador();
        
        ArrayList<String> listaAlumnos = simulador.generarListadoAlumnos();
        
        HashSet<Integer> listaDni = simulador.generarListaDni(listaAlumnos);
        
        ArrayList<Alumno> alumnos = simulador.generarAlumnos(listaAlumnos, listaDni);
        
        simulador.mostrarAlumnos(alumnos);
        
        simulador.votacion(alumnos);
        
        simulador.recuentoVotos(alumnos);
        
        simulador.mostrarFacilitadores(alumnos);
        
        
    }
    
}
