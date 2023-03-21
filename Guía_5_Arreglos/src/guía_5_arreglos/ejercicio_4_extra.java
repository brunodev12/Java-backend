/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía_5_arreglos;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class ejercicio_4_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double notaTP1, notaTP2, parcial1, parcial2,resultado;
        
        double[] notas = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("=================== Alumno " + i + " ================================");
            System.out.println("Ingrese la nota del primer trabajo práctico evaluativo: ");
            notaTP1 = nota();
            System.out.println("Ingrese la nota del segundo trabajo práctico evaluativo: ");
            notaTP2 = nota();
            System.out.println("Ingrese la nota del primer integrador");
            parcial1 = nota();
            System.out.println("Ingrese la nota del segundo integrador");
            parcial2 = nota();
            
            notas[i]= (notaTP1*0.1) + (notaTP2*0.15) + (parcial1*0.25) + (parcial2*0.5);
        }
        
        for (int i = 0; i < 10; i++) {
            if (notas[i]>=7) {
                System.out.println("El alumno " + i + " aprobó con " + notas[i]);
            } else{
                System.out.println("El alumno " + i + " no aprobó");}
        }
    }

    public static int nota() {
        int nota;
        
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("La nota debe estar entre 0 y 10");
            nota = leer.nextInt();
            //nota = (int)(Math.random()*10);
        } while (nota<0 || nota >10);
        
        return nota;
    }

}
