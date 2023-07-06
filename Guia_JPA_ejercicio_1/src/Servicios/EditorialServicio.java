package Servicios;

import Entidades.Editorial;
import Persistencia.EditorialJpaController;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.Scanner;

public class EditorialServicio {

    EditorialJpaController editorialDao = new EditorialJpaController();

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearEditorial() {

        System.out.println("Ingrese el nombre de la editorial: ");
        String nombre = leer.next();
        Editorial editorial = new Editorial(1, nombre, false);
        editorialDao.create(editorial);

    }

    public Editorial buscarEditorial() {
        System.out.println("Ingrese el codigo de la editorial: ");
        Integer id = leer.nextInt();

        Editorial editorial = editorialDao.findEditorial(id);
        return editorial;
    }

    public void buscarEditoriales() {

        List<Editorial> editoriales = editorialDao.findEditorialEntities();

        for (Editorial editorial : editoriales) {
            System.out.println(editorial);
        }
    }

    public void modificarEditorial() throws Exception {
        System.out.println("Ingrese el codigo de la editorial a modificar: ");
        Integer id = leer.nextInt();

        Editorial editorial = editorialDao.findEditorial(id);

        if (editorial != null) {
            System.out.println(editorial);
            System.out.println("Ingrese el nuevo nombre de la editorial");
            editorial.setNombre(leer.next());
            System.out.println("Se ha dado de alta? ");
            String alta = leer.next();
            editorial.setAlta(alta.equalsIgnoreCase("si"));
            editorialDao.edit(editorial);
        } else {
            throw new Exception("No existe esa editorial");
        }
    }
    
    public void eliminarEditorial() throws NonexistentEntityException {
        System.out.println("Ingrese el codigo de la editorial a eliminar: ");
        Integer id = leer.nextInt();

        editorialDao.destroy(id);
    }
}
