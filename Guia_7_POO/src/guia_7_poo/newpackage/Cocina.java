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
    private Recetas[] arregloClase;

    public Cocina(int n) {
        this.n = n;
        arregloRecetas = new String[n];
        arregloClase = new Recetas[n];
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
        for (int i = 0; i < n; i++) {
            Recetas _receta = new Recetas(this.arregloRecetas[i]);
            _receta.setIngre();
            //_receta.getIngredientes();
            arregloClase[i] = _receta;
        }
    }

    public void buscarReceta(String _nombre) {
        boolean check = false;
        for (int i = 0; i < n; i++) {
            if (this.arregloRecetas[i].equalsIgnoreCase(_nombre)) {
                System.out.println("Se ha encontrado la receta " + _nombre + " en la posición: " + (i));
                check = true;
            }
        }
        if (check == false) {
            System.out.println("No se ha encontrado la receta");
        }
    }

    public void buscarIngredientes(String _ing1, String _ing2, String _ing3) {
        boolean check = false;
        for (int i = 0; i < n; i++) {
            if (arregloClase[i].buscarIng(_ing1) && arregloClase[i].buscarIng(_ing2) && arregloClase[i].buscarIng(_ing3)) {
                arregloClase[i].getIngredientes();
                check = true;
            }
        }
        if (check == false) {
            System.out.println("No se ha encontrado una receta con esos ingredientes");
        }
    }

}
