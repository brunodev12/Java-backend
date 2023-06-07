package Entidades;

/**
 *
 * @author bruno
 */
public class EmptySongExceptions extends Exception{

    /**
     * Creates a new instance of <code>CancionesExceptions</code> without detail
     * message.
     */
    public EmptySongExceptions() {
    }

    /**
     * Constructs an instance of <code>CancionesExceptions</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EmptySongExceptions(String msg) {
        super(msg);
    }
}
