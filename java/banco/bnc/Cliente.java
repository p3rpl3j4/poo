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

	//como recibe un Object, lo convierto al tipo de objeto que 
	//yo deseo trabajar.
	/**
	 * Compara si el objeto es igual a uno recibido como parámetro
	 * @param obj Objeto contra el que se va a comparar el objeto
	 * @return Retorna verdadero si el tipo y numero de documento del parámtro 
	 * es igual al tipo y número de documento del objeto sobre el que se aplica el método.
	 */
	@Override
	public boolean equals(Object obj) {
		Cliente c;
		if (obj instanceof Cliente ) {
			c = (Cliente) obj;
			return this.getTipoDoc() == c.getTipoDoc() && this.getNroDoc() == c.getNroDoc();
		}
		return false;
	}
}