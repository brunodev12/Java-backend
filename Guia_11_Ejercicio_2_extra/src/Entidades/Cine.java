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
public class Cine {

    private Pelicula pelicula;
    private int espectadores;                  //tamaño sala 48
    private int capacidad;
    private ArrayList<Asiento> asientos;
    private int precioEntrada;

    public Cine(Pelicula pelicula, int precioEntrada) {
        this.capacidad = 48;
        asientos = new ArrayList();
        this.pelicula = pelicula;
        this.espectadores = 0;
        this.precioEntrada = precioEntrada;
        char nombre = 'a';   // Para las columnas
        for (int i = 8; i > 0; i--) {
            for (int j = 0; j < 6; j++) {
                switch (j) {
                    case 0:
                        nombre = 'A';
                        break;
                    case 1:
                        nombre = 'B';
                        break;
                    case 2:
                        nombre = 'C';
                        break;
                    case 3:
                        nombre = 'D';
                        break;
                    case 4:
                        nombre = 'E';
                        break;
                    case 5:
                        nombre = 'F';
                        break;
                }
                asientos.add(new Asiento(nombre, i));
            }
        }

    }

    public void mostrarAsientos() {
        int aux = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(asientos.get(aux) + " | ");
                aux++;
            }
            System.out.println("");
        }
    }

    public boolean setAsiento(int _fila, char _columna) {
        for (Asiento asiento : asientos) {
            int fila = asiento.getFila();
            char columna = asiento.getColumna();
            boolean disponible = asiento.isLibre();
            if (fila == _fila && columna == _columna) {
                if (disponible) {
                    asiento.setLibre(false);
                    espectadores++;
                    return true;
                }
            }
        }
        return false;
    }

    public int getEspectadores() {
        return espectadores;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public int getCapacidad() {
        return capacidad;
    }

}
