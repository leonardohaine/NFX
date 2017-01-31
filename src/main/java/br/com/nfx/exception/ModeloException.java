package br.com.nfx.exception;

import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */

public class ModeloException extends Exception{
    
    private static final Logger logger = Logger.getLogger(ModeloException.class.getName());
    
    /** Creates a new instance of ModeloException */
    public ModeloException(String msg) {
        super(msg, null);
    }
    
    public ModeloException(String msg, Throwable cause){
        super(msg,cause);
    }    
}