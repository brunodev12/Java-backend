package Entidades;

/**
 *
 * @author bruno
 */
abstract public class Edificio {
    protected int ancho;
    protected int alto;
    protected int largo;

    public Edificio(int ancho, int alto, int largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }
    
    abstract public int calcularSuperficie();
    
    abstract public int calcularVolumen();
}
