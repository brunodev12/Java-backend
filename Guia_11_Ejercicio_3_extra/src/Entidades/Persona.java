/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author bruno
 */
public class Persona {
    private final String nombre;
    private final String apellido;
    private final long documento;
    private final String mail;
    private final String domicilio;
    private final long telefono;

    public Persona(String nombre, String apellido, long documento, String mail, String domicilio, long telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public long getDocumento() {
        return documento;
    }

    public String getMail() {
        return mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public long getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", mail=" + mail + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }
    
    
}
