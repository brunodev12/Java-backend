package Entidades;

import Enumeraciones.Cursos;
import Enumeraciones.EstadoCivil;
import java.time.LocalDate;

/**
 *
 * @author bruno
 */
public class Profesor extends Empleado{
    private Cursos departamento;

    public Profesor(Cursos departamento, LocalDate anioIncorporacion, int numeroDespacho, String nombre, String apellido, int dni, EstadoCivil estadoCivil) {
        super(anioIncorporacion, numeroDespacho, nombre, apellido, dni, estadoCivil);
        this.departamento = departamento;
    }

    public void setDepartamento(Cursos departamento) {
        this.departamento = departamento;
    }

    public Cursos getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Profesion=Profesor" + ", departamento=" + departamento;
    }
    
    
}
