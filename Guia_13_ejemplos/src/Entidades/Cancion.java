package Entidades;

/**
 *
 * @author bruno
 */
public class Cancion {

    private String nombre;
    private String autor;
    private String[] canciones = {"Black", "Even Flow", "Everlong"};

    public Cancion(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCanciones(int num) throws ArrayIndexOutOfBoundsException {

        if (num < 0 || num >= canciones.length) {
            throw new ArrayIndexOutOfBoundsException("No se puede papu");
        }

        return canciones[num];
    }

    public void setCanciones(String[] canciones) {
        this.canciones = canciones;
    }

    public void setNombre(String nombre) throws EmptySongExceptions {
        try {
            if (nombre.isEmpty()) {
                System.out.println("Esta vacio");
                throw new EmptySongExceptions("No puede ingresar una cadena vacia");
            }
        } catch (EmptySongExceptions e) {
            throw e;
        } catch (Exception e) {
            throw new EmptySongExceptions("Error de sistema");
        }

        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
