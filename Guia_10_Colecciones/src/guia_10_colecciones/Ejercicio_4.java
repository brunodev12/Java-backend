/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10_colecciones;

import Entidades.Pelicula;
import Servicio.PeliculaServicio;
import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Pelicula> peliculas = new ArrayList();
        
        PeliculaServicio PS = new PeliculaServicio();
        
        PS.crearPelicula(peliculas);
        PS.mostrarPeliculas(peliculas);
        PS.mostrarPeliculasMayorHora(peliculas);
        PS.ordenDescendente(peliculas);
        PS.ordenAscendente(peliculas);
        PS.ordenTitulo(peliculas);
        PS.ordenDirector(peliculas);
    }
    
}
