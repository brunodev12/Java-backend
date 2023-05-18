/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Alumno;
import Entidades.Voto;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Simulador {

    private String[] nombres = {"Camila", "Katherine", "Martin", "Maxi", "Pablo", "Bruno", "Seba", "Abigail"};
    private String[] apellidos = {"Spilberg", "Cejas", "Mutuverria", "Perez", "Pagani", "Carthery", "Cuart", "Finochio"};
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<String> generarListadoAlumnos() {
        ArrayList<String> listadoAlumnos = new ArrayList();
        System.out.print("Cuántos alumnos quiere generar? ");
        int cantidad = leer.nextInt();
        for (int i = 0; i < cantidad; i++) {
            String nombre = nombres[(int) (Math.random() * 8)];
            String apellido = apellidos[(int) (Math.random() * 8)];
            listadoAlumnos.add(nombre + " " + apellido);
        }
        return listadoAlumnos;
    }

    public HashSet<Integer> generarListaDni(ArrayList<String> _listadoAlumnos) {
        HashSet<Integer> listaDni = new HashSet();
        int cantidad = _listadoAlumnos.size();
        do {
            int dni = (int) (Math.random() * 40000000 + 10000000);
            listaDni.add(dni);

        } while (listaDni.size() < cantidad);
        return listaDni;
    }

    public ArrayList<Alumno> generarAlumnos(ArrayList<String> _listadoAlumnos, HashSet<Integer> _listaDni) {
        ArrayList<Alumno> alumnos = new ArrayList();
        ArrayList<Integer> listaDni = new ArrayList(_listaDni);
        for (int i = 0; i < _listadoAlumnos.size(); i++) {
            Alumno alumno = new Alumno(_listadoAlumnos.get(i), listaDni.get(i));
            alumnos.add(alumno);
        }
        return alumnos;
    }

    public void mostrarAlumnos(ArrayList<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    public ArrayList<Voto> votacion(ArrayList<Alumno> alumnos) {
        ArrayList<Voto> votos = new ArrayList();
        int cantidadAlumnos = alumnos.size();
        int numAleatorio;
        for (int i = 0; i < cantidadAlumnos; i++) {
            Voto voto = new Voto(alumnos.get(i));
            while ((voto.getAlumnosVoto().size() < 3)) {
                numAleatorio = generarNumAleatorio(i, cantidadAlumnos);
                voto.addAlumnosVoto(alumnos.get(numAleatorio));
            }
            votos.add(voto);
        }
        return votos;
    }

    public void mostrarVotos(ArrayList<Voto> votos) {
        for (Voto voto : votos) {
            String nombre = voto.getAlumnoVota().getNombreCompleto();
            int cantidadVotos = voto.getAlumnoVota().getCantidadVotos();
            ArrayList<Alumno> alumnosQueVoto = voto.getAlumnosVoto();
            System.out.println(nombre + " recibió " + cantidadVotos + " votos" + " y votó a: ");
            for (Alumno alumno : alumnosQueVoto) {
                System.out.println(alumno.getNombreCompleto());
            }
        }
    }

    public void recuentoVotos(ArrayList<Alumno> alumnos) {
        System.out.println("================================");
        for (Alumno alumno : alumnos) {
            String nombre = alumno.getNombreCompleto();
            int dni = alumno.getDni();
            int cantidadVotos = alumno.getCantidadVotos();
            System.out.println(nombre + " - " + dni + " - recibió: " + cantidadVotos + " votos");
        }
    }

    private int generarNumAleatorio(int num, int rango) {
        int numAleatorio;
        do {
            numAleatorio = (int) (Math.random() * rango);
        } while (numAleatorio == num);
        return numAleatorio;
    }

    private void ordenarVotos(ArrayList<Alumno> alumnos) {
        alumnos.sort(Alumno.compararVotos);
    }

    public void mostrarFacilitadores(ArrayList<Alumno> alumnos) {
        this.ordenarVotos(alumnos);
        System.out.println("===== Facilitadores titulares =====");
        for (int i = 0; i < 5; i++) {
            String nombre = alumnos.get(i).getNombreCompleto();
            int dni = alumnos.get(i).getDni();
            int cantidadVotos = alumnos.get(i).getCantidadVotos();
            System.out.println(nombre + " - " + dni + " - " + cantidadVotos + " votos");
        }
        System.out.println("===== Facilitadores suplentes =====");
        for (int i = 5; i < 10; i++) {
            String nombre = alumnos.get(i).getNombreCompleto();
            int dni = alumnos.get(i).getDni();
            int cantidadVotos = alumnos.get(i).getCantidadVotos();
            System.out.println(nombre + " - " + dni + " - " + cantidadVotos + " votos");
        }
    }
}
