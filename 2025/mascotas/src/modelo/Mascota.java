package modelo;

public class Mascota {
	private String nombre;
	private int edad;
	private Persona adoptante;
	
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
		// TODO Auto-generated method stub
		return "me llamo " + this.nombre + " y tengo " + this.edad + this.getClass().getName();
		
		
	}
	
	
}
