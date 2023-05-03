/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10_colecciones;

import Servicio.PaisServicio;

/**
 *
 * @author bruno
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PaisServicio paisService = new PaisServicio();
        
        paisService.agregarPais();
        paisService.mostrarPaisesOrdenados();
        paisService.buscarPais();
        paisService.buscarPais();
        
    }
    
}
