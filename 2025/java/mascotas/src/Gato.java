package mascotas;

/**
 * Sirve para representar un gato
 */
public class Gato extends Animal implements IAdoptable{
	/** El género del gatito */
	private boolean esHembra;
	
	/**
	 * Permite instanciar un Gato con estado inicial por defecto
	 * @author lucy
	 * @version 1
	 */
	public Gato() {

	}

	/**
	 * Permite instanciar un Gato
	 * @param nombre Es el nombre de pila del gatito
	 * @param edad La edad del gatito en años
	 */
	public Gato(String nombre, int edad) {
		super(nombre, edad);
	}

	/**
	 * Obtiene el género del gatito
	 * @return Verdadero si es hembra, falso si es macho
	 */
	public boolean isEsHembra() {
		return esHembra;
	}

	/** Establece el genero del gato
	 * @param esHembra 
	 */
	public void setEsHembra(boolean esHembra) {
		this.esHembra = esHembra;
	}
	
	/**
	 * Emite el sonido del gato
	 */
	@Override
	public void emitirSonido() {
		System.out.println("Miaauu");
	}
	

	@Override
	public void vacunar() {
		System.out.println("TODO: Vacunar a un gato");
	}

	/**
	 * Registra al gato
	 */
	@Override
	public void registrar() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Desparacita al gato
	 */
	@Override
	public void desparacitar() {
		// TODO Auto-generated method stub
	}
	
}
