package guia_13_ejemplos;

import Entidades.Cancion;
import Entidades.EmptySongExceptions;

/**
 *
 * @author bruno
 */
public class prueba {

    /**
     * @param args the command line arguments
     * @throws Entidades.EmptySongExceptions
     */
    public static void main(String[] args) throws EmptySongExceptions {
        // TODO code application logic here

        Cancion cancion = new Cancion("Even Flow", "Pearl Jam");
//        try {
//            cancion.setNombre("");
//        } catch (EmptySongExceptions e) {
//            System.out.println("Ingreso una cadena vacia");
//        }
//        try {
//            System.out.println(cancion.getCanciones(3));
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e);
//            System.out.println("Fuera de rango");
//            try {
//                System.out.println(cancion.getCanciones(2));
//            } catch (ArrayIndexOutOfBoundsException f) {
//                System.out.println("Fuera de rango");
//            }
//        }
        
        System.out.println(cancion.getCanciones(-1));

//ArrayIndexOutOfBoundsException
    }

}
