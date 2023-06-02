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
public class Hotel5 extends Hotel {

    private boolean gimnasio;
    private String nombreRestaurante;
    private int capacidadRestaurante;
    private int cantSalonesConferencia;
    private int cantSuites;
    private int cantLimosinas;
    private TipoGimnasio tipoGym;

    public Hotel5(boolean gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantSalonesConferencia, int cantSuites, int cantLimosinas, TipoGimnasio tipoGym, int habitaciones, int camas, int pisos, String nombre, String direccion, String localidad, String gerente) {
        super(habitaciones, camas, pisos, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
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

    public int getCantSalonesConferencia() {
        return cantSalonesConferencia;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public TipoGimnasio getTipoGym() {
        return tipoGym;
    }

    private int calcularPrecioHabitacion() {
        int valorAgregadoRestaurante;
        int valorAgregadoGimnasio = 0;
        int valorAgregadoLimosina = 15 * cantLimosinas;
        if (capacidadRestaurante < 30) {
            valorAgregadoRestaurante = 10;
        } else if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50) {
            valorAgregadoRestaurante = 30;
        } else {
            valorAgregadoRestaurante = 50;
        }

        if (gimnasio) {
            if (tipoGym == TipoGimnasio.A) {
                valorAgregadoGimnasio = 50;
            } else {
                valorAgregadoGimnasio = 30;
            }
        }
        
        
        return valorAgregadoRestaurante + valorAgregadoGimnasio + valorAgregadoLimosina;
    }

    @Override
    public String toString() {
        return "---Hotel 5 estrellas---" + "\nnombre = " + nombre + "\ndireccion = " + direccion + "\nlocalidad = " + localidad + "\ngerente = " + gerente + "\nhabitaciones = " + habitaciones + "\ncamas = " + camas + "\npisos = " + pisos + "\nprecioHabitaciones = " + precioHabitaciones 
                + "\ngimnasio = " + gimnasio + "\nnombreRestaurante = " + nombreRestaurante + "\ncapacidadRestaurante = " + capacidadRestaurante + "\ncantSalonesConferencia = " + cantSalonesConferencia + "\ncantSuites = " + cantSuites + "\ncantLimosinas = " + cantLimosinas + "\ntipoGym = " + tipoGym;
    }

}
