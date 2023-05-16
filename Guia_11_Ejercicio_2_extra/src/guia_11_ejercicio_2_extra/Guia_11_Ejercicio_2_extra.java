/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_11_ejercicio_2_extra;

import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;
import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class Guia_11_Ejercicio_2_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Espectador> espectadores = new ArrayList();
        int rechazados = 0;

        Pelicula pelicula = new Pelicula("El secreto en la montaña", 120, 16, "Steven Monasterio");
        Cine cine = new Cine(pelicula, 2000);

        int numeroEspectadores = (int) (Math.random() * 48);
        System.out.println("La cantidad de personas que quisieron entrar es: " + numeroEspectadores);

        for (int i = 0; i < numeroEspectadores; i++) {
            String nombre = "persona " + (i + 1);
            int edad = (int) (Math.random() * 70 + 6);
            int dinero = (int) (Math.random() * 12000);
            espectadores.add(new Espectador(nombre, edad, dinero));
        }

        for (Espectador espectador : espectadores) {

            if (cine.getEspectadores() < cine.getCapacidad()) {
                if (espectador.getDinero() >= cine.getPrecioEntrada() && espectador.getEdad() >= pelicula.getEdadMinima()) {
                    boolean check;
                    do {
                        int fila = (int) (Math.random() * 8 + 1);
                        char columna = nombrarColumna((int) (Math.random() * 6));
                        check = cine.setAsiento(fila, columna);
                    } while (!check);
                } else {
                    rechazados++;
                }
            } else {
                rechazados++;
            }
        }
        
        cine.mostrarAsientos();
        System.out.println("Rechazados " + rechazados);
    }

    public static char nombrarColumna(int num) {
        char nombre = 'a';
        switch (num) {
            case 0:
                nombre = 'A';
                break;
            case 1:
                nombre = 'B';
                break;
            case 2:
                nombre = 'C';
                break;
            case 3:
                nombre = 'D';
                break;
            case 4:
                nombre = 'E';
                break;
            case 5:
                nombre = 'F';
                break;
        }
        return nombre;
    }

}
