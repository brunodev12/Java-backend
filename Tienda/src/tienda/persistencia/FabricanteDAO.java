package tienda.persistencia;

import java.util.ArrayList;
import tienda.entidades.Fabricante;

/**
 *
 * @author bruno
 */
public class FabricanteDAO extends DAO {

    public ArrayList<Fabricante> mostrarFabricantes() throws Exception {
        try {
            String sql = "SELECT * FROM fabricante";
            consultarBase(sql);
            Fabricante fabricante;
            ArrayList<Fabricante> fabricantes = new ArrayList();
            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setNombre(resultado.getString(2));
                fabricante.setNacionalidad(resultado.getString(3));
                fabricantes.add(fabricante);
            }
            desconectarBase();
            return fabricantes;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void guardarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar el fabricante");
            }
            String sql = "INSERT INTO fabricante (nombre, nacionalidad) "
                    + "VALUES ( '" + fabricante.getNombre() + "' , '" + fabricante.getNacionalidad() + "');";

            System.out.println(sql);
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
}
