/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_poo;

import guia_7_poo.newpackage.Empleado;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Ejercicio_6_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = leer.nextLine();
        System.out.print("Ingrese la edad del empleado: ");
        int edad = leer.nextInt();
        System.out.print("Ingrese el salario del empleado: ");
        int salario = leer.nextInt();
        
        Empleado worker = new Empleado(nombre, edad, salario);
        
        worker.calcularAumento();
        
        System.out.println("Ingrese el nuevo salario:");
        worker.setSalario(leer.nextInt());
        
        System.out.println("El nuevo salario del empleado es: $" + worker.getSalario());
    }
    
}
