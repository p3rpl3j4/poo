package mascotas;

/**
* Clase que representa un Perro.
* Hereda de la clase abstracta Animal.
*/
public class Perro extends Animal implements IAdoptable {
	private String raza;
		
	/** Constructor para la clase Perro. */
	public Perro() {
		super();
	}

	/**
     * Constructor para la clase Perro.
     * Llama al constructor de la superclase (Animal).
     * @param nombre El nombre del perro.
     * @param edad La edad del perro.
     * @param raza La raza del perro.
     */
	public Perro(String nombre, int edad, String raza) {
		super(nombre, edad);
		this.raza = raza;
	}
	
	/**
     * Obtiene la raza del perro.
     * @return La raza del perro.
     */
	public String getRaza() {
		return raza;
	}

	/**
     * Establece una raza para el perro.
     * @param raza La raza del perro.
     */
	public void setRaza(String raza) {
		this.raza = raza;
	}

	/**
	 * Emite el sonido del perro
	 */
	@Override
	public void emitirSonido() {
		System.out.println("Guau guau!");
	}
	
	/**
	 * Vacuna al perro
	 */
	@Override
	public void vacunar() {
		System.out.println("TODO: cómo vacunar a un perro");
	}

	/**
	 * Registra al perro
	 */
	@Override
	public void registrar() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Desparacita al perro
	 */
	@Override
	public void desparacitar() {
		// TODO Auto-generated method stub
	}
}
