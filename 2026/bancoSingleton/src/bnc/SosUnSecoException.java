package bnc;
import java.lang.Exception;

/**
 * Representa la excepción 
 * @author lucy
 * 
 */
public class SosUnSecoException extends Exception {
	private static final long serialVersionUID = 1L;

	/**
	 * Mensaje de la excepción
	 */
	private String mensaje;
	
	/**
	 * Permite instanciar un objeto de tipo SosUnSecoException
	 * @param string Mensaje con el que se crea la excepción
	 */
	public SosUnSecoException(String string) {
		this.setMensaje(string);
	}

	/**
	 * Permite obtener el mensaje asociado a la excepción
	 * @return Mensaje con el que se instanció la excepción
	 */
	public String getMensaje() {
		return mensaje;
	}

	
	/**
	 * Permite setear un mensaje a la excepción
	 * @param mensaje Mensaje a utilizar
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
