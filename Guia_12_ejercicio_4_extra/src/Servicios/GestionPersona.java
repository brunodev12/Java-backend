package Servicios;

import Entidades.Empleado;
import Entidades.Estudiante;
import Entidades.Persona;
import Entidades.PersonalDeServicio;
import Entidades.Profesor;
import Enumeraciones.Cursos;
import Enumeraciones.EstadoCivil;
import Enumeraciones.Secciones;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class GestionPersona {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cambioEstadoCivil(ArrayList<Persona> personas) {
        System.out.println("Seleccione la persona: ");
        int longitud = personas.size();
        for (int i = 0; i < longitud; i++) {
            System.out.println(i + ":" + personas.get(i).getNombre() + " " + personas.get(i).getApellido());
        }
        int opcionPersona = checkOpcion(longitud);
        Persona persona = personas.get(opcionPersona);
        System.out.println("Persona seleccionada: " + persona.getNombre() + " " + persona.getApellido() + "-" + persona.getEstadoCivil());
        System.out.println("Seleccione el nuevo estado civil: ");
        System.out.println("0. Soltero/a");
        System.out.println("1. Casado/a");
        System.out.println("2. Divorciado/a");
        System.out.println("3. Viudo/a");
        int opcionEstado = checkOpcion(4);

        switch (opcionEstado) {
            case 0:
                persona.setEstadoCivil(EstadoCivil.SOLTERE);
                break;
            case 1:
                persona.setEstadoCivil(EstadoCivil.CASADE);
                break;
            case 2:
                persona.setEstadoCivil(EstadoCivil.DIVORCIADE);
                break;
            case 3:
                persona.setEstadoCivil(EstadoCivil.VIUDE);
                break;
        }
        System.out.println("Datos actualizados: " + persona.getNombre() + " " + persona.getApellido() + "-" + persona.getEstadoCivil());
    }

    public void reasignacionDespacho(ArrayList<Persona> personas) {
        ArrayList<Empleado> empleados = new ArrayList();
        for (Persona per : personas) {
            if (per instanceof Empleado) {
                empleados.add((Empleado) per);
            }
        }
        System.out.println("Seleccione el empleado: ");
        int longitud = empleados.size();
        for (int i = 0; i < longitud; i++) {
            System.out.println(i + ":" + empleados.get(i).getNombre() + " " + empleados.get(i).getApellido());
        }
        int opcionEmpleado = checkOpcion(longitud);
        Empleado empleado = empleados.get(opcionEmpleado);
        System.out.println("Persona seleccionada: " + empleado.getNombre() + " " + empleado.getApellido() + " - Despacho: " + empleado.getNumeroDespacho());
        System.out.println("Ingrese un nuevo despacho: ");
        int nuevoDespacho = leer.nextInt();
        empleado.setNumeroDespacho(nuevoDespacho);
        System.out.println("Datos actualizados: " + empleado.getNombre() + " " + empleado.getApellido() + " - Despacho: " + empleado.getNumeroDespacho());
    }

    public void matriculacionEstudiante(ArrayList<Persona> personas) {
        ArrayList<Estudiante> estudiantes = new ArrayList();
        for (Persona per : personas) {
            if (per instanceof Estudiante) {
                estudiantes.add((Estudiante) per);
            }
        }
        System.out.println("Seleccione el estudiante: ");
        int longitud = estudiantes.size();
        for (int i = 0; i < longitud; i++) {
            System.out.println(i + ":" + estudiantes.get(i).getNombre() + " " + estudiantes.get(i).getApellido());
        }
        int opcionEstudiante = checkOpcion(longitud);
        Estudiante estudiante = estudiantes.get(opcionEstudiante);
        System.out.println("Persona seleccionada: " + estudiante.getNombre() + " " + estudiante.getApellido() + " - Curso: " + estudiante.getCurso());
        System.out.println("Seleccione el nuevo curso: ");

        Cursos[] cursos = Cursos.values();
        for (int i = 0; i < cursos.length; i++) {
            System.out.println(i + ". " + cursos[i]);
        }

        int nuevoCurso = checkOpcion(cursos.length);
        estudiante.setCurso(cursos[nuevoCurso]);
        System.out.println("Datos actualizados: " + estudiante.getNombre() + " " + estudiante.getApellido() + " - Curso: " + estudiante.getCurso());
    }

    public void cambioDepartamento(ArrayList<Persona> personas) {
        ArrayList<Profesor> profesores = new ArrayList();
        for (Persona per : personas) {
            if (per instanceof Profesor) {
                profesores.add((Profesor) per);
            }
        }
        System.out.println("Seleccione el profesor: ");
        int longitud = profesores.size();
        for (int i = 0; i < longitud; i++) {
            System.out.println(i + ":" + profesores.get(i).getNombre() + " " + profesores.get(i).getApellido());
        }
        int opcionProfesor = checkOpcion(longitud);
        Profesor profesor = profesores.get(opcionProfesor);
        System.out.println("Persona seleccionada: " + profesor.getNombre() + " " + profesor.getApellido() + " - Departamento: " + profesor.getDepartamento());
        System.out.println("Seleccione el nuevo departamento: ");

        Cursos[] departamento = Cursos.values();
        for (int i = 0; i < departamento.length; i++) {
            System.out.println(i + ". " + departamento[i]);
        }

        int nuevoDepartamento = checkOpcion(departamento.length);
        profesor.setDepartamento(departamento[nuevoDepartamento]);
        System.out.println("Datos actualizados: " + profesor.getNombre() + " " + profesor.getApellido() + " - Departamento: " + profesor.getDepartamento());
    }

    public void trasladoSeccion(ArrayList<Persona> personas) {
        ArrayList<PersonalDeServicio> personales = new ArrayList();
        for (Persona per : personas) {
            if (per instanceof PersonalDeServicio) {
                personales.add((PersonalDeServicio) per);
            }
        }
        System.out.println("Seleccione el personal de servicio: ");
        int longitud = personales.size();
        for (int i = 0; i < longitud; i++) {
            System.out.println(i + ":" + personales.get(i).getNombre() + " " + personales.get(i).getApellido());
        }
        int opcionPersonal = checkOpcion(longitud);
        PersonalDeServicio personal = personales.get(opcionPersonal);
        System.out.println("Persona seleccionada: " + personal.getNombre() + " " + personal.getApellido() + " - Seccion: " + personal.getSeccion());
        System.out.println("Seleccione la nueva seccion: ");

        Secciones[] secciones = Secciones.values();
        for (int i = 0; i < secciones.length; i++) {
            System.out.println(i + ". " + secciones[i]);
        }

        int nuevaSeccion = checkOpcion(secciones.length);
        personal.setSeccion(secciones[nuevaSeccion]);
        System.out.println("Datos actualizados: " + personal.getNombre() + " " + personal.getApellido() + " - Seccion: " + personal.getSeccion());
    }

    public void mostrarTodaInformacion(ArrayList<Persona> personas) {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    private int checkOpcion(int longitud) {
        int opcion;
        do {
            opcion = leer.nextInt();
            if (opcion < 0 || opcion >= longitud) {
                System.out.println("Opcion invalida, intente de nuevo");
            }
        } while (opcion < 0 || opcion >= longitud);
        return opcion;
    }
}
