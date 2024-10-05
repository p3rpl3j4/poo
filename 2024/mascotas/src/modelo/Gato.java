package modelo;

public class Gato extends Mascota implements IVacunable{

	public Gato() {
		// TODO Auto-generated constructor stub
	}

	public Gato(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	
	public Gato(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void lucirme() {
		// TODO Auto-generated method stub
		//super.lucirme();
		
		System.out.println("Miauuu, saludo al sol y me llamo " + this.getNombre());
	}

	@Override
	public void vacunar() {
		System.out.println("Gato se vacuna");
	}
	
	
	@Override
	public int compareTo(Mascota m) {
		// TODO Auto-generated method stub
		
		return this.getNombre().compareTo(m.getNombre());
		
	}
	
	@Override
	public int compare(Mascota m1, Mascota m2) {
		int edad1 = m1.getEdad();
		int edad2 = m2.getEdad();
		
		return edad1 - edad2;
	}
}


