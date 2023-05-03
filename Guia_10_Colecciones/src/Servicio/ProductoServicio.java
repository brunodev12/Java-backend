/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class ProductoServicio {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final HashMap<String, Double> productos = new HashMap();

    public void agregarProducto() {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = leer.next().toLowerCase();
        nombre = nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length());
        System.out.print("Ingrese el precio del producto: $");
        double precio = leer.nextDouble();
        productos.put(nombre, precio);
    }

    public void modificarPrecio() {
        System.out.println("Ingrese el nombre del producto del cual desea cambiar el precio: ");
        String nombre = leer.next().toLowerCase();
        nombre = nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length());
        if (productos.containsKey(nombre)) {
            System.out.println("Ingrese el nuevo precio");
            double precio = leer.nextDouble();
            productos.replace(nombre, precio);
        } else {
            System.out.println("Producto no encontrado");
        }
    }

    public void eliminarProducto() {
        System.out.println("Ingrese el nombre del producto que desea eliminar: ");
        String nombre = leer.next().toLowerCase();
        nombre = nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length());

        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Se ha eliminado el producto " + nombre);
        } else {
            System.out.println("Producto no encontrado");
        }

    }

    public void mostrarProductos() {
//        for (Map.Entry<String, Double> producto : productos.entrySet()) {
//            System.out.println("==============================");
//            System.out.println("Producto: " + producto.getKey() + "\n Precio: $" + producto.getValue());
//        }

        productos.entrySet().stream().map((producto) -> {
            System.out.println("==============================");
            return producto;
        }).forEachOrdered((producto) -> {
            System.out.println("Producto: " + producto.getKey() + "\n Precio: $" + producto.getValue());
        });
    }

}
