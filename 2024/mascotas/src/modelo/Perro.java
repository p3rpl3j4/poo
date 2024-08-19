package modelo;

public class Perro extends Mascota{
	
	public Perro() {
		
	}

	public Perro(String nombre) {
		this.setNombre(nombre);
	}
	
	public Perro(String nombre, Integer edad) {
		super(nombre, edad);
	}

	@Override
	public void lucirme() {
		// TODO Auto-generated method stub
		//super.lucirme();
		
		System.out.println("GUAU GUAU muevo la cola entusiasmadamente");
	}
	
}