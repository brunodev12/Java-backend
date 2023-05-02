/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class PeliculaServicio {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPelicula(ArrayList<Pelicula> _peliculas) {
        String opcion;
        do {
            System.out.print("Ingrese el nombre de la película: ");
            String nombre = leer.next();
            nombre = nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length());
            System.out.print("Ingrese el director de la película: ");
            String director = leer.next();
            director = director.toUpperCase().charAt(0) + director.substring(1, director.length());
            System.out.print("Ingrese la duración de la película: ");
            double duracion = leer.nextDouble();

            _peliculas.add(new Pelicula(nombre, director, duracion));

            System.out.println("Desea seguir agregando películas? ");
            opcion = leer.next();

        } while (opcion.equalsIgnoreCase("si"));
    }

    public void mostrarPeliculas(ArrayList<Pelicula> _peliculas) {
        System.out.println("============================================");
        _peliculas.forEach((_pelicula) -> {
            System.out.println(_pelicula);
        });
    }

    public void mostrarPeliculasMayorHora(ArrayList<Pelicula> _peliculas) {
        System.out.println("============================================");

//        for (Pelicula _pelicula : _peliculas) {
//            if (_pelicula.getDuracion() > 1) {
//                System.out.println(_pelicula);
//            }
//        }

//      Otra forma de recorrer y filtrar

        _peliculas.stream().filter((_pelicula) -> (_pelicula.getDuracion() > 1)).forEachOrdered((_pelicula) -> {
            System.out.println(_pelicula);
        });
    }

    public void ordenDescendente(ArrayList<Pelicula> _peliculas) {
        _peliculas.sort(Pelicula.duracionDescendente);
        this.mostrarPeliculas(_peliculas);
    }

    public void ordenAscendente(ArrayList<Pelicula> _peliculas) {
        _peliculas.sort(Pelicula.duracionAscendente);
        this.mostrarPeliculas(_peliculas);
    }

    public void ordenTitulo(ArrayList<Pelicula> _peliculas) {
        _peliculas.sort(Pelicula.ordenTitulo);
        this.mostrarPeliculas(_peliculas);
    }

    public void ordenDirector(ArrayList<Pelicula> _peliculas) {
        _peliculas.sort(Pelicula.ordenDirector);
        this.mostrarPeliculas(_peliculas);
    }

}
