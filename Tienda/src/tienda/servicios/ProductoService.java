package tienda.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.productoDAO;

/**
 *
 * @author bruno
 */
public class ProductoService {

    private final productoDAO dao;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ProductoService() {
        this.dao = new productoDAO();
    }

    public void mostrarProductosA() throws Exception {
        ArrayList<Producto> productos = dao.mostrarNombreProductos();
        for (Producto producto : productos) {
            System.out.println(producto.getNombre());
        }
    }

    public void mostrarProductosB() throws Exception {
        ArrayList<Producto> productos = dao.mostrarNombrePrecioProductos(null);
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " - $" + producto.getPrecio());
        }
    }

    public void mostrarProductosC() throws Exception {
        ArrayList<Producto> productos = dao.mostrarNombrePrecioProductos(" WHERE precio BETWEEN 120 AND 202");
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " - $" + producto.getPrecio());
        }
    }

    public void mostrarProductosD() throws Exception {
        ArrayList<Producto> productos = dao.mostrarNombrePrecioProductos(" WHERE nombre LIKE '%portatil%'");
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " - $" + producto.getPrecio());
        }
    }

    public void mostrarProductosE() throws Exception {
        ArrayList<Producto> productos = dao.mostrarNombrePrecioProductos(" ORDER BY precio asc limit 1");
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " - $" + producto.getPrecio());
        }
    }

    public void ingresarProducto() throws Exception {
        Producto producto = new Producto();
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = leer.next();
        System.out.println("Ingrese el precio del producto: ");
        double precio = leer.nextDouble();
        System.out.println("Ingrese el código de fabricante del producto: ");
        int codigoFabricante = leer.nextInt();
        producto.setNombre(nombre);
        producto.setPrecio(precio);
        producto.setCodigoFabricante(codigoFabricante);
        dao.guardarProducto(producto);
    }

    public void modificarProducto() throws Exception {
        System.out.println("Ingrese el codigo del producto a modificar: ");
        int codigo = leer.nextInt();
        System.out.println("Ingrese el nuevo nombre del producto: ");
        String nombre = leer.next();
        System.out.println("Ingrese el nuevo precio del producto: ");
        double precio = leer.nextDouble();
        System.out.println("Ingrese el nuevo código de fabricante del producto: ");
        int codigoFabricante = leer.nextInt();
        Producto producto = new Producto(codigo, codigoFabricante, nombre, precio);
        dao.modificarProducto(producto);
    }
}
