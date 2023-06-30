package tienda.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

/**
 *
 * @author bruno
 */
public class FabricanteService {

    private final FabricanteDAO dao;
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public FabricanteService() {
        this.dao = new FabricanteDAO();
    }

    public void mostrarFabricantes() throws Exception {
        ArrayList<Fabricante> fabricantes = dao.mostrarFabricantes();
        for (Fabricante fabricante : fabricantes) {
            System.out.println(fabricante.getNombre() + " " + fabricante.getNacionalidad());
        }
    }

    public void ingresarFabricante() throws Exception {
        Fabricante fabricante = new Fabricante();
        System.out.println("Ingrese el nombre del fabricante: ");
        String nombre = leer.next();
        System.out.println("Ingrese la nacionalidad del fabricante: ");
        String nacionalidad = leer.next();
        fabricante.setNombre(nombre);
        fabricante.setNacionalidad(nacionalidad);
        dao.guardarFabricante(fabricante);
    }
}
