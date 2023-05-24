/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_12_ejercicio_1;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author bruno
 */
public class Guia_12_ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        Animal perro1 = new Perro("CarloMagno", "Carne", 15, "Doberman");
        perro1.Alimentarse();
        
        Perro perro3 = new Perro("Pancho", "carne", 7, "Salchicha");
        perro3.algo();
        
        Animal perro2 = new Perro("Teddy", "Croqueta", 10, "Chihuahua");
        perro2.Alimentarse();
        
        Animal gato1 = new Gato("Pelusa", "Galletas", 7, "Siames");
        gato1.Alimentarse();
        
        Animal caballo1 = new Caballo("Spark", "Pasto", 20, "Fino");
        caballo1.Alimentarse();
        
        System.out.println(perro3);
        
    }
    
}
