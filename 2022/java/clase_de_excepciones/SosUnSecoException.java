package clase_de_excepciones;

public class SosUnSecoException extends Exception {

	private static final long serialVersionUID = 1L;


	public SosUnSecoException(String message) {
		super(message);
		System.out.println(message);
	}

}
