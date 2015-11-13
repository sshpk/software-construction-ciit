package exceptions;

public class BadNumberException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public BadNumberException(String error) {
		super(error);
	}
}
