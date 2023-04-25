/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Producto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class ServicioProducto {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Producto> crearProducto(ArrayList<Producto> productoArray) {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = leer.next();
        System.out.print("Ingrese una descripción para el producto: ");
        String descripcion = leer.next();
        System.out.print("Ingrese el precio del producto: ");
        float precio = leer.nextFloat();
        Producto producto = new Producto(nombre, descripcion, precio);
        productoArray.add(producto);
        return productoArray;
    }

    public ArrayList<Producto> eliminarProducto(ArrayList<Producto> productoArray) {
        System.out.print("Ingrese el nombre del objeto a eliminar: ");
        String nombre = leer.next();
        for (int i = 0; i < productoArray.size(); i++) {
            Producto producto = productoArray.get(i);
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                productoArray.remove(i);
                System.out.println("El producto " + nombre + " se ha eliminado");
            } else {
                System.out.println("No se ha encontrado el producto " + nombre);
            }
        }
        return productoArray;
    }
    
    public void buscarProducto(ArrayList<Producto> productoArray){
        System.out.print("Ingrese el nombre del objeto a buscar: ");
        String nombre = leer.next();
        productoArray.forEach((producto) -> {
            String nombreProducto = producto.getNombre();
            if (nombreProducto.equalsIgnoreCase(nombre)) {
                System.out.println("Nombre: " + nombreProducto);
                System.out.println("Descripcion: " + producto.getDescripcion());
                System.out.println("Precio: $" + producto.getPrecio());
            }
        });
        
    }

}
