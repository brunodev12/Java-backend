/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Televisor extends Electrodomestico {

    private float resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(float resolucion, boolean sintonizador, int precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public float getResolucion() {
        return resolucion;
    }

    public void setResolucion(float resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public void crearTelevisor() {
        System.out.println("---Televisor---");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese la resolucion (pulgadas): ");
        this.resolucion = leer.nextFloat();
        System.out.print("Tiene sintonizador: ");
        String sint = leer.next();
        this.sintonizador = sint.equalsIgnoreCase("si");
        super.crearElectrodomestico();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();

        if (resolucion > 40) {
            precio *= 1.3;
        }
        if (sintonizador) {
            precio += 500;
        }
    }

    @Override
    public String toString() {
        return "---Televisor---" + "\nPrecio=" + precio + "\nColor=" + color + "\nConsumo energetico=" + consumoEnergetico + "\nPeso=" + peso + "\nResolucion=" + resolucion + "\nSintonizador=" + sintonizador;
    }

    @Override
    public void mostrarPrecio() {
        System.out.println("---Televisor---" + "\n Precio=" + precio);
    }
}
