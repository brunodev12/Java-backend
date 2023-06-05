/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Enumeraciones.Cursos;
import Enumeraciones.EstadoCivil;

/**
 *
 * @author bruno
 */
public class Estudiante extends Persona{
    private Cursos curso;

    public Estudiante(Cursos curso, String nombre, String apellido, int dni, EstadoCivil estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.curso = curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }

    public Cursos getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return super.toString() + ", Profesion=Estudiante" + ", curso=" + curso;
    }
    
    
}
