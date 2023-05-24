/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author bruno
 */
public class Perro extends Animal{
    
    private final String ladrido;
    
    

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
        this.ladrido = "wow";
    }

    public String getLadrido() {
        return ladrido;
    }

//    @Override
//    public void setAlimento() {
//        this.alimento = "carne";
//    }
    
    public void algo(){
        super.Alimentarse();
    }
    
    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", alimento=" + alimento + ", edad=" + edad + ", raza=" + raza + ", ladrido=" + ladrido + '}';
    }    
    
}
