package modelo;

public class Perro {
	private String nombre;
	private Integer edad;
	public String raza;
//	public Persona duenio;
	
	public Perro() {

	}

	public Perro(String nombre) {
		this.nombre = nombre;
	}

	
	public Perro(String nombre, Integer edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//HACER LOS METODOS
	
}