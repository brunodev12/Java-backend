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
public class ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] vector = new int[20];
        int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10000);
        }

        for (int elemento : vector) {
            System.out.println(elemento);
        }

        for (int elemento : vector) {
            String _elemento = Integer.toString(elemento);
            switch (_elemento.length()) {
                case 1:
                    d1++;
                    break;
                case 2:
                    d2++;
                    break;
                case 3:
                    d3++;
                    break;
                case 4:
                    d4++;
                    break;
                case 5:
                    d5++;
                    break;
            }
        }

        System.out.println("Números de 1 dígito: " + d1);
        System.out.println("Números de 2 dígito " + d2);
        System.out.println("Números de 3 dígito " + d3);
        System.out.println("Números de 4 dígito " + d4);
        System.out.println("Números de 5 dígito " + d5);
    }
}
