/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_poo.newpackage;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Recetas {

    Scanner leer = new Scanner(System.in);

    private String nombre;
    private String[] ingredientes = new String[3];

    public Recetas(String nombre) {
        this.nombre = nombre;
    }

    public void setIngre() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el ingrediente " + (i + 1) + " de la receta " + nombre);
            this.ingredientes[i] = leer.next();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void getIngredientes() {
        System.out.println("La receta " + nombre + " contiene los ingredientes:");
        for (int i = 0; i < 3; i++) {
            System.out.println(this.ingredientes[i]);
        }
    }
    
    public boolean buscarIng(String _ingre){
        for (int i = 0; i < 3; i++) {
            if (this.ingredientes[i].equalsIgnoreCase(_ingre)) {
                return true;
            }
        }
        return false;
    }
}
