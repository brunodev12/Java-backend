/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.ParDeNumeros;

/**
 *
 * @author bruno
 */
public class ParDeNumerosService {
    
    public void mostrarValores(ParDeNumeros _parNum){
        System.out.println("El numero 1 es: " + _parNum.getNum1());
        System.out.println("El numero 2 es: " + _parNum.getNum2());
    }
    
    public double devolverMayor(ParDeNumeros _parNum){
        double num1 = _parNum.getNum1();
        double num2 = _parNum.getNum2();
        if (num1>num2) {
            return num1;
        } else {
            return num2;
        }
    }
    
    public double calcularPotencia(ParDeNumeros _parNum){
        int num1 = (int) Math.round(_parNum.getNum1());
        int num2 = (int) Math.round(_parNum.getNum2());
        if (num1>num2){
            return Math.pow(num1, num2);
        } else {
            return Math.pow(num2, num1);
        }
    }
    
    public double calculaRaiz(ParDeNumeros _parNum){
        double num1 = Math.abs(_parNum.getNum1());
        double num2 = Math.abs(_parNum.getNum2());
        if (num1<num2){
            return Math.sqrt(num1);
        } else {
            return Math.sqrt(num2);
        }
    }
}
