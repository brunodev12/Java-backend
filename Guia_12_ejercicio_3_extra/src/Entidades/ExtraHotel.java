package Entidades;

/**
 *
 * @author bruno
 */
public class ExtraHotel extends Alojamiento{
    protected boolean privado;
    protected int superficie;

    public ExtraHotel(boolean privado, int superficie, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.superficie = superficie;
    }

    public boolean isPrivado() {
        return privado;
    }

    public int getSuperficie() {
        return superficie;
    }

    @Override
    public String toString() {
        return "---ExtraHotel---" + "\nnombre = " + nombre + "\ndireccion = " + direccion + "\nlocalidad = " + localidad + "\ngerente = " + gerente + "\nprivado = " + privado + "\nsuperficie = " + superficie;
    }
    
    
}
