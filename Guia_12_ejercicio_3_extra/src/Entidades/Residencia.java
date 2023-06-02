package Entidades;

/**
 *
 * @author bruno
 */
public class Residencia extends ExtraHotel{
    private int cantHabitaciones;
    private boolean descuentoGremios;
    private boolean campoDeportivo;

    public Residencia(int cantHabitaciones, boolean descuentoGremios, boolean campoDeportivo, boolean privado, int superficie, String nombre, String direccion, String localidad, String gerente) {
        super(privado, superficie, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoGremios = descuentoGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public boolean isDescuentoGremios() {
        return descuentoGremios;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    @Override
    public String toString() {
        return "---Residencia---" + "\nnombre = " + nombre + "\ndireccion = " + direccion + "\nlocalidad = " + localidad + "\ngerente = " + gerente + "\nprivado = " + privado + "\nsuperficie = " + superficie + "\ncantHabitaciones = " + cantHabitaciones + "\ndescuentoGremios = " + descuentoGremios + "\ncampoDeportivo = " + campoDeportivo;
    }
    
    
}
