package tienda.persistencia;

import java.util.ArrayList;
import tienda.entidades.Producto;

/**
 *
 * @author bruno
 */
public class productoDAO extends DAO {

    public ArrayList<Producto> mostrarNombreProductos() throws Exception {
        try {
            String sql = "SELECT nombre FROM producto";
            consultarBase(sql);
            Producto producto;
            ArrayList<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public ArrayList<Producto> mostrarNombrePrecioProductos(String arg) throws Exception {
        try {
            String sql;
            if (arg == null) {
                sql = "SELECT nombre, precio FROM producto";
            } else {
                sql = "SELECT nombre, precio FROM producto" + arg;
            }
            consultarBase(sql);
            Producto producto;
            ArrayList<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto");
            }
            String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante) "
                    + "VALUES ( '" + producto.getNombre() + "' , '" + producto.getPrecio() + "' ," + producto.getCodigoFabricante() + " );";

            System.out.println(sql);
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto que desea modificar");
            }
            String sql = "UPDATE Producto SET "
                    + " nombre = '" + producto.getNombre()+ "' , precio = '" + producto.getPrecio()+ "' , codigo_fabricante = " + producto.getCodigoFabricante()
                    + " WHERE codigo = '" + producto.getCodigo()+ "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

}
