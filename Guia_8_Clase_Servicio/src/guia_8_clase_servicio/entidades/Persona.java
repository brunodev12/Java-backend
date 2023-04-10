/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_clase_servicio.entidades;

/**
 *
 * @author bruno
 */
public class Persona {
    private final String nombre;
    private final int edad;
    private final String sexo;
    private final int peso;
    private final float altura;

    public Persona(String nombre, int edad, String sexo, int peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public int getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    public float getAltura() {
        return altura;
    }
}
