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
public class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, int precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese la carga (kg): ");
        int _carga = leer.nextInt();
        this.carga = _carga;
        super.crearElectrodomestico();
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        
        if (carga>30) {
            precio+=500;
        }
    }    

    @Override
    public String toString() {
        return "---Lavadora---" + "\nPrecio=" + precio + "\nColor=" + color + "\nConsumo energetico=" + consumoEnergetico + "\nPeso=" + peso + "\nCarga=" + carga;
    }
    
}
