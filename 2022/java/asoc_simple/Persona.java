package asoc_simple;

public class Persona {
	private String nombre;
	private String dni;
	
	public Persona(String nombre, String dni) {
		this.setNombre(nombre);
		this.setDni(dni);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}	
}
