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
public class ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la matriz");
        int n = leer.nextInt();
        int valorInicial, resultado, contador = 1;
        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese el valor de la posicion " + "(" + i + "," + j + ")");
                matriz[i][j] = leer.nextInt();
            }
        }

        valorInicial = sumaFilas(matriz, n, 0);
        System.out.println("La suma de la fila 0 es " + valorInicial);
        for (int i = 1; i < n; i++) {
            resultado = sumaFilas(matriz, n, i);
            //System.out.println("La suma de la fila " + i + " es " + resultado);
            if (resultado == valorInicial) {
                contador++;
            }
        }

        for (int j = 0; j < n; j++) {
            resultado = sumaColumnas(matriz, n, j);
            //System.out.println("La suma de la columna " + j + " es " + resultado);
            if (resultado == valorInicial) {
                contador++;
            }
        }

        resultado = sumaDiagonal(matriz, n);
        if (resultado == valorInicial) {
            contador++;
        }

        resultado = sumaDiagonalInv(matriz, n);
        if (resultado == valorInicial) {
            contador++;
        }

        if (contador == n + n + 2) {
            System.out.println("La matriz es mágica");
        } else {
            System.out.println("La matriz no es mágica");
        }

        //System.out.println(contador);
    }

    public static int sumaFilas(int[][] _matriz, int n, int fila) {
        int valor = 0;
        for (int j = 0; j < n; j++) {
            valor += _matriz[fila][j];
        }
        return valor;
    }

    public static int sumaColumnas(int[][] _matriz, int n, int columna) {
        int valor = 0;
        for (int i = 0; i < n; i++) {
            valor += _matriz[i][columna];
        }
        return valor;
    }

    public static int sumaDiagonal(int[][] _matriz, int n) {
        int valor = 0;
        for (int i = 0; i < n; i++) {
            valor += _matriz[i][i];
        }
        return valor;
    }

    public static int sumaDiagonalInv(int[][] _matriz, int n) {
        int valor = 0, j = 0;
        for (int i = n - 1; i >= 0; i--) {
            valor += _matriz[i][j];
            j++;
        }
        return valor;
    }
}
