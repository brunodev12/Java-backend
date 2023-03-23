/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_poo;

import guia_7_poo.newpackage.Libro;

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
        
        Libro harryTopper = new Libro(232, "La orden de las zapas", "Topper", 320);
        
        harryTopper.setAutor("Adidas");
        
        System.out.println(harryTopper.getAutor() + " " + harryTopper.getTitulo());
        
        System.out.println(harryTopper);
    }
    
}
