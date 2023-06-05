package Entidades;

import Enumeraciones.EstadoCivil;
import java.time.LocalDate;

/**
 *
 * @author bruno
 */
public class Empleado extends Persona{
    protected LocalDate anioIncorporacion;
    protected int numeroDespacho;

    public Empleado(LocalDate anioIncorporacion, int numeroDespacho, String nombre, String apellido, int dni, EstadoCivil estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public void setNumeroDespacho(int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }

    public LocalDate getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }

    @Override
    public String toString() {
        return super.toString() + ", anioIncorporacion=" + anioIncorporacion + ", numeroDespacho=" + numeroDespacho;
    }
    
    
}
