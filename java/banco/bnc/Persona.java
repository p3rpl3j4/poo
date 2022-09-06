package bnc;

/**
 * Representa a una persona. 
 * @author lucy
 *
 */
public class Persona {

	/** Nombre de la persona */
	private String nombre;
	/** Apellido de la persona */
	private String apellido;
	/** Tipo de documento de la persona */
	private TipoDocumento tipoDoc;
	/** Número de documento de la persona */
	private int nroDoc;
	

	/** Constructor que setea TODOS los atributos de persona */
	public Persona(String nombre, String apellido, TipoDocumento tipoDoc, int nroDoc) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoDoc = tipoDoc;
		this.nroDoc = nroDoc;
	}

	/**
	 * Permite obtener el nombre de la persona
	 * @return Nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Permite asignar un nombre a la persona
	 * @param nombre El nombre a asignar
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Permite obtener el apellido de la persona
	 * @return apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Permite asignar un apellido a la persona
	 * @param apellido El apellido a asignar
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Permite obtener el tipo de documento de la persona
	 * @return tipoDoc el tipo de documento
	 */
	
	public TipoDocumento getTipoDoc() {
		return tipoDoc;
	}


	/**
	 * Permite asignar un tipo de documento a la persona
	 * @param tipoDoc El tipo a asignar
	 */
	public void setTipoDoc(TipoDocumento tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	/**
	 * Permite obtener el número de documento de la persona
	 * @return número de documento
	 */
	public int getNroDoc() {
		return nroDoc;
	}


	/**
	 * Permite asignar un número de documento a la persona
	 * @param nroDoc El número a asignar
	 */
	public void setNroDoc(int nroDoc) {
		this.nroDoc = nroDoc;
	}
}