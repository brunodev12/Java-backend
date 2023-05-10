/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package mascotaapp;

import entidades.Mascota;
import entidades.Persona;
import enumeraciones.RazaGato;
import enumeraciones.RazaPerro;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author bruno
 */
public class Mascotaapp {

    public static void main(String[] args) {

//        String nombre= "Salchicha";
//        
//        for (RazaPerro aux : RazaPerro.values()) {
//            if (aux.getValor().equalsIgnoreCase(nombre)) {
//                System.out.println(aux);
//            }
//        }
        Persona persona = new Persona("Roberto", 43, new Date("15/10/1884"));

        Mascota m1 = new Mascota<RazaPerro>("Jaime", 13);

        m1.setRaza(RazaPerro.SALCHICHA);

        Mascota m2 = new Mascota<RazaGato>("Carmelo", 11);

        m2.setRaza(RazaGato.SIAMES);

        List<Mascota> mascotas = new ArrayList();

        mascotas.add(m1);
        mascotas.add(m2);

        persona.setMascotas(mascotas);
        persona.setMascotaFavorita(m1);

        System.out.println(persona);

    }
}
