package guia_jpa_ejercicio_1;

import Servicios.AutorServicio;
import Servicios.EditorialServicio;
import Servicios.LibroServicio;
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

        int opc;

        do {
            System.out.println("------------- Bienvenido al menu ---------------");
            System.out.println("1. Ingresar al menu Autor ");
            System.out.println("2. Ingresar al menu Editorial ");
            System.out.println("3. Ingresar al menu Libro ");
            System.out.println("4. Salir");
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
                    System.out.println("Hasta luego...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (opc != 4);
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

}
