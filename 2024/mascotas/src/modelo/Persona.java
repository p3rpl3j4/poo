package modelo;

public class Persona {
	private String nombre;
	private int edad;
	
	//constructor por defecto
	public Persona() {
		
	}

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	
	public Persona (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
