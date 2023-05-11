package entidades;

import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public boolean ronda() {
        for (Jugador jugador : jugadores) {
            
            if (jugador.disparo(revolver)) {
                System.out.println("F por " + jugador.getNombre());
                return true;
            } else {
                System.out.println(jugador.getNombre() + " sigue participando");
                System.out.println("Posicion Actual: " + revolver.getPosicionActual());
            }
        }
        return false;
    }
}
