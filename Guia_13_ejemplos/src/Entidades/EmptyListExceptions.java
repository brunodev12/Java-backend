package Entidades;

/**
 *
 * @author bruno
 */
public class EmptyListExceptions extends Exception{

    /**
     * Creates a new instance of <code>EmptyListExceptions</code> without detail
     * message.
     */
    public EmptyListExceptions() {
    }

    /**
     * Constructs an instance of <code>EmptyListExceptions</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EmptyListExceptions(String msg) {
        super(msg);
    }
}
