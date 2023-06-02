/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author bruno
 */
public class Camping extends ExtraHotel{
    private int capacidadCarpas;
    private int cantBanios;
    private boolean restaurante;

    public Camping(int capacidadCarpas, int cantBanios, boolean restaurante, boolean privado, int superficie, String nombre, String direccion, String localidad, String gerente) {
        super(privado, superficie, nombre, direccion, localidad, gerente);
        this.capacidadCarpas = capacidadCarpas;
        this.cantBanios = cantBanios;
        this.restaurante = restaurante;
    }

    public int getCapacidadCarpas() {
        return capacidadCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    @Override
    public String toString() {
        //return super.toString() + ...
        return "\n---Camping---" + "\nnombre = " + nombre + "\ndireccion = " + direccion + "\nlocalidad = " + localidad + "\ngerente = " + gerente + "\nprivado = " + privado + "\nsuperficie = " + superficie + "\ncapacidadCarpas = " + capacidadCarpas + "\ncantBanios = " + cantBanios + "\nrestaurante = " + restaurante;
    }
    
    
}
