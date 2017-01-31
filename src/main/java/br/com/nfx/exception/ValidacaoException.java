package br.com.nfx.exception;

import java.util.logging.Logger;

/**
 *
 * @author Fábio Garnica Roberto
 * @since 01/12/2006
 */

public class ValidacaoException extends Exception {
    
    private static final Logger logger = Logger.getLogger(
            "exception.ValidacaoException");
    
    /**
     * Creates a new instance of <code>ServicoException</code> without detail message.
     */
    public ValidacaoException() {
    }
    
    
    /**
     * Constructs an instance of <code>ServicoException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public ValidacaoException(String msg) {
        super(msg);
    }
}
