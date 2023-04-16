/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.Arrays;

/**
 *
 * @author bruno
 */
public class ArregloService {
    
    public double[] inicializarA(double[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=Math.random()*10;
        }
        return arreglo;
    }
    
    public void mostrar(double[] arreglo){
        System.out.println("=======================================");
        for (double elemento : arreglo) {
            System.out.println(elemento);
        }
    }
    
    public double[] ordenar(double[] arreglo){
        Arrays.sort(arreglo);
        arreglo = this.descendente(arreglo);
        return arreglo;
    }
    
    private double[] descendente(double[] arreglo){
        int longitud = arreglo.length;
        double[] copiaArreglo = Arrays.copyOf(arreglo, longitud);
        for (int i = 0; i < longitud; i++) {
            arreglo[i] = copiaArreglo[longitud-1-i];
        }
        return arreglo;
    }
    
    public double[] inicializarB(double[] arregloA, double[] arregloB){
        for (int i = 0; i < 20; i++) {
            if (i<10) {
                arregloB[i]=arregloA[i];
            }else{
                arregloB[i]=0.5;
            }
        }
       return arregloB;
    }
}
