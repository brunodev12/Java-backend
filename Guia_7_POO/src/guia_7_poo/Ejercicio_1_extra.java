/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_poo;

import guia_7_poo.newpackage.Cancion;

/**
 *
 * @author bruno
 */
public class Ejercicio_1_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cancion song = new Cancion("Crystal Ball", "Keane");
        
        System.out.println("El nombre de la cancion es: " + song.getTitulo());
        System.out.println("La canción es de la banda: " + song.getAutor());
    }   
}
