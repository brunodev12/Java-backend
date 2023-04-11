/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_clase_servicio;

import guia_8_clase_servicio.entidades.NIF;
import guia_8_clase_servicio.servicio.NIFService;

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
        
        NIFService nifService = new NIFService();
        
        NIF nif = nifService.crearNif();
        
        nifService.mostrar(nif);
    }
    
}
