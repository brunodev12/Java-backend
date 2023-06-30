package tienda;

import java.util.Scanner;
import tienda.servicios.FabricanteService;
import tienda.servicios.ProductoService;

/**
 *
 * @author bruno
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ProductoService ps = new ProductoService();
        FabricanteService fs = new FabricanteService();
        int opc;
        do {
            System.out.println("======================================");
            System.out.println("Indica la accion que queres realizar:");
            System.out.println("1. Listar el nombre de todos los productos que hay en la tabla producto.");
            System.out.println("2. Listar los nombres y los precios de todos los productos de la tabla producto.");
            System.out.println("3. Listar aquellos productos que su precio esté entre 120 y 202.");
            System.out.println("4. Buscar y listar todos los Portátiles de la tabla producto.");
            System.out.println("5. Listar el nombre y el precio del producto más barato.");
            System.out.println("6. Ingresar un producto a la base de datos.");
            System.out.println("7. Ingresar un fabricante a la base de datos.");
            System.out.println("8. Editar un producto con datos a elección.");
            System.out.println("9. Salir.");
            System.out.println("======================================");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    ps.mostrarProductosA();
                    break;
                case 2:
                    ps.mostrarProductosB();
                    break;
                case 3:
                    ps.mostrarProductosC();
                    break;
                case 4:
                    ps.mostrarProductosD();
                    break;
                case 5:
                    ps.mostrarProductosE();
                    break;
                case 6:
                    ps.ingresarProducto();
                    break;
                case 7:
                    fs.ingresarFabricante();
                    break;
                case 8:
                    ps.modificarProducto();
                    break;
                default:
                    System.out.println("Muchas gracias, nos vemos prontos");
                    opc = 9;
            }
        } while (opc != 9);
    }
}
