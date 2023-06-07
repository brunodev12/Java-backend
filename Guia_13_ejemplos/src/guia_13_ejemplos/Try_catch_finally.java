package guia_13_ejemplos;

/**
 *
 * @author bruno
 */
public class Try_catch_finally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            int valor1 = Integer.valueOf("a");
            System.out.println("EL numero indicado es: " + valor1);
        } catch (NumberFormatException e) {
            System.out.println("El valor indicado no es un numero");
            System.out.println(e);
        }

        try {
            int valor1 = Integer.valueOf("a");
            System.out.println("EL numero indicado es: " + valor1);
        } catch (Exception e) {
            System.out.println("El valor indicado no es un numero");
            System.out.println(e);
        }

        try {
            int valor1 = Integer.valueOf("a");
            System.out.println("EL numero indicado es: " + valor1);
        } catch (NumberFormatException e) {
            System.out.println("El valor indicado no es un numero - capturado con NumberFormatException");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("El valor indicado no es un numero - capturado con Exception");
            System.out.println(e);
        } finally{
            int valor1 = 7;
            System.out.println("El numero indicado es: " + valor1);
        }

    }

}
