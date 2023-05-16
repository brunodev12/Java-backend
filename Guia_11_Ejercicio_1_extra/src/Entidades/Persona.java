/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private ArrayList<Perro> perros;

    public Persona(String nombre, String apellido, int edad, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.perros = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }

    public ArrayList<Perro> getPerros() {
        return perros;
    }

    public boolean setPerro(Perro perro) {
        if(perro.getPropietario()==null){
            System.out.println("Usted ha adoptado a " + perro.getNombre() + " mas vale que lo cuide");
            perros.add(perro);
            perro.setPropietario(this);
            return true;
        } else {
            System.out.println("ya tiene dueño: " + perro.getPropietario().getNombre());
            return false;
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", perros=" + perros + '}';
    }
    
    
}
