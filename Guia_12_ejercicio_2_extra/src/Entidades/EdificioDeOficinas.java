package Entidades;

/**
 *
 * @author bruno
 */
public class EdificioDeOficinas extends Edificio {

    private final int numeroOficinas;
    private final int cantidadPersonasOficinas;
    private final int numeroPisos;

    public EdificioDeOficinas(int numeroOficinas, int cantidadPersonasOficinas, int numeroPisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.cantidadPersonasOficinas = cantidadPersonasOficinas;
        this.numeroPisos = numeroPisos;
    }

    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    public int getCantidadPersonasOficinas() {
        return cantidadPersonasOficinas;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public int cantPersonasPorPiso() {
        int cantidadPersonas = cantidadPersonasOficinas * numeroOficinas;
        return cantidadPersonas;
    }

    public int cantPersonasEdificio() {
        int cantidadPersonas = cantidadPersonasOficinas * numeroOficinas * numeroPisos;
        return cantidadPersonas;
    }

    @Override
    public int calcularSuperficie() {
        int superficie = ancho * largo * numeroPisos;
        return superficie;
    }

    @Override
    public int calcularVolumen() {
        int volumen = ancho * largo * alto;
        return volumen;
    }

}
