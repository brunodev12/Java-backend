/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_poo.newpackage;

/**
 *
 * @author bruno
 */
public class Circunferencia {

    private double radio;

    public Circunferencia(double _radio) {
        this.radio = _radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double area() {
        double area = Math.pow(3.14 * radio, 2);
        return area;
    }

    public double perimetro() {
        double perimetro = 2 * 3.14 * radio;
        return perimetro;
    }

}
