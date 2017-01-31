package br.com.nfx.exception;

import java.util.logging.Logger;

/**
 *
 * @author Fábio Garnica Roberto
 */
public class MonitorException extends Exception {
    
    private static final Logger logger = Logger.getLogger(
            "exception.ServicoException");
    
    /**
     * Creates a new instance of <code>MonitorException</code> without detail message.
     */
    public MonitorException() {
    }
    
    
    /**
     * Constructs an instance of <code>MonitorException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public MonitorException(String msg) {
        super(msg);
    }
}
