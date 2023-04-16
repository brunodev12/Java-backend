/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9_clase_utilidad;

import entidades.ParDeNumeros;
import servicio.ParDeNumerosService;

/**
 *
 * @author bruno
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ParDeNumeros parNum = new ParDeNumeros();
        ParDeNumerosService numService = new ParDeNumerosService();
        
        numService.mostrarValores(parNum);
        System.out.println("El número mayor es: " + numService.devolverMayor(parNum));
        System.out.println("La potencia del número mayor elevada al número menor es: " + numService.calcularPotencia(parNum));
        System.out.println("La raiz cuadrada del número menor es: " + numService.calculaRaiz(parNum));
        
        
    }
    
}
