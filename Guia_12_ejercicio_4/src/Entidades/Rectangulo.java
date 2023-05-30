/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Interface.calculosFormas;

/**
 *
 * @author bruno
 */
public class Rectangulo extends FormaGeometrica implements calculosFormas{
    private final int base;
    private final int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    

    @Override
    public void calcularArea() {
        area = base * altura;
    }

    @Override
    public void calcularPerimetro() {
        perimetro = (base + altura) * 2;
    }
}
