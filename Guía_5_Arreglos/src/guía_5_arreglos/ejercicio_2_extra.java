/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía_5_arreglos;

/**
 *
 * @author bruno
 */
public class ejercicio_2_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vectorA = new int[3];
        int[] vectorB = new int[3];
        int n = 0;

        for (int i = 0; i < 3; i++) {
            vectorA[i] = (int) (Math.random() * 2);
            vectorB[i] = (int) (Math.random() * 2);
            if (vectorA[i] != vectorB[i]) {
                break;
            } else {
                n++;
            }
        }
        if (n == 3) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores no son iguales");
        }
    }

}
