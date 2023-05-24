package guia_12_ejercicio_2;

import Entidades.Lavadora;
import Entidades.Televisor;

/**
 *
 * @author bruno
 */
public class Guia_12_ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lavadora lavarropas = new Lavadora();
        Televisor tele = new Televisor();
        
        lavarropas.crearLavadora();
        tele.crearTelevisor();
        
        System.out.println(lavarropas);
        System.out.println(tele);
        
    }
    
}
