/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_poo;

import guia_7_poo.newpackage.Cocina;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Ejercicio_4_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese la cantidad de recetas ha ingresar: ");
        int n = leer.nextInt();
        
        Cocina cocina = new Cocina(n);
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la receta " + (i+1));
            cocina.setRecetas(leer.next(), i);
        }
        
        //cocina.getRecetas();
        cocina.setIngredientes();
        cocina.buscarReceta("asado");
        cocina.buscarIngredientes("papas", "cebollas", "pollo");
    }
    
}
