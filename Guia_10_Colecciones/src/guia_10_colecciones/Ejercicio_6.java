/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10_colecciones;

import Servicio.ProductoServicio;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ProductoServicio productoService = new ProductoServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion;
        
        do {
            System.out.println("============ Menú ============");
            System.out.println("Que desea hacer? ");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar todos los productos");
            System.out.println("5. Salir");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    productoService.agregarProducto();
                    break;
                case 2:
                    productoService.modificarPrecio();
                    break;
                case 3:
                    productoService.eliminarProducto();
                    break;
                case 4:
                    productoService.mostrarProductos();
                    break;
                case 5:
                    System.out.println("Hasta luego...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            
        } while (opcion!=5);
        
    }
    
}
