package guia_jpa_ejercicio_1;

import Entidades.Libro;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class test {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        

        Date fechaPrestamo = new Date();
        Boolean check = false;
        long diaMilisegundos = 24 * 60 * 60 * 1000L;
        long fechaAnteriorMilisegundos = fechaPrestamo.getTime() - diaMilisegundos;
        Date fechaActual = new Date(fechaAnteriorMilisegundos);
//        System.out.println(fechaPrestamo);
//        System.out.println(fechaActual);
        do {
            try {
                System.out.println("Ingrese la fecha de prestamo del libro (dd/mm/aaaa): ");
                String fecha = leer.next();
                fechaPrestamo = formato.parse(fecha);
                System.out.println(fechaPrestamo);
                check = true;
            } catch (ParseException e) {
                System.out.println("El formato de la fecha no es correcto");
            }
            System.out.println(fechaPrestamo.before(fechaActual));
            if (fechaPrestamo.before(fechaActual)) {
                System.out.println("La fecha de prestamo no puede ser menor que la fecha actual");
                check = false;
            }
        } while (!check);

    }
    
//        private Date validarFechaPrestamo() throws ParseException {
//        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
//
//        Date fechaPrestamo = new Date();
//        Boolean check = false;
//        Date fechaActual = new Date();
//        do {
//            try {
//                System.out.println("Ingrese la fecha de prestamo del libro (dd/mm/aaaa): ");
//                String fecha = leer.next();
//                fechaPrestamo = formato.parse(fecha);
//                System.out.println(fechaPrestamo);
//                check = true;
//            } catch (ParseException e) {
//                System.out.println("El formato de la fecha no es correcto");
//            }
//            if (fechaPrestamo.before(fechaActual)) {
//                System.out.println("La fecha de prestamo no puede ser menor que la fecha actual");
//                check = false;
//            }
//        } while (!check);
//
//        return fechaPrestamo;
//    }

}
