package guia_jpa_ejercicio_1;

import Servicios.AutorServicio;
import Servicios.ClienteServicio;
import Servicios.EditorialServicio;
import Servicios.LibroServicio;
import Servicios.PrestamoServicio;
import java.util.Scanner;

public class Guia_JPA_ejercicio_1 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        AutorServicio autorService = new AutorServicio();
        EditorialServicio editorialService = new EditorialServicio();
        LibroServicio libroService = new LibroServicio();
        ClienteServicio clienteService = new ClienteServicio();
        PrestamoServicio prestamoService = new PrestamoServicio();

        int opc;

        do {
            System.out.println("------------- Bienvenido al menu ---------------");
            System.out.println("1. Ingresar al menu Autor ");
            System.out.println("2. Ingresar al menu Editorial ");
            System.out.println("3. Ingresar al menu Libro ");
            System.out.println("4. Ingresar el menu Cliente");
            System.out.println("5. Ingresar al menu Prestamo");
            System.out.println("6. Salir");
            opc = leer.nextInt();
            
            switch(opc){
                case 1:
                    menuAutor(leer, autorService);
                    break;
                case 2:
                    menuEditorial(leer, editorialService);
                    break;
                case 3:
                    menuLibro(leer, libroService);
                    break;
                case 4:
                    menuCliente(leer, clienteService);
                    break;
                case 5:
                    menuPrestamo(leer, prestamoService);
                    break;
                case 6:
                    System.out.println("Hasta luego...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (opc != 6);
    }

    public static void menuAutor(Scanner leer, AutorServicio autorService) throws Exception {
        int opc;
        do {
            System.out.println("------------- Bienvenido al submenu Autor---------------");
            System.out.println("1. Crear autor");
            System.out.println("2. Buscar autor ");
            System.out.println("3. Mostrar autores");
            System.out.println("4. Buscar autores por nombre");
            System.out.println("5. Modificar autor");
            System.out.println("6. Eliminar autor");
            System.out.println("7. Salir");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    autorService.crearAutor();
                    break;
                case 2:
                    autorService.buscarAutor();
                    break;
                case 3:
                    autorService.buscarAutores();
                    break;
                case 4:
                    autorService.buscarAutorPorNombre();
                    break;
                case 5:
                    autorService.modificarAutor();
                    break;
                case 6:
                    autorService.eliminarAutor();
                    break;
                case 7:
                    System.out.println("Usted esta saliendo del submenu Autor");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (opc != 7);

    }

    public static void menuEditorial(Scanner leer, EditorialServicio editorialService) throws Exception {
        int opc;
        do {
            System.out.println("------------- Bienvenido al submenu Editorial---------------");
            System.out.println("1. Crear editorial");
            System.out.println("2. Buscar editorial ");
            System.out.println("3. Mostrar editoriales");
            System.out.println("4. Modificar editoriales");
            System.out.println("5. Eliminar editoriales");
            System.out.println("6. Salir");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    editorialService.crearEditorial();
                    break;
                case 2:
                    editorialService.buscarEditorial();
                    break;
                case 3:
                    editorialService.buscarEditoriales();
                    break;
                case 4:
                    editorialService.modificarEditorial();
                    break;
                case 5:
                    editorialService.eliminarEditorial();
                    break;
                case 6:
                    System.out.println("Usted esta saliendo del submenu Editorial");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (opc != 6);

    }

    public static void menuLibro(Scanner leer, LibroServicio libroService) throws Exception {
        int opc;
        do {
            System.out.println("------------- Bienvenido al submenu Libro---------------");
            System.out.println("1. Crear libro");
            System.out.println("2. Buscar libro por ISBN");
            System.out.println("3. Buscar libro por titulo");
            System.out.println("4. Buscar libro por nombre de autor");
            System.out.println("5. Buscar libro por nombre de editorial");
            System.out.println("6. Mostrar libros");
            System.out.println("7. Modificar libro");
            System.out.println("8. Eliminar libro");
            System.out.println("9. Salir");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    libroService.crearLibro();
                    break;
                case 2:
                    libroService.buscarLibro();
                    break;
                case 3:
                    libroService.buscarLibroPorTitulo();
                    break;
                case 4:
                    libroService.buscarLibroPorNombreAutor();
                    break;
                case 5:
                    libroService.buscarLibroPorNombreEditorial();
                    break;
                case 6:
                    libroService.buscarLibros();
                    break;
                case 7:
                    libroService.modificarLibro();
                    break;
                case 8:
                    libroService.eliminarLibro();
                    break;
                case 9:
                    System.out.println("Usted esta saliendo del submenu Libro");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opc != 9);
    }
    
    public static void menuCliente(Scanner leer, ClienteServicio clienteService) throws Exception {
        int opc;
        do {
            System.out.println("------------- Bienvenido al submenu Cliente ---------------");
            System.out.println("1. Crear cliente");
            System.out.println("2. Buscar cliente ");
            System.out.println("3. Mostrar clientes");
            System.out.println("4. Modificar cliente");
            System.out.println("5. Eliminar cliente");
            System.out.println("6. Salir");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    clienteService.crearCliente();
                    break;
                case 2:
                    clienteService.mostrarCliente();
                    break;
                case 3:
                    clienteService.mostrarClientes();
                    break;
                case 4:
                    clienteService.modificarCliente();
                    break;
                case 5:
                    clienteService.eliminarCliente();
                    break;
                case 6:
                    System.out.println("Usted esta saliendo del submenu Cliente");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opc != 6);
    }
    
    public static void menuPrestamo(Scanner leer, PrestamoServicio prestamoService) throws Exception {
        int opc;
        do {
            System.out.println("------------- Bienvenido al submenu Prestamo ---------------");
            System.out.println("1. Crear prestamo");
            System.out.println("2. Buscar prestamo ");
            System.out.println("3. Mostrar prestamos");
            System.out.println("4. Mostrar prestamos de un cliente");
            System.out.println("5. Devolver libro");
            System.out.println("6. Modificar prestamo");
            System.out.println("7. Eliminar prestamo");
            System.out.println("8. Salir");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    prestamoService.crearPrestamo();
                    break;
                case 2:
                    prestamoService.mostrarPrestamo();
                    break;
                case 3:
                    prestamoService.mostrarPrestamos();
                    break;
                case 4:
                    prestamoService.mostrarPrestamoPorCliente();
                    break;
                case 5:
                    prestamoService.devolverLibro();
                    break;
                case 6:
                    prestamoService.modificarPrestamo();
                    break;
                case 7:
                    prestamoService.eliminarPrestamo();
                    break;
                case 8:
                    System.out.println("Usted esta saliendo del submenu Prestamo");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opc != 8);
    }

}
