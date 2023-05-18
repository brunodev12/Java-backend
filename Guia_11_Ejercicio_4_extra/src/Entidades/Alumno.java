/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Comparator;

/**
 *
 * @author bruno
 */
public class Alumno {
    private String nombreCompleto;
    private int dni;
    private Integer cantidadVotos;

    public Alumno(String nombreCompleto, int dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantidadVotos = 0;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Integer getCantidadVotos() {
        return cantidadVotos;
    }

    public void addVoto() {
        this.cantidadVotos++;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombreCompleto=" + nombreCompleto + ", dni=" + dni + ", cantidadVotos=" + cantidadVotos + '}';
    }
    
    public static Comparator<Alumno> compararVotos = new Comparator<Alumno>(){
        @Override
        public int compare(Alumno a1, Alumno a2){
            return a2.getCantidadVotos().compareTo(a1.getCantidadVotos());
        }
    };
}
