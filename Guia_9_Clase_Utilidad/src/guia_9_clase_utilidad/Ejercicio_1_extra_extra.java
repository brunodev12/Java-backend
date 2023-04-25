/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9_clase_utilidad;

import entidades.Producto;
import java.util.ArrayList;
import servicio.ServicioProducto;

/**
 *
 * @author bruno
 */
public class Ejercicio_1_extra_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Producto> productos = new ArrayList<Producto>();
        
        ServicioProducto productoService = new ServicioProducto();
        
        productoService.crearProducto(productos);
        productoService.eliminarProducto(productos);
        productoService.buscarProducto(productos);
        
    }
    
}
