package Servicios;

import Entidades.Autor;
import Persistencia.AutorJpaController;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class AutorServicio {

    AutorJpaController autorDao = new AutorJpaController();

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearAutor() {

        System.out.println("Ingrese el nombre del autor: ");
        String nombre = leer.next();
        Autor autor = new Autor(1, nombre, false);
        autorDao.create(autor);

    }

    private Autor buscarAutor(Integer id) {

        Autor autor = autorDao.findAutor(id);

        return autor;
    }

    public Autor buscarAutor() {
        System.out.println("Ingrese el codigo del autor: ");
        Integer id = leer.nextInt();

        Autor autor = autorDao.findAutor(id);
        return autor;
    }

    public void buscarAutores() {

        List<Autor> autores = autorDao.findAutorEntities();

        for (Autor autor : autores) {
            System.out.println(autor);
        }
    }
    
    public void buscarAutorPorNombre(){
        System.out.println("Ingrese el nombre del autor a buscar");
        String nombre = leer.next();
        List<Autor> autores = autorDao.findAutorByName(nombre);
        
        for (Autor autor : autores) {
            System.out.println(autor);
        }
    }

    public Autor buscarUltimoAutor() {
        Autor autor = autorDao.findLastAutor();

        return autor;
    }

    public void modificarAutor() throws Exception {
        System.out.println("Ingrese el codigo del autor a modificar: ");
        Integer id = leer.nextInt();

        Autor autor = buscarAutor(id);

        if (autor != null) {
            System.out.println(autor);
            System.out.println("Ingrese el nuevo nombre del autor");
            autor.setNombre(leer.next());
            System.out.println("Se ha dado de alta? ");
            String alta = leer.next();
            autor.setAlta(alta.equalsIgnoreCase("si"));
            autorDao.edit(autor);
        } else {
            throw new Exception("No existe ese autor");
//            System.out.println("No existe ese autor");
        }
    }

    public void eliminarAutor() throws NonexistentEntityException {
        System.out.println("Ingrese el codigo del autor a eliminar: ");
        Integer id = leer.nextInt();

        autorDao.destroy(id);
    }

}
