
public class SosUnSecoException extends Exception {

	private static final long serialVersionUID = 1L;

	public SosUnSecoException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return "Saldo insuficiente";
	}
	
	
	

}
