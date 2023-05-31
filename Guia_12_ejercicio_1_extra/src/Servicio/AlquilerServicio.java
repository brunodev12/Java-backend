package Servicio;

import Entidades.Alquiler;
import java.time.LocalDate;

/**
 *
 * @author bruno
 */
public class AlquilerServicio {
    
    public int calcularAlquiler(Alquiler alquiler){
        LocalDate fechaInicio = alquiler.getFechaAlquiler();
        LocalDate fechaFin = alquiler.getFechaDevolucion();
        int diasAlquiler = fechaInicio.until(fechaFin).getDays();
        int moduloBarco = alquiler.getBarco().calcularModulo();
        int costoAlquiler = diasAlquiler * moduloBarco;
        return costoAlquiler;
    }
    
}
