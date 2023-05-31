package Entidades;

import Interface.Modulo;
import java.time.LocalDate;

/**
 *
 * @author bruno
 */
public class Yate extends Barco implements Modulo{
    private final int potencia;
    private final int camarotes;

    public Yate(int potencia, int camarotes, String matricula, int eslora, LocalDate anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }

    @Override
    public int calcularModulo() {
        int moduloYate = moduloNormal + (potencia * 25) + (camarotes * 300);
        return moduloYate;
    }
}
