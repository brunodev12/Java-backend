package guia_12_ejercicio_4_extra;

import Entidades.Estudiante;
import Entidades.Persona;
import Entidades.PersonalDeServicio;
import Entidades.Profesor;
import Enumeraciones.Cursos;
import Enumeraciones.EstadoCivil;
import Enumeraciones.Secciones;
import Servicios.GestionPersona;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Guia_12_ejercicio_4_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Persona> personas = new ArrayList();
        GestionPersona gp = new GestionPersona();

        Estudiante est1 = new Estudiante(Cursos.INGLES, "Jorge", "Iglesias", 34712547, EstadoCivil.CASADE);
        Estudiante est2 = new Estudiante(Cursos.QUIMICA, "Bruno", "McCartney", 36712547, EstadoCivil.SOLTERE);
        Profesor prof1 = new Profesor(Cursos.INGLES, LocalDate.of(1998, 4, 12), 3, "Carlos", "Maldonado", 13457145, EstadoCivil.VIUDE);
        Profesor prof2 = new Profesor(Cursos.QUIMICA, LocalDate.of(2020, 8, 5), 19, "Hector", "Lucero", 28945123, EstadoCivil.CASADE);
        PersonalDeServicio ser1 = new PersonalDeServicio(Secciones.BIBLIOTECA, LocalDate.of(1995, 7, 15), 2, "Marta", "Sanchez", 12451321, EstadoCivil.SOLTERE);
        PersonalDeServicio ser2 = new PersonalDeServicio(Secciones.LIMPIEZA, LocalDate.of(2007, 6, 23), 7, "Raul", "Sandoval", 21451321, EstadoCivil.DIVORCIADE);
        personas.add(est1);
        personas.add(est2);
        personas.add(prof1);
        personas.add(prof2);
        personas.add(ser1);
        personas.add(ser2);
        
        int op;

        do {
            System.out.println("- SISTEMA GESTION FACULTAD -");
            System.out.println(" ");
            System.out.println("----- Bienvenido a UTN Rosario -----");
            System.out.println("1. Cambio registro civil persona");
            System.out.println("2. Reasignacion de despacho de empleado");
            System.out.println("3. Matriculacion de estudiante");
            System.out.println("4. Cambio departamento profesor");
            System.out.println("5. Traslado seccion de personal de servicio");
            System.out.println("6. Mostrar informacion de todas las personas de la facultad");
            System.out.println("7. Salir");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    gp.cambioEstadoCivil(personas);
                    break;
                case 2:
                    gp.reasignacionDespacho(personas);
                    break;
                case 3:
                    gp.matriculacionEstudiante(personas);
                    break;
                case 4:
                    gp.cambioDepartamento(personas);
                    break;
                case 5:
                    gp.trasladoSeccion(personas);
                    break;
                case 6:
                    gp.mostrarTodaInformacion(personas);
                    break;
                case 7:
                    System.out.println("Gracias por visitar UTN Rosario! Vuelva prontos");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (op != 7);
    }

}
