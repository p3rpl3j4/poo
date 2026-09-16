package misAnimales;

public class EdadInvalidaException extends Exception {

	private static final long serialVersionUID = 1L;

	public EdadInvalidaException() {
		// TODO Auto-generated constructor stub
	}

	public EdadInvalidaException(String message) {
		super(message);
	}

	public EdadInvalidaException(Throwable cause) {
		super(cause);
	}

	public EdadInvalidaException(String message, Throwable cause) {
		super(message, cause);
	}

	public EdadInvalidaException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public int positivizarEdad(int edad){
		return Math.abs(edad);
	}
	
}
