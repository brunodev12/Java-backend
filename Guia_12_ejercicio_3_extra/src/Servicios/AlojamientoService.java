/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.Hotel;
import Entidades.Residencia;
import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class AlojamientoService {

    public void mostrarAlojamientos(ArrayList<Alojamiento> alojamientos) {
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println(alojamiento);
        }
    }

    public void mostrarHoteles(ArrayList<Alojamiento> alojamientos) {
        ArrayList<Hotel> hoteles = new ArrayList();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel) {
                hoteles.add((Hotel) alojamiento);
            }
        }
        hoteles.sort(Hotel.precioDescendente);
        
        for (Hotel hotel : hoteles) {
            System.out.println(hotel);
        }
    }
    
    public void campingConRestaurante(ArrayList<Alojamiento> alojamientos){
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping) {
                if (((Camping) alojamiento).isRestaurante()) {
                    System.out.println(alojamiento);
                }
            }
        }
    }
    
    public void mostrarResidenciasDescuento(ArrayList<Alojamiento> alojamientos){
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Residencia) {
                if (((Residencia) alojamiento).isDescuentoGremios()) {
                    System.out.println(alojamiento);
                }
            }
        }
    }
}
