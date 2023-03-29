/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_poo.newpackage;

/**
 *
 * @author bruno
 */
public class Cocina {

    private int n;
    private String[] arregloRecetas;

    public Cocina(int n) {
        this.n = n;
        arregloRecetas = new String[n];
    }

    public void setRecetas(String _nombre, int posicion) {
        this.arregloRecetas[posicion] = _nombre;
    }

    public void getRecetas() {
        for (int i = 0; i < n; i++) {
            System.out.println("Receta " + (i + 1) + " : " + this.arregloRecetas[i]);
        }
    }

    public void setIngredientes() {
        Recetas pollo = new Recetas(this.arregloRecetas[0]);
        pollo.setIngre();
        pollo.getIngredientes();
    }

    public void buscarReceta(String _nombre) {
        for (int i = 0; i < n; i++) {
            if (this.arregloRecetas[i].equalsIgnoreCase(_nombre)) {
                System.out.println("Se ha encontrado la receta en la posición: " + (i));
            } else {
                System.out.println("No se encontró la receta");
            }
        }
    }

}
