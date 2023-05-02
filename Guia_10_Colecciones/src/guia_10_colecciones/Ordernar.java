/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10_colecciones;

import Entidades.AlumnoTest;
import Entidades.LibroTest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author bruno
 */
public class Ordernar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        ArrayList<Integer> numeros = new ArrayList();
//        numeros.add(923);
//        numeros.add(2121);
//        numeros.add(41);
//        numeros.add(93);
//        numeros.add(25);
//        numeros.add(823);
//        numeros.add(64);
//        numeros.add(1);
//
//        Collections.sort(numeros);
//        for (Integer numero : numeros) {
//            System.out.println(numero);
//        }
//        HashSet<Integer> numeros = new HashSet();
//        numeros.add(923);
//        numeros.add(2121);
//        numeros.add(41);
//        numeros.add(93);
//        numeros.add(25);
//        numeros.add(823);
//        numeros.add(64);
//        numeros.add(1);
//        
//        ArrayList<Integer> numerosLista = new ArrayList(numeros);
//        Collections.sort(numerosLista);
//        
//        numerosLista.forEach((numero) -> {
//            System.out.println(numero);
//        });
//        HashMap<Integer, String> alumnos = new HashMap();
//        alumnos.put(2335, "Roberto");
//        alumnos.put(233, "Juan");
//        alumnos.put(1851, "Mariana");
//
//        for (Map.Entry<Integer, String> elemento : alumnos.entrySet()) {
//            System.out.println("Edad: " + elemento.getKey() + " - Nombre: " + elemento.getValue());
//        }
//
//        TreeMap<Integer, String> alumnosTree = new TreeMap(alumnos);
//
//        for (Map.Entry<Integer, String> elemento : alumnosTree.entrySet()) {
//            System.out.println("Edad: " + elemento.getKey() + " - Nombre: " + elemento.getValue());
//        }
        HashMap<Integer, AlumnoTest> alumnosMap = new HashMap();
        AlumnoTest alumno1 = new AlumnoTest("Pepe", "Honguito", 35487521);
        AlumnoTest alumno2 = new AlumnoTest("Jimmy", "Rockson", 23547124);
        AlumnoTest alumno3 = new AlumnoTest("Roberto", "Carlos", 27845135);
        AlumnoTest alumno4 = new AlumnoTest("Wancho", "Dios", 31245789);
        AlumnoTest alumno5 = new AlumnoTest("Angel", "Di Maria", 43127239);
        alumnosMap.put(alumno1.getDni(), alumno1);
        alumnosMap.put(alumno2.getDni(), alumno2);
        alumnosMap.put(alumno3.getDni(), alumno3);
        alumnosMap.put(alumno4.getDni(), alumno4);
        alumnosMap.put(alumno5.getDni(), alumno5);
        ArrayList<AlumnoTest> alumnosLista = new ArrayList(alumnosMap.values());
        
        for (Map.Entry<Integer, AlumnoTest> elemento : alumnosMap.entrySet()) {
            System.out.println("DNI: " + elemento.getKey() + " - Objeto: " + elemento.getValue());
        }
        
        alumnosLista.sort(AlumnoTest.compararDni);
        
        for (AlumnoTest alumno : alumnosLista) {
            System.out.println(alumno);
        }
        

//        ArrayList<Libro> libros = new ArrayList();
//        Libro libro1 = new Libro("Harry topper", 5);
//        Libro libro2 = new Libro("La historia de John Bobby", 2);
//        Libro libro3 = new Libro("El principitio", 7);
//        Libro libro4 = new Libro("La historia del PalaLong", 1);
//        libros.add(libro1);
//        libros.add(libro2);
//        libros.add(libro3);
//        libros.add(libro4);

//        for (Libro libro : libros) {
//            System.out.println(libro);
//        }
//
//        libros.sort(Libro.compararCopias);
//
//        for (Libro libro : libros) {
//            System.out.println(libro);
//        }

//        TreeSet<Libro> librosConjunto = new TreeSet(Libro.compararCopias);
//        Libro libro1 = new Libro("Harry topper", 5);
//        Libro libro2 = new Libro("La historia de John Bobby", 2);
//        Libro libro3 = new Libro("El principitio", 7);
//        Libro libro4 = new Libro("La historia del PalaLong", 1);
//        librosConjunto.add(libro1);
//        librosConjunto.add(libro2);
//        librosConjunto.add(libro3);
//        librosConjunto.add(libro4);
//
//        for (Libro libro : librosConjunto) {
//            System.out.println(libro);
//        }

    }

}
