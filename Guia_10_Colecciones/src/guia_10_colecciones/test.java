/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10_colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

/**
 *
 * @author bruno
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        ArrayList<Integer> listado = new ArrayList();
//        TreeSet<String> treeset = new TreeSet();
//        HashMap<Integer, String> claveValor = new HashMap();
        //LISTAS
        ArrayList<Integer> numerosA = new ArrayList();
        int x = 20;
        numerosA.add(x);
        numerosA.add(2);
        numerosA.add(7);
        numerosA.add(5);
        numerosA.add(8);
        numerosA.remove(4);
        numerosA.remove(1);
        
//        for (Integer numero : numerosA) {
//            System.out.println(numero);
//        }

//        numerosA.forEach((num) -> {
//            System.out.println(num);
//        });

        //CONJUNTOS
        HashSet<Integer> numerosB = new HashSet();
        Integer y = 20;
        numerosB.add(y);
        numerosB.add(20);
        numerosB.add(30);
        numerosB.add(40);
        numerosB.add(50);
        numerosB.remove(50);

//        numerosB.forEach((num) -> {
//        System.out.println(num);
//        });
        //MAPAS:
        HashMap<Integer, String> alumnos = new HashMap();
        int dni = 34576189;
        String nombreAlumno = "Pepe";
        alumnos.put(dni, nombreAlumno);   //Primero llave, segundo valor
        alumnos.put(35984562, "Juan");
        alumnos.put(24875212, "Carlos");
        alumnos.put(29874563, "Roberto");
        alumnos.put(31452647, "Pereyra");
        alumnos.remove(35984562);

//        for (Map.Entry<Integer, String> elemento : alumnos.entrySet()) {
//            System.out.println("DNI: " + elemento.getKey() + " - Nombre:" + elemento.getValue());
//        }
        alumnos.entrySet().forEach((elemento) -> {
            System.out.println("DNI: " + elemento.getKey() + " - Nombre:" + elemento.getValue());
        });

//        for (Integer _dni : alumnos.keySet()) {
//            System.out.println("Documento: " + _dni);
//        }
        alumnos.keySet().forEach((_dni) -> {
            System.out.println("Documento: " + _dni);
        });

//        for (String nombre : alumnos.values()) {
//            System.out.println("Nombre: " + nombre);
//        }
        alumnos.values().forEach((nombre) -> {
            System.out.println("Nombre: " + nombre);
        });

        HashMap<Integer, String> personas = new HashMap();
        String n1 = "Albus";
        String n2 = "Severus";
        int edad1 = 63;
        int edad2 = 45;
        personas.put(edad1, n1);
        personas.put(edad2, n2);

        personas.entrySet().forEach((elemento) -> {
            System.out.println("Nombre: " + elemento.getValue() + " - Edad: " + elemento.getKey());
        });
        
        
    }

}
