/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Enumeraciones.TipoGimnasio;

/**
 *
 * @author bruno
 */
public class Hotel4 extends Hotel{
    private boolean gimnasio;
    private String nombreRestaurante;
    private int capacidadRestaurante;
    private TipoGimnasio tipoGym;

    public Hotel4(boolean gimnasio, String nombreRestaurante, int capacidadRestaurante, TipoGimnasio tipoGym, int habitaciones, int camas, int pisos, String nombre, String direccion, String localidad, String gerente) {
        super(habitaciones, camas, pisos, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        this.tipoGym = tipoGym;
        super.precioHabitaciones += calcularPrecioHabitacion();
    }

    public boolean isGimnasio() {
        return gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public TipoGimnasio getTipoGym() {
        return tipoGym;
    }
    
    private int calcularPrecioHabitacion(){
        int valorAgregadoRestaurante;
        int valorAgregadoGimnasio = 0;
        if (capacidadRestaurante<30) {
            valorAgregadoRestaurante=10;
        } else if (capacidadRestaurante>= 30 && capacidadRestaurante <= 50){
            valorAgregadoRestaurante=30;
        } else {
            valorAgregadoRestaurante=50;
        }
        
        if (gimnasio) {
            if (tipoGym == TipoGimnasio.A) {
                valorAgregadoGimnasio = 50;
            } else {
                valorAgregadoGimnasio = 30;
            }
        }
        return valorAgregadoRestaurante + valorAgregadoGimnasio;
    }

    @Override
    public String toString() {
        return "---Hotel 4 estrellas---" + "\nnombre = " + nombre + "\ndireccion = " + direccion + "\nlocalidad = " + localidad + "\ngerente = " + gerente + "\nhabitaciones = " + habitaciones + "\ncamas = " + camas + "\npisos = " + pisos + "\nprecioHabitaciones = " + precioHabitaciones + "\ngimnasio = " + gimnasio + "\nnombreRestaurante = " + nombreRestaurante + "\ncapacidadRestaurante = " + capacidadRestaurante + "\ntipoGym = " + tipoGym;
    }
    
}
