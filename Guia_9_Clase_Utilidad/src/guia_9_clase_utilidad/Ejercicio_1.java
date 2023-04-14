/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9_clase_utilidad;

import entidades.Cadena;
import java.util.Scanner;
import servicio.CadenaServicio;

/**
 *
 * @author bruno
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaServicio servicioFrase = new CadenaServicio();
        
        System.out.println("Ingrese una frase: ");
        Cadena nuevaFrase = new Cadena(leer.next());
        
        //servicioFrase.mostrarVocales(nuevaFrase);
//        servicioFrase.invertirFrase(nuevaFrase);
//        System.out.print("Ingrese un caracter: ");
//        servicioFrase.vecesRepetido(nuevaFrase, leer.next());
//        System.out.println("Ingrese una nueva frase");
//        System.out.println(servicioFrase.compararLongitud(nuevaFrase, leer.next()));
        
//        System.out.println("Ingrese una nueva frase");
//        servicioFrase.unirFrases(nuevaFrase, leer.next());

        System.out.println("Ingrese un caracter: ");
//        servicioFrase.reemplazar(nuevaFrase, leer.next());
        
        boolean valor = servicioFrase.contiene(nuevaFrase, leer.next());
        System.out.println("La frase contiene el caracter? " + valor);
    }
    
}
