/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class PaisServicio {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final HashSet<String> paises = new HashSet();

    public void agregarPais() {

        String opcion;

        do {

            System.out.print("Ingrese un país: ");
            String pais = leer.next();
            pais = pais.toUpperCase().charAt(0) + pais.substring(1, pais.length());
            paises.add(pais);
            
            System.out.println("Desea seguir agregando paises? ");
            opcion = leer.next();

        } while (opcion.equalsIgnoreCase("si"));
        
        this.mostrarPaises();
    }
    
    private void mostrarPaises(){
        System.out.println("======================================");
        paises.forEach((pais) -> {
            System.out.println(pais);
        });
    }
    
    public void mostrarPaisesOrdenados(){
        System.out.println("========= Paises ordenados ===========");
        ArrayList<String> paisesLista = new ArrayList(paises);
        Collections.sort(paisesLista);
        paisesLista.forEach((pais) -> {
            System.out.println(pais);
        });
    }
    
    public void buscarPais(){
        System.out.print("Ingrese el pais que desea eliminar: ");
        String pais = leer.next();
        Iterator<String> iterador = paises.iterator();
        boolean check = false;
        
        while(iterador.hasNext()){
            if (iterador.next().equalsIgnoreCase(pais)) {
                iterador.remove();
                check = true;
            }
        }
        
        if (check) {
            this.mostrarPaises();
        } else {
            System.out.println("No se ha encontrado el país ingresado");
        }
    }

}
