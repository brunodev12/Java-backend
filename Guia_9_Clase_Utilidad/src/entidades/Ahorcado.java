/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author bruno
 */
public class Ahorcado {

    private final String[] palabra;
    private final String[] nuevaPalabra;
    private int cantidadLetrasEncontradas;
    private final int cantidadJugadas;

    public Ahorcado(String palabra, int cantidadJugadas) {
        int _cantidadLetras = palabra.length();
        this.palabra = new String[_cantidadLetras];
        this.nuevaPalabra = new String[_cantidadLetras];

        for (int i = 0; i < _cantidadLetras; i++) {
            String letra = palabra.substring(i, i + 1);
            this.palabra[i] = letra;
            this.nuevaPalabra[i] = "_";
        }

        this.cantidadLetrasEncontradas = 0;
        this.cantidadJugadas = cantidadJugadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setCantidadLetrasEncontradas(int cantidadLetrasEncontradas) {
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
    }

    public int getCantidadLetrasEncontradas() {
        return cantidadLetrasEncontradas;
    }

    public int getCantidadJugadas() {
        return cantidadJugadas;
    }

    public void setNuevaLetra(String _letra, int posicion) {
        this.nuevaPalabra[posicion] = _letra;
    }

    public String[] getNuevaPalabra() {
        return nuevaPalabra;
    }

    public void mostrarPalabra() {
        for (String elemento : this.palabra) {
            System.out.print(elemento);
        }
    }

    public void mostrarNuevaPalabra() {
        System.out.println("");
        for (String elemento : this.nuevaPalabra) {
            System.out.print(elemento);
        }
        System.out.println("");
    }
}
