/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author bruno
 */
public abstract class Animal {
    
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

//    public String getNombre() {
//        return nombre;
//    }
//
//    public String getAlimento() {
//        return alimento;
//    }
//
//    public int getEdad() {
//        return edad;
//    }
//
//    public String getRaza() {
//        return raza;
//    }
    
    public void Alimentarse(){
        System.out.println(nombre + " se alimenta de " + alimento);
    };
        
}
