// Mildness Akomoize

package org.howard.edu.lsp.assignment6;

/**
 * Custom exception class for IntegerSet operations.
 * This exception is thrown when an operation on an IntegerSet cannot be performed
 * due to invalid state or input.
 */
public class IntegerSetException extends Exception {
    /**
     * Serialization version UID.
     */
	private static final long serialVersionUID = 1L;
	    /**
     * Constructs a new IntegerSetException with the specified detail message.
     * 
     * @param message the detail message (which is saved for later retrieval by the getMessage() method)
     */
	public IntegerSetException(String message) {
	super(message);
	}
}