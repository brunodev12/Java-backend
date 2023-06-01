package guia_12_ejercicio_2_extra;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import Enumeraciones.TipoInstalacion;
import Servicio.EdificioService;
import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class Guia_12_ejercicio_2_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        ArrayList<Edificio> edificiosLista = new ArrayList();
        
        // Caso 1 generando los edificios manualmente
//        EdificioService edifService = new EdificioService();
//        
//        for (int i = 0; i < 4; i++) {
//            Edificio edificio = edifService.crearEdificio();
//            edificiosLista.add(edificio);
//        }
        
        // Caso 2 edificios ya generados
        Polideportivo poli1 = new Polideportivo("Chorifutbol 5", TipoInstalacion.TECHADO, 60, 50, 40);
        Polideportivo poli2 = new Polideportivo("Club Atletico Sacachispas", TipoInstalacion.ABIERTO, 120, 10, 80);
        EdificioDeOficinas edi1 = new EdificioDeOficinas(5, 3, 5, 50, 60, 30);
        EdificioDeOficinas edi2 = new EdificioDeOficinas(10, 5, 12, 70, 140, 60);
        edificiosLista.add(poli1);
        edificiosLista.add(poli2);
        edificiosLista.add(edi1);
        edificiosLista.add(edi2);
        
        
        int techados = 0;
        int abiertos = 0;
        for (Edificio edificio : edificiosLista) {
            System.out.println("------------------------------------------");
            if (edificio instanceof Polideportivo) {
                System.out.print("La superficie del polideportivo: " + ((Polideportivo) edificio).getNombre() + " es " + edificio.calcularSuperficie() + " m2");
                System.out.println(" y su volumen: " + edificio.calcularVolumen() + " m3");
                if (((Polideportivo) edificio).getTipoInstalacion()==TipoInstalacion.TECHADO) {
                    techados++;
                } else {
                    abiertos++;
                }
            } else {
                System.out.print("La superficie del edificio es: " + edificio.calcularSuperficie() + " m2");
                System.out.println(" y su volumen: " + edificio.calcularVolumen() + " m3");
                System.out.println("La cantidad de personas por piso es: " + ((EdificioDeOficinas) edificio).cantPersonasPorPiso());
                System.out.println("La cantidad de personas en el edificio es: " + ((EdificioDeOficinas) edificio).cantPersonasEdificio());
            }
        }
        
        System.out.println("------------------------------------------");
        System.out.println("La cantidad de polideportivos techados es " + techados);
        System.out.println("La cantidad de polideportivos abiertos es " + abiertos);
        
        
        
    }
    
}
