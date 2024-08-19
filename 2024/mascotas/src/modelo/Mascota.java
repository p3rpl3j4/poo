package modelo;

public abstract class Mascota {
	private String nombre;
	private int edad;
	private Persona adoptante;
	
	
	//Si bien no puedo instanciar objetos Mascota, tengo constructores para invocar 
	//en los constructores de las subclases de Mascota
	public Mascota() {
	}

	public Mascota(String nombre) {
		this.nombre = nombre;
	}

	public Mascota(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

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
