package modelo;

public class Persona {
	private String nombre;
	private String ciudad;
	private int edad;
	
	//constructor por defecto
	public Persona() {
		
	}

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public Persona(String nombre, String ciudad) {
		this.nombre = nombre;
		this.ciudad = ciudad;
	}

/*
 * 	ESTE CONSTRUCTOR NO ES POSIBLE PORQUE YA TENEMOS UNO QUE RECIBE 2 CADENAS
	public Persona(String ciudad, String nombre) {
		this.ciudad = ciudad;
		this.nombre = nombre;
		
	}
*/
	
	public Persona (String ciudad, String nombre, int edad) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.edad = edad;
	}
}
