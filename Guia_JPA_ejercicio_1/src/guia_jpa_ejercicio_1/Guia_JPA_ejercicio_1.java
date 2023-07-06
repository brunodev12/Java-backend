package guia_jpa_ejercicio_1;

import Servicios.AutorServicio;
import Servicios.EditorialServicio;
import Servicios.LibroServicio;

public class Guia_JPA_ejercicio_1 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

//        AutorServicio autorService = new AutorServicio();
//        EditorialServicio editorialService = new EditorialServicio();
        LibroServicio libroService = new LibroServicio();
//        
//        libroService.crearLibro();
//        libroService.buscarLibros();
        
//        libroService.buscarLibroPorTitulo();
        libroService.buscarLibroPorNombreAutor();
//        libroService.eliminarLibro();
//        libroService.buscarLibros();
        
//        editorialService.crearEditorial();
//        
//        editorialService.buscarEditoriales();
//        autorService.crearAutor();
//        autorService.buscarUltimoAutor();
//        autorService.buscarAutores();
//        autorService.eliminarAutor();
//        
//        autorService.buscarAutores();
//        autorService.buscarAutorPorNombre();
    }

}