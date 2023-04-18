/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9_clase_utilidad;

import entidades.Curso;
import servicio.ServicioCurso;

/**
 *
 * @author bruno
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServicioCurso servCurso = new ServicioCurso();
        
        Curso curso = servCurso.crearCurso();
        
        servCurso.calcularGananciaSemanal(curso);
    }
    
}
