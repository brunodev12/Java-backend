/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía_5_arreglos;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class ejercicio_6_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] matriz = new String[20][20];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                int num = (int) (Math.random() * 9);
                matriz[i][j] = String.valueOf(num);
            }
        }

        for (int i = 0; i < 5; i++) {
            String palabra = checkFrase();
            llenarMatriz(matriz, palabra);
        }

    }

    public static String checkFrase() {
        String frase;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese una palabra de mínimo 3 y máximo 5 caracteres");
            frase = leer.next();
        } while (frase.length() < 3 || frase.length() > 5);

        return frase;
    }

    public static void llenarMatriz(String[][] _matriz, String _palabra) {
        int fila = (int) (Math.random() * 19);
        int c = 0;
        int columna = (int) (Math.random() * (19 - _palabra.length()));
        for (int j = columna; j < columna + _palabra.length(); j++) {
            _matriz[fila][j] = _palabra.substring(c, c + 1);
            c++;
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(_matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
