package modelo;

//comentario de linea

/* Comentario de bloque
 * adfsdfsdf
 * sdfsdfsdf
 * 
 * */


/**
 * 
 * */

public abstract class Mascota {
	/** Representa el nombre de la mascota*/
	private String nombre;
	
	/** Edad en años de la mascota */
	private int edad;
	
	/** Persona que adopta la mascota */
	private Persona adoptante;
	
	
	//Si bien no puedo instanciar objetos Mascota, tengo constructores para invocar 
	//en los constructores de las subclases de Mascota
	
	/** Constructor de clase Mascota. Sin parámetros*/
	public Mascota() {
	}

	/** Constructor de clase Mascota. Sin parámetros
	 * @param nombre Es el nombre de pila de la mascota
	 * */
	public Mascota(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Constructor de clase Mascota
	 * @param nombre Nombre de pila de la mascota
	 * @param edad Edad en años de la mascota
	 * */
	public Mascota(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	/**
	 * Método para obtener un nombre de mascota
	 * @return String nombre de la mascota
	 * @author lucy
	 * */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Persona getAdoptante() {
		return adoptante;
	}

	public void setAdoptante(Persona adoptante) {
		this.adoptante = adoptante;
	}

	@Override
	public String toString() {
		return "Me llamo " + this.nombre + " y tengo " + this.edad +  " años. Soy de clase " + this.getClass().getName();
	}

	//este método se implementará en las subclases
	public abstract void lucirme();
	
}
