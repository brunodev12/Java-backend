/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_poo;

import guia_7_poo.newpackage.Juego;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Ejercicio_3_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        boolean check=false;
        
        System.out.print("El jugador uno debe ingresar un número: ");
        Juego game = new Juego(leer.nextInt());
        System.out.println("El jugador dos tiene 5 intentos para adivinar el número ingresado por el jugador uno");
        for (int i = 0; i < 5; i++) {
            System.out.println("=============== Intento " + (i+1) + " ================");
            System.out.print("Ingrese un número: ");
            if (game.iniciar_juego(leer.nextInt())) {
                System.out.println("Correcto ha adivinado el número");
                check=true;
                break;
            }
        }
        if (check==false) {
            System.out.println("================== Fin ===================");
            System.out.println("Se agotaron los intentos");
        }
    }
    
}
