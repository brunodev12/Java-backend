package Entidades;

import java.time.LocalDate;

/**
 *
 * @author bruno
 */
public class Barco {
    protected String matricula;
    protected int eslora;
    protected LocalDate anioFabricacion;
    protected int moduloNormal;

    public Barco(String matricula, int eslora, LocalDate anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
        this.moduloNormal = eslora * 10;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public LocalDate getAnioFabricacion() {
        return anioFabricacion;
    }
    
    public int calcularModulo() {
        return moduloNormal;
    }
}
