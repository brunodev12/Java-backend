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
public class Empleado {
    private final String nombre;
    private int edad;
    private int salario;

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(int salario) {
        this.salario = salario;
        System.out.println("Salario actualizado");
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getSalario() {
        return salario;
    }
    
    public void calcularAumento(){
        if (edad > 30) {
            System.out.println("El aumento del empleado debe ser del 10% ( $" + (salario*1.1) + " )");
        } else {
            System.out.println("El aumento del empleado debe ser del 5% ( $" + (salario*1.05) + " )");
        }
    }
}
