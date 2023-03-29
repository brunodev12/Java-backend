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
public class Operacion {

    private double numero1;
    private double numero2;

    public Operacion() {
    }

    public Operacion(double _numero1, double _numero2) {
        this.numero1 = _numero1;
        this.numero2 = _numero2;
    }

    public void setNumero1(double _numero1) {
        this.numero1 = _numero1;
    }

    public void setNumero2(double _numero2) {
        this.numero2 = _numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public double sumar() {
        double suma = this.numero1 + this.numero2;
        return suma;
    }

    public double restar() {
        double resta = this.numero1 - this.numero2;
        return resta;
    }

    public double multiplicar() {
        double multiplicacion = 0;
        if (this.numero1 != 0 && this.numero2 != 0) {
            multiplicacion = this.numero1 * this.numero2;
        }
        return multiplicacion;
    }

    public double division() {
        double resultado = 0;
        if (this.numero2 != 0) {
            resultado = this.numero1 / this.numero2;
        }
        return resultado;
    }
}
