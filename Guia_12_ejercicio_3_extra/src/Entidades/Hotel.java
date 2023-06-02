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
public class Hotel extends Alojamiento{
    protected int habitaciones;
    protected int camas;
    protected int pisos;
    protected Integer precioHabitaciones;

    public Hotel(int habitaciones, int camas, int pisos, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
        this.precioHabitaciones = 50 + (camas * habitaciones * pisos);
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public int getCamas() {
        return camas;
    }

    public int getPisos() {
        return pisos;
    }

    public Integer getPrecioHabitaciones() {
        return precioHabitaciones;
    }
    
    public static Comparator<Hotel> precioDescendente = (Hotel h1, Hotel h2) -> h2.getPrecioHabitaciones().compareTo(h1.getPrecioHabitaciones());

    @Override
    public String toString() {
        return "---Hotel---" + "\nnombre = " + nombre + "\ndireccion = " + direccion + "\nlocalidad = " + localidad + "\ngerente = " + gerente + "\nhabitaciones = " + habitaciones + "\ncamas = " + camas + "\npisos = " + pisos + "\nprecioHabitaciones = " + precioHabitaciones;
    }
    
}
