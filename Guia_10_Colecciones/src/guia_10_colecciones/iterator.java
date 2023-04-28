/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10_colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author bruno
 */
public class iterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<String> lista = new ArrayList();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");

        Iterator<String> iterador = lista.iterator();

        System.out.println("Elementos de la lista: ");

        while (iterador.hasNext()) {
            String letra = iterador.next();
            System.out.println(letra);
            if (letra.equals("B")) {
                iterador.remove();
            }
        }

        System.out.println("=======================");

        iterador = lista.iterator();        //EL iterador tiene su propio índice al definirlo nuevamente este indice vuelve a 0

        while (iterador.hasNext()) {
            System.out.println(iterador.next() + " ");
        }
        System.out.println("=======================");

        HashSet<Integer> numeros = new HashSet();
        numeros.add(1);
        numeros.add(2);
        numeros.add(4);
        numeros.add(2);
        numeros.add(3);
        numeros.add(6);
        numeros.add(9);
        numeros.add(7);

//        for (Integer num : numeros) {
//            System.out.println(num);
//        }
        Iterator<Integer> numIterador = numeros.iterator();

//        while (numIterador.hasNext()) {
//            if (numIterador.next() == 2) {
//                numIterador.remove();
//            }
//        }
//        numeros.remove(4);
        for (Integer num : numeros) {
            System.out.println(num);
        }

        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }
        }
        
        for(String bebida : bebidas) {
            System.out.println(bebida);
        }

//        ArrayList<String> bebidas = new ArrayList();
//        bebidas.add("café");
//        bebidas.add("té");
//        
//        Iterator<String> it =bebidas.iterator();
//        
//        while (it.hasNext()) {
//            if (it.next().equals("café")){
//            it.remove();
//            }
//        }
    }

}
