/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9_clase_utilidad;

import entidades.Meses;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Ejercicio_1_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Meses meses = new Meses();
        String mesUsuario;

        String mesSecreto = meses.getMesSecreto();
        System.out.println(mesSecreto);
        
        do {
            System.out.print("Adivine: ");
            mesUsuario = leer.next();
            if (mesUsuario.equalsIgnoreCase(mesSecreto)) {
                System.out.println("Correcto! " + mesSecreto + " es el mes secreto");
            } else {
                System.out.println("Intente otra vez");
            }
        } while (!mesUsuario.equalsIgnoreCase(mesSecreto));
    }

}
