package guia_12_ejercicio_3_extra;

import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.ExtraHotel;
import Entidades.Hotel;
import Entidades.Hotel4;
import Entidades.Hotel5;
import Entidades.Residencia;
import Enumeraciones.TipoGimnasio;
import Servicios.AlojamientoService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Guia_12_ejercicio_3_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Alojamiento> alojamientos = new ArrayList();
        AlojamientoService AloService = new AlojamientoService();
        
        Hotel hotel1 = new Hotel4(true, "Don Hector", 20, TipoGimnasio.B, 5, 3, 4, "Los cruces", "Domingo Silva 1358", "San Lorenzo", "Sergio Cardenas");
        Hotel hotel2 = new Hotel5(true, "Wembley", 50, 2, 4, 3, TipoGimnasio.A, 30, 5, 10, "Ros Tower", "Mitre 355", "Rosario", "Mike Tower");
        Hotel hotel3 = new Hotel4(false, "Sarkis", 10, TipoGimnasio.B, 3, 3, 2, "El cairo", "Entre rios 528", "Ceres", "Roberto Carlos");
        Hotel hotel4 = new Hotel5(true, "Manchester", 30, 0, 1, 1, TipoGimnasio.B, 15, 4, 5, "Paradise Inn", "Laprida 2541", "Buenos Aires", "Pulga Rodriguez");
        ExtraHotel extrahotel1 = new Camping(40, 5, true, true, 50000, "Laguna El Cristal", "Estancia La Angelita", "Reconquista", "Marcelo Rossini");
        ExtraHotel extrahotel2 = new Camping(20, 0, false, false, 12000, "Camping de Seros", "Murillo 123", "Rawson", "Pablo Sanchez");
        ExtraHotel extrahotel3 = new Residencia(6, true, true, true, 10000, "Los Olivos", "Ituzaingo 647", "Gobernador Crespo", "Pablo Perez");
        ExtraHotel extrahotel4 = new Residencia(3, false, false, false, 5000, "La Gallega", "Presidente Roca 783", "San Justo", "Daiana Cucaracha Ramirez");
        alojamientos.add(hotel1);
        alojamientos.add(hotel2);
        alojamientos.add(hotel3);
        alojamientos.add(hotel4);
        alojamientos.add(extrahotel1);
        alojamientos.add(extrahotel2);
        alojamientos.add(extrahotel3);
        alojamientos.add(extrahotel4);
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int op;

        do {
            System.out.println("- MENU DE HOSPEDAJES -");
            System.out.println(" ");
            System.out.println("----- Bienvenido a e-Hoteles -----");
            System.out.println("1. Mostrar todos los alojamientos");
            System.out.println("2. Mostrar hoteles de mayor a menor costo");
            System.out.println("3. Mostrar campings con restaurante");
            System.out.println("4. Mostrar residencias con descuento");
            System.out.println("5. Salir");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    AloService.mostrarAlojamientos(alojamientos);
                    break;
                case 2:
                    AloService.mostrarHoteles(alojamientos);
                    break;
                case 3:
                    AloService.campingConRestaurante(alojamientos);
                    break;
                case 4:
                    AloService.mostrarResidenciasDescuento(alojamientos);
                    break;
                case 5:
                    System.out.println("Gracias por elegirnos! Hasta luego.");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (op != 5);
        
        
    }
    
}
