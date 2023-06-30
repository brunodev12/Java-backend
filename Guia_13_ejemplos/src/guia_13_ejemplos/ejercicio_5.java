package guia_13_ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int numAleatorio = (int) (Math.random() * 500 + 1);
        int num = 0;
        int i = 0;
        do {
            System.out.println("Adivine el numero secreto");

            try {
                num = leer.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un numero");
                leer.nextLine();
            }

            i++;
            System.out.println("Intentos: " + i);
            if (num == numAleatorio) {
                System.out.println("Has encontrado el numero secreto");

            } else if (num < numAleatorio) {
                System.out.println("El numero a encontrar es mayor al indicado");

            } else {
                System.out.println("El numero a encontrar es menor al indicado");
            }
        } while (num != numAleatorio);

        System.out.println("cantidad de intentos: " + i);
    }
    
}
