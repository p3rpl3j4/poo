package mascotas;

/**
 * Clase abstracta que representa un animal genérico.
 * Esta clase es la superclase de Perro, Gato y Tortuga, y define los
 * atributos y comportamientos comunes a todos ellos.
 */
public abstract class Animal {
	/** El nombre del animal. */
    private String nombre;
    
    /** La edad del animal. */
    private int edad;

    /** El código único de identificación del animal. 
     * Es un atributo de clase.
     */
    private static int codigo;
	
	/** Constructor de la clase Animal con estado nulo por defecto*/
	public Animal () {
	}

	/**
     * Constructor de la clase Animal.
     * @param nombre El nombre del animal.
     * @param edad La edad del animal.
     */
	public Animal(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		Animal.codigo ++;
	}


	/**
     * Obtiene el nombre del animal.
     * @return El nombre actual del animal.
     */
	public String getNombre () {
		return this.nombre;		
	}

	/**
     * Obtiene la edad del animal.
     * @return La edad actual del animal.
     */
	public int getEdad() {
		return edad;
	}
	
	/**
    * Establece una nueva edad para el animal.
    * @param edad La nueva edad del animal.
    */
	public void setEdad(int edad) {
		this.edad = edad;
	}

    /**
     * Establece un nuevo nombre para el animal.
     * @param nombre El nuevo nombre del animal.
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
     * Obtiene el código único del animal.
     * @return El código actual del animal.
     */
	public int getCodigo() {
		return codigo;
	}

	/**
     * Método abstracto para que cada animal emita un sonido.
     */
	public abstract void emitirSonido();

	@Override
	public String toString() {
		return "Me llamo " + this.nombre + " y tengo " + this.edad + " años";
	}

	
	@Override
	public boolean equals(Object obj) {
		Animal animal = (Animal) obj; //casteo
		return this.nombre == animal.nombre;
	}
}
