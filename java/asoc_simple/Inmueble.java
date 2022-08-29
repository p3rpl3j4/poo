package asoc_simple;

public class Inmueble {
	private String calle;
	private int numero;
	
	
	public Inmueble(String calle, int numero) {
		super();
		this.calle = calle;
		this.numero = numero;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
