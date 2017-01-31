package br.com.nfx.exception;

/**
 * @author Luciano
 */
public class TransmissaoException extends Exception {

    /**
     * Creates a new instance of <code>TransmissaoException</code> without detail message.
     */
    public TransmissaoException() {
    }

    /**
     * Constructs an instance of <code>TransmissaoException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public TransmissaoException(String msg) {
        super(msg);
    }

    /**
     * Creates a new instance of <code>TransmissaoException</code> with the specified cause and a detail
     * message of <tt>(cause==null ? null : cause.toString())</tt>
     * @param cause the cause
     */
    public TransmissaoException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs an instance of <code>TransmissaoException</code> with the specified detail message and cause.
     * @param msg the detail message.
     * @param cause the cause
     */
    public TransmissaoException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
