package Servicios;

import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import Persistencia.AutorJpaController;
import Persistencia.EditorialJpaController;
import Persistencia.LibroJpaController;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.Scanner;

public class LibroServicio {

    LibroJpaController libroDao = new LibroJpaController();

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearLibro() throws Exception {

        System.out.print("Ingrese el titulo del libro: ");
        String titulo = leer.next();
        System.out.print("Ingrese el anio del libro: ");
        Integer anio = leer.nextInt();
        System.out.print("Ingrese la cantidad de ejemplares del libro: ");
        Integer ejemplares = leer.nextInt();
        System.out.print("Ingrese la cantidad de ejemplares prestados del libro: ");
        Integer ejemplaresPrestados = leer.nextInt();
        System.out.println("Seleccione el autor del libro");
        Autor autor = seleccionarAutor();
        if (autor == null) {
            throw new Exception("Autor no encontrado");
        }
        System.out.println("Seleccione la editorial del libro");
        Editorial editorial = seleccionarEditorial();
        if (editorial == null) {
            throw new Exception("Editorial no encontrada");
        }

        Libro libro = null;
        Libro libro2;
        
        do {
            libro = new Libro(titulo, anio, ejemplares, ejemplaresPrestados, autor, editorial);
            libro2 = buscarLibro(libro.getIsbn());
            
        } while (libro2 != null);
        
        libroDao.create(libro);
    }

    private Autor seleccionarAutor() {
        AutorJpaController autorDao = new AutorJpaController();
        List<Autor> autores = autorDao.findAutorEntities();

        for (Autor item : autores) {
            System.out.println(item);
        }

        System.out.println("Ingrese el ID del autor para seleccionar: ");
        Integer id = leer.nextInt();
        Autor autor = autorDao.findAutor(id);

        return autor;
    }

    private Autor seleccionarAutorPorNombre() {
        AutorJpaController autorDao = new AutorJpaController();

        System.out.println("Ingrese el nombre del autor a buscar");
        String nombre = leer.next();
        List<Autor> autores = autorDao.findAutorByName(nombre);
//        Autor autor;
//
//        if (autores.size() > 1) {
//            for (Autor item : autores) {
//                System.out.println(item);
//            }
//
//            System.out.println("Ingrese el ID del autor: ");
//            Integer id = leer.nextInt();
//            autor = autorDao.findAutor(id);
//
//        } else {
//            return autores.get(0);
//        }

        return autores.get(0);
    }

    private Editorial seleccionarEditorialPorNombre() {
        EditorialJpaController editorialDao = new EditorialJpaController();

        System.out.println("Ingrese el nombre de la editorial a buscar");
        String nombre = leer.next();
        List<Editorial> editoriales = editorialDao.findEditorialByName(nombre);

        return editoriales.get(0);
    }

    private Editorial seleccionarEditorial() {
        EditorialJpaController editorialDao = new EditorialJpaController();

        List<Editorial> editoriales = editorialDao.findEditorialEntities();

        for (Editorial item : editoriales) {
            System.out.println(item);
        }

        System.out.println("Ingrese el ID de la editorial para seleccionar: ");
        Integer id = leer.nextInt();
        Editorial editorial = editorialDao.findEditorial(id);

        return editorial;
    }

    public void buscarLibro() {
        System.out.println("Ingrese el isbn del libro: ");
        long isbn = leer.nextLong();

        Libro libro = libroDao.findLibro(isbn);
        
        if (libro != null) {
            System.out.println(libro);
        } else {
            System.out.println("No existe ese libro");
        }
        
    }

    private Libro buscarLibro(long isbn) {
//        System.out.println("Buscando libro...");
        Libro libro = libroDao.findLibro(isbn);
        return libro;
    }

    public void buscarLibroPorTitulo() {
        System.out.println("Ingrese el titulo del libro a buscar");
        String nombre = leer.next();
        List<Libro> libros = libroDao.findLibroByName(nombre);

        for (Libro libro : libros) {
            System.out.println(libro);
        }
        if (libros.isEmpty()) {
            System.out.println("No se han encontrado libros con ese titulo");
        }
    }

    public void buscarLibroPorNombreAutor() {
        String nombre = null;
        try {
            nombre = seleccionarAutorPorNombre().getNombre();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No se ha encontrado autores con ese nombre");

        }

        List<Libro> libros = libroDao.findLibroByAutorName(nombre);

        for (Libro libro : libros) {
            System.out.println(libro);
        }
        if (libros.isEmpty()) {
            System.out.println("No se ha encontrado libros con ese titulo");
        }
    }

    public void buscarLibroPorNombreEditorial() {
        String nombre = null;
        try {
            nombre = seleccionarEditorialPorNombre().getNombre();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No se ha encontrado editoriales con ese nombre");

        }

        List<Libro> libros = libroDao.findLibroByEditorialName(nombre);

        for (Libro libro : libros) {
            System.out.println(libro);
        }
        if (libros.isEmpty()) {
            System.out.println("No se ha encontrado libros con ese titulo");
        }
    }

    public void buscarLibros() {

        List<Libro> libros = libroDao.findLibroEntities();

        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public void modificarLibro() throws Exception {
        System.out.println("Ingrese el isbn del libro a modificar: ");
        long id = leer.nextLong();

        Libro libro = libroDao.findLibro(id);

        if (libro != null) {
            System.out.println(libro);
            System.out.println("Ingrese el nuevo titulo del libro");
            libro.setTitulo(leer.next());
            System.out.println("Ingrese el nuevo anio del libro: ");
            libro.setAnio(leer.nextInt());
            System.out.println("Ingrese la nueva cantidad de ejemplares del libro: ");
            libro.setEjemplares(leer.nextInt());
            System.out.println("Ingrese la nueva cantidad de ejemplares prestados del libro: ");
            libro.setEjemplaresPrestados(leer.nextInt());
            libro.setEjemplaresRestantes();
            System.out.println("Se ha dado de alta? ");
            String alta = leer.next();
            libro.setAlta(alta.equalsIgnoreCase("si"));
            System.out.println("Seleccione el nuevo autor del libro");
            Autor autor = seleccionarAutor();
            if (autor == null) {
                throw new Exception("Autor no encontrado");
            }
            libro.setAutor(autor);
            System.out.println("Seleccione la nueva editorial del libro");
            Editorial editorial = seleccionarEditorial();
            if (editorial == null) {
                throw new Exception("Editorial no encontrada");
            }
            libro.setEditorial(editorial);
            libroDao.edit(libro);
        } else {
            throw new Exception("No existe ese libro");
        }
    }

    public void eliminarLibro() throws NonexistentEntityException {
        System.out.println("Ingrese el isbn del libro a eliminar: ");
        long id = leer.nextLong();

        libroDao.destroy(id);
    }
}
