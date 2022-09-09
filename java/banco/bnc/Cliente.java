package bnc;

public class Cliente extends Persona{
	
	/**
	 * Variable que representa el número de cliente (uno para cada cliente)
	 * Cada vez que se instancia un cliente, esta variable se incrementa
	 */
	private static int numero = 0;
	
	/**
	 * Variable usada para que se acceda al número de cliente
	 */
	private int nro = 0;
	
	
	public Cliente(String nombre) {
		super(nombre);
	}

	
	public Cliente(String nombre, String apellido, TipoDocumento tipoDoc, int nroDoc) {
		super(nombre, apellido, tipoDoc, nroDoc);
		Cliente.numero +=1;
		this.nro = Cliente.numero;
	}

	/**
	 * Mediante este atributo accedo al número de clase 
	 * (para evitar el acceso al atributo static, que es de clase)
	 * @return nro Número de la cuenta
	 */
	public int getNro() {
		return nro;
	}

	
	@Override
	public String toString() {
		return /*this.getTipoDoc()+ */this.getNroDoc()+ this.getNombre() + " " + this.getApellido();//TODO tipo y numero
	}
}