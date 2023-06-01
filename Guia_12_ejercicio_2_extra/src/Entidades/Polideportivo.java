package Entidades;

import Enumeraciones.TipoInstalacion;

/**
 *
 * @author bruno
 */
public class Polideportivo extends Edificio{
    private final String nombre;
    private final TipoInstalacion tipoInstalacion;

    public Polideportivo(String nombre, TipoInstalacion tipoInstalacion, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoInstalacion getTipoInstalacion() {
        return tipoInstalacion;
    }
    
    @Override
    public int calcularSuperficie() {
        int superficie = ancho * largo;
        return superficie;
    }

    @Override
    public int calcularVolumen() {
        int volumen;
        if (tipoInstalacion==TipoInstalacion.TECHADO) {
            volumen = ancho * largo * alto;
        } else {
            volumen = ancho * largo;
        }
        return volumen;
    }
    
}
