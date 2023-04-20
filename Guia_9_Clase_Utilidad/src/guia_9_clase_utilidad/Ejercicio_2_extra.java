/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9_clase_utilidad;

import servicio.AhorcadoService;

/**
 *
 * @author bruno
 */
public class Ejercicio_2_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        AhorcadoService ahorcadoServicio = new AhorcadoService();
        
        if (ahorcadoServicio.juego()) {
            System.out.println("Muy bien ha adividano la palabra");
        } else {
            System.out.println("Segui participando rey");
        }

    }

}
