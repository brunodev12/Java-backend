package Entidades;

import Interface.Modulo;
import java.time.LocalDate;

/**
 *
 * @author bruno
 */
public class BarcoMotor extends Barco implements Modulo{
    private final int potencia;

    public BarcoMotor(int potencia, String matricula, int eslora, LocalDate anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    @Override
    public int calcularModulo() {
        int moduloBarco = moduloNormal + (potencia * 25);
        return moduloBarco;
    }
    
    
}
