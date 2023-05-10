/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;
import java.util.List;

/**
 *
 * @author bruno
 */
public class Persona {
    private String nombre;
    private Integer edad;
    private Date fechaNacimiento;
    private List<Mascota> mascotas;
    private Mascota mascotaFavorita;

    public Persona(String nombre, Integer edad, Date fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getEdad() {
        return edad;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public Mascota getMascotaFavorita() {
        return mascotaFavorita;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void setMascotaFavorita(Mascota mascotaFavorita) {
        this.mascotaFavorita = mascotaFavorita;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + "\n mascotas=" + mascotas + "\n mascotaFavorita=" + mascotaFavorita + '}';
    }
    
    
    
    
}
