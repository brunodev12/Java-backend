package guia_13_ejemplos;

import Entidades.DivisionNumero;
import java.util.Scanner;

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

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        DivisionNumero divNumero = new DivisionNumero();
        int error;
        float resultado = 0;
        do {
            System.out.print("Ingrese el primer numero: ");
            String A = leer.next();
            System.out.print("Ingrese el segundo numero: ");
            String B = leer.next();
            
            
            try {
                resultado = divNumero.division(A, B);
                error = 0;
            } catch (NumberFormatException e){
                error = 1;
            }

        } while (error == 1);
        
        System.out.println(resultado);

    }
}
