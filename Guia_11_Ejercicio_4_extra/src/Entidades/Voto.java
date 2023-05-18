package Entidades;

import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class Voto {
    private Alumno alumnoVota;
    private final ArrayList<Alumno> alumnosVoto;

    public Voto(Alumno alumnoVota) {
        this.alumnoVota = alumnoVota;
        alumnosVoto = new ArrayList();
    }

    public Alumno getAlumnoVota() {
        return alumnoVota;
    }

    public void setAlumnoVota(Alumno alumnoVota) {
        this.alumnoVota = alumnoVota;
    }

    public ArrayList<Alumno> getAlumnosVoto() {
        return alumnosVoto;
    }

    public void addAlumnosVoto(Alumno alumnoVoto) {
        if (!alumnosVoto.contains(alumnoVoto)) {
            this.alumnosVoto.add(alumnoVoto);
            alumnoVoto.addVoto();
        }
    }

    @Override
    public String toString() {
        return "Voto{" + "alumno que vota=" + alumnoVota + ", alumnos que votó=" + alumnosVoto + '}';
    }
    
    
}
