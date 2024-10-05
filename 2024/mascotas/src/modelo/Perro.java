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
		System.out.println("Guau Guau muevo la cola y me llamo " + this.getNombre());
	}

	/**
	 * Permite vacunar a un perro
	 * */
	@Override
	public void vacunar() {
		System.out.println("Soy Perro y me vacuno");
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

/*
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Mascota) {
			Mascota m1 = (Mascota) obj;
			return this.getNombre() == m1.getNombre();
		}
		return false;
	}
*/
	
}