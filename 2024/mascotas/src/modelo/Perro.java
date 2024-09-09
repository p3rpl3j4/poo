package modelo;

/**
 * Esta clase sirve representar un perro.
 * */
public class Perro extends Mascota implements IVacunable{
	
	/**
	 * Constructor de clase Perro
	 * */
	public Perro() {
		
	}


	/**
	 * Constructor de clase Perro
	 * @param nombre Nombre de pila del perro
	 * */
	public Perro(String nombre) {
		this.setNombre(nombre);
	}
	
	
	/**
	 * Constructor de clase Perro
	 * @param nombre Nombre de pila del perro
	 * @param edad Edad en años del perro
	 * */
	public Perro(String nombre, Integer edad) {
		super(nombre, edad);
	}

	
	/**
	 * Permite a un perro lucirse
	 * */
	@Override
	public void lucirme() {
		// TODO Auto-generated method stub
		//super.lucirme();
		
		System.out.println("GUAU GUAU muevo la cola entusiasmadamente");
	}

	/**
	 * Permite vacunar a un perro
	 * */
	@Override
	public void vacunar() {
		System.out.println("Soy Perro y me vacuno");
	}

}