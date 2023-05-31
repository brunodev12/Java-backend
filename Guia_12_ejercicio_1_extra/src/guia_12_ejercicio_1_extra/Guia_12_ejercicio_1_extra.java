package guia_12_ejercicio_1_extra;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.Velero;
import Entidades.Yate;
import Servicio.AlquilerServicio;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Guia_12_ejercicio_1_extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AlquilerServicio alService = new AlquilerServicio();
        int opcion;
        ArrayList<Barco> barcos = new ArrayList();

        Velero palomaBlanca = new Velero("ASD345", 7, LocalDate.of(2001, Month.SEPTEMBER, 11), 3);
        BarcoMotor Nicanic = new BarcoMotor(50, "FGT189", 10, LocalDate.of(2005, Month.AUGUST, 15));
        Yate laDoncellaDelMar = new Yate(100, 5, "TEQ341", 15, LocalDate.of(2007, Month.MAY, 17));
        barcos.add(palomaBlanca);
        barcos.add(Nicanic);
        barcos.add(laDoncellaDelMar);

        do {
            System.out.println("-----Menu Alquiler-----");
            System.out.println("Elija el barco que desea alquilar");
            System.out.println("1. Velero \n2. Barco a motor \n3. Yate");
            opcion = leer.nextInt();

        } while (opcion < 1 || opcion > 3);

        System.out.print("Ingrese su nombre: ");
        String nombre = leer.next();
        System.out.print("Ingrese su documento: ");
        int dni = leer.nextInt();
        System.out.println("Ingrese la fecha de inicio del alquiler: ");
        LocalDate fechaInicio = getFecha();
        System.out.println("Ingrese la fecha de finalizacion del alquiler: ");
        LocalDate fechaFin = getFecha();
        System.out.print("Ingrese la posicion del amarre: ");
        int amarre = leer.nextInt();
        Alquiler alquiler = new Alquiler(nombre, dni, fechaInicio, fechaFin, amarre, barcos.get(opcion-1));
        int costoAlquiler = alService.calcularAlquiler(alquiler);
        System.out.println("El costo del alquiler del " + alquiler.getBarco().getClass().getSimpleName() + " es: $" + costoAlquiler);
        
}
    public static LocalDate getFecha() {     
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el dia: ");
        int dia = leer.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = leer.nextInt();
        System.out.print("Ingrese el anio: ");
        int anio = leer.nextInt();
        return LocalDate.of(anio, mes, dia);
    }
}
