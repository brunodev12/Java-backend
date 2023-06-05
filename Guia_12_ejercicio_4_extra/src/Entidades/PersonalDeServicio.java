package Entidades;

import Enumeraciones.EstadoCivil;
import Enumeraciones.Secciones;
import java.time.LocalDate;

/**
 *
 * @author bruno
 */
public class PersonalDeServicio extends Empleado{
    private Secciones seccion;

    public PersonalDeServicio(Secciones seccion, LocalDate anioIncorporacion, int numeroDespacho, String nombre, String apellido, int dni, EstadoCivil estadoCivil) {
        super(anioIncorporacion, numeroDespacho, nombre, apellido, dni, estadoCivil);
        this.seccion = seccion;
    }

    public void setSeccion(Secciones seccion) {
        this.seccion = seccion;
    }

    public Secciones getSeccion() {
        return seccion;
    }

    @Override
    public String toString() {
        return super.toString() + ", Profesion=PersonalDeServicio" + ", seccion=" + seccion;
    }
    
    
}
