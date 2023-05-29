package guia_12_ejercicio_2_3;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class Guia_12_ejercicio_2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        
        for (int i = 0; i < 2; i++) {
            Lavadora lavarropas = new Lavadora();
            Televisor tele = new Televisor();
            lavarropas.crearLavadora();
            tele.crearTelevisor();
            electrodomesticos.add(lavarropas);
            electrodomesticos.add(tele);
        }
        
        int sumaPrecioLavadora=0;
        int sumaPrecioTelevisor=0;
        
        for (Electrodomestico electrodomestico : electrodomesticos) {
             if (electrodomestico instanceof Lavadora) {
                sumaPrecioLavadora+=electrodomestico.getPrecio();
                electrodomestico.mostrarPrecio();
            } else if(electrodomestico instanceof Televisor){
                sumaPrecioTelevisor+=electrodomestico.getPrecio();
                electrodomestico.mostrarPrecio();
            }
        }
        
        System.out.println("La suma total de las lavadoras es: " + sumaPrecioLavadora);
        System.out.println("La suma total de los televisores es: " + sumaPrecioTelevisor);
        System.out.println("La suma total de los electrodomesticos es: " + (sumaPrecioLavadora+sumaPrecioTelevisor));
    }
}
