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
public class Electrodomestico {

    protected int precio;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(char letra) {
        char[] caracteres = {'A', 'B', 'C', 'D', 'E', 'F'};
        boolean check = false;
        for (char caracter : caracteres) {
            if (caracter == letra) {
                consumoEnergetico = letra;
                check = true;
                break;
            }
        }

        if (!check) {
            consumoEnergetico = 'F';
        }
    }

    private void comprobarColor(String color) {
        String[] colores = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};
        boolean check = false;
        for (String aux : colores) {
            if (color.equalsIgnoreCase(aux)) {
                this.color = aux;
                check = true;
                break;
            }
        }

        if (!check) {
            this.color = "Blanco";
        }
    }

    public void precioFinal() {
        int precio1 = 0;
        int precio2 = 0;
        switch (consumoEnergetico) {
            case 'A':
                precio1 = 1000;
                break;
            case 'B':
                precio1 = 800;
                break;
            case 'C':
                precio1 = 600;
                break;
            case 'D':
                precio1 = 500;
                break;
            case 'E':
                precio1 = 300;
                break;
            case 'F':
                precio1 = 100;
                break;
        }
        if (peso >= 1 && peso <= 19) {
            precio2 = 100;
        } else if (peso >= 20 && peso <= 49) {
            precio2 = 500;
        } else if (peso >= 50 && peso <= 79) {
            precio2 = 800;
        } else if (peso >= 80) {
            precio2 = 1000;
        }

        precio = 1000 + precio1 + precio2;
    }

    public void crearElectrodomestico() {
        final Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese un color: ");
        String _color = leer.next();
        System.out.print("Ingrese la eficiencia (A-F): ");
        char eficiencia = leer.next().toUpperCase().charAt(0);
        System.out.print("Ingrese el peso (kg): ");
        int _peso = leer.nextInt();
        this.peso = _peso;
        comprobarColor(_color);
        comprobarConsumoEnergetico(eficiencia);
        precioFinal();
    }

    @Override
    public String toString() {
        return "---Electrodomestico---" + "\nPrecio=" + precio + "\nColor=" + color + "\nConsumo energetico=" + consumoEnergetico + "\nPeso=" + peso;
    }

    public void mostrarPrecio() {
        System.out.println("---Electrodomestico---" + "\n Precio=" + precio);
    }
}
