/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author bruno
 */
public class Asiento {
    private final char columna;
    private final int fila;
    private boolean libre;

    public Asiento(char columna, int fila) {
        this.columna = columna;
        this.fila = fila;
        this.libre = true;
    }

    public boolean isLibre() {
        return libre;
    }

    public char getColumna() {
        return columna;
    }

    public int getFila() {
        return fila;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    @Override
    public String toString() {
        if (libre) {
            return fila + " " + columna + "  ";
        } else {
            return fila + " " + columna + " X";
        }
    }
    
    
}
