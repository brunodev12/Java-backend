/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_11_ejercicio_1;

import entidades.Perro;
import entidades.Persona;

/**
 *
 * @author bruno
 */
public class Guia_11_Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Perro dog1 = new Perro("Neron","Pitbull",3,"Grande");
        Perro dog2 = new Perro("Ocho","Pichichu",4,"Mediano");
        Persona p1 = new Persona("Jorge","Monasterio",34,19000,dog1);
        Persona p2 = new Persona("Manolo","Castillo",45,25000,dog2);
        
        System.out.println(p1);
        System.out.println(p2);
    }
    
}
