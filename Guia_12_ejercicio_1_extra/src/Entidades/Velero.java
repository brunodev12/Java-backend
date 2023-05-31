package Entidades;

import Interface.Modulo;
import java.time.LocalDate;

/**
 *
 * @author bruno
 */
public class Velero extends Barco implements Modulo{
    
    private final int mastiles;

    public Velero(String matricula, int eslora, LocalDate anioFabricacion, int mastiles) {
        super(matricula, eslora, anioFabricacion);
        this.mastiles = mastiles;
    }

    @Override
    public int calcularModulo() {
        int moduloVelero = moduloNormal + (mastiles*10);
        return moduloVelero;
    }
}
