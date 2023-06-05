package guia_12_ejercicio_4_extra;

import Enumeraciones.Cursos;

/**
 *
 * @author bruno
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Cursos[] cursos = Cursos.values();
        for (int i = 0; i < cursos.length; i++) {
            System.out.println(i + ": " + cursos[i]);
        }
    }
}
