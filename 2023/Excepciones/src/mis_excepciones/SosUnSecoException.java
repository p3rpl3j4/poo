package mis_excepciones;

public class SosUnSecoException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;

	public SosUnSecoException(String msg) {
		super();
		this.msg = msg;
	}
	
	public String getMessage() {
		return msg;
	}

	protected void mostrarMensaje() {
		System.out.println(this.msg);
		
	}

}
