package guia_11_ejercicio_2;

import entidades.Juego;
import entidades.Jugador;
import entidades.Revolver;
import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class Guia_11_Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Jugador> jugadores = new ArrayList();
        Revolver pistola = new Revolver();
        pistola.llenarRevolver();
        
        for (int i = 0; i < 6; i++) {
            jugadores.add(new Jugador(i, "jugador", false));
        }
        
        Juego ruletaRusa = new Juego();
        
        ruletaRusa.llenarJuego(jugadores, pistola);
        
        while (!ruletaRusa.ronda()){}
    }
    
}
