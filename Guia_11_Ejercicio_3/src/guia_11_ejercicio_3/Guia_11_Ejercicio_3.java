/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_11_ejercicio_3;

import entidades.Baraja;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Guia_11_Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Baraja baraja = new Baraja();
        int opcion;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        do {
            System.out.println("-------- Elija una opción: --------");
            System.out.println("1. Barajar");
            System.out.println("2. Mostrar numero de cartas disponibles");
            System.out.println("3. Dar cartas");
            System.out.println("4. Mostrar cartas eliminadas");
            System.out.println("5. Mostrar cartas disponibles");
            System.out.println("6. Salir");
            System.out.println("-----------------------------------");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    baraja.barajar();
                    break;
                case 2:
                    baraja.cartasDisponibles();
                    break;
                case 3:
                    baraja.darCartas();
                    break;
                case 4:
                    baraja.CartasMonton();
                    break;
                case 5:
                    baraja.mostrarBaraja();
                    break;
                case 6:
                    System.out.println("Hasta luego...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            
        } while (opcion!=6);
    }
    
}
