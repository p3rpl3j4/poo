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
		
		System.out.println("Miauuu, saludo al sol");
	}

	@Override
	public void vacunar() {
		System.out.println("Gato se vacuna");
	}

}


