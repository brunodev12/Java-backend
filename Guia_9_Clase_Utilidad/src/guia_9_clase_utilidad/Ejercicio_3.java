/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9_clase_utilidad;

import servicio.ArregloService;

/**
 *
 * @author bruno
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double arregloA[] = new double[50];
        double arregloB[] = new double[20];

        ArregloService arregloServicio = new ArregloService();
        
        arregloServicio.inicializarA(arregloA);
        arregloServicio.mostrar(arregloA);
        arregloServicio.inicializarA(arregloB);
        arregloServicio.mostrar(arregloB); 
        arregloServicio.ordenar(arregloB);
        arregloServicio.mostrar(arregloB);
        arregloServicio.inicializarB(arregloA,arregloB);
        arregloServicio.mostrar(arregloB);
        
    }

}
