package entidades;

/**
 *
 * @author bruno
 */
public class Revolver {
    private int posicionActual;
    private int posicionBala;
    
    public Revolver(){
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionBala() {
        return posicionBala;
    }

    public void setPosicionBala(int posicionBala) {
        this.posicionBala = posicionBala;
    }
    
    public void llenarRevolver(){
        this.posicionActual = (int) (Math.random()*6+1);
        this.posicionBala = (int) (Math.random()*6+1);
        System.out.println("Posicion Inicial: " + posicionActual);
        System.out.println("Posicion Bala: " + posicionBala);
    }
    
    public boolean mojar(){
        return posicionActual == posicionBala;
    }
    
    public void siguienteChorro(){
        this.posicionActual = (int) (Math.random()*6+1);
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionBala=" + posicionBala + '}';
    }
    
}
