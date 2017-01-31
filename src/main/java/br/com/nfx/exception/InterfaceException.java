package br.com.nfx.exception;

/**
 *
 * @author Fabio Garnica Roberto
 * @since 01/12/2006
 */
public class InterfaceException extends Exception {

    /**
     * Creates a new instance of <code>ServicoException</code> without detail message.
     */
    public InterfaceException() {
    }


    /**
     * Constructs an instance of <code>ServicoException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public InterfaceException(String msg) {
        super(msg);
    }

    public InterfaceException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
