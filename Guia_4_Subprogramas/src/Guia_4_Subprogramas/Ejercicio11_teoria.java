/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_4_Subprogramas;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Ejercicio11_teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        String frase;
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        
        System.out.println(convertirFrase(frase));
    }

    public static String convertirFrase(String frase) {
        String letra;
        String frase2 = "";

        for (int i = 0; i < frase.length(); i++) {
            letra = frase.substring(i, i + 1);
            letra = letra.toLowerCase();

            switch (letra) {
                case "a":
                    letra = "@";
                    break;
                case "e":
                    letra = "#";
                    break;
                case "i":
                    letra = "$";
                    break;
                case "o":
                    letra = "%";
                    break;
                case "u":
                    letra = "*";
                    break;
            }
            
            frase2 = frase2.concat(letra);
        }
        
        return frase2;
    }
}
