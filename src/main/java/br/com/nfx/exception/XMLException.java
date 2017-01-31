package br.com.nfx.exception;


/**
 *
 * @author Fábio Garnica Roberto
 */

public class XMLException extends java.lang.Exception {

    /**
     * Creates a new instance of <code>ServicoException</code> without detail message.
     */
    public XMLException() {
    }
    
    
    /**
     * Constructs an instance of <code>ServicoException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public XMLException(String msg) {
        super(msg);
    }

      public XMLException(String msg, Throwable causa) {
        super(msg, causa);
    }
}
