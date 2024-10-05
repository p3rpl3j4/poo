package modelo;

public class Tortuga extends Mascota {

	public Tortuga(String nombre) {
		super(nombre);
	}
	
	public Tortuga(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public void lucirme() {
		System.out.println("Voy leeeento... mastico lechuga y me llamo " + this.getNombre());
	}
	
	@Override
	public int compareTo(Mascota m) {		
		return this.getNombre().compareTo(m.getNombre());
	}
	
	@Override
	public int compare(Mascota m1, Mascota m2) {
		int edad1 = m1.getEdad();
		int edad2 = m2.getEdad();
		
		return edad1 - edad2;
	}

}
