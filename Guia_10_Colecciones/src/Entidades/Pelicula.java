/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Comparator;

/**
 *
 * @author bruno
 */
public class Pelicula {
    private final String titulo;
    private final String director;
    private final Double duracion;

    public Pelicula(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Double getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Titulo=" + titulo + "\ndirector=" + director + "\nduracion=" + duracion;
    }
    
    public static Comparator<Pelicula> duracionDescendente = (Pelicula p1, Pelicula p2) -> p2.getDuracion().compareTo(p1.getDuracion());
    
    public static Comparator<Pelicula> duracionAscendente = (Pelicula p1, Pelicula p2) -> p1.getDuracion().compareTo(p2.getDuracion());
    
    public static Comparator<Pelicula> ordenTitulo = (Pelicula p1, Pelicula p2) -> p1.getTitulo().compareTo(p2.getTitulo());
    
    public static Comparator<Pelicula> ordenDirector = (Pelicula p1, Pelicula p2) -> p1.getDirector().compareTo(p2.getDirector());
}
