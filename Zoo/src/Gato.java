public class Gato extends Animal{
	/* Atributos */
	private String nombre;
	private int edad;
	private String genero;
	private float peso;
	private String raza;

	
	/* Constructores de la clase */
	public Gato() {
		// TODO Auto-generated constructor stub
	}

	public Gato(String nombre, int edad, String genero, float peso, String raza) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.peso = peso;
		this.raza = raza;
	}

	public Gato(String nombre, String genero) {
		this.nombre = nombre;
		this.genero = genero;
	}
	
	
	
	/* Métodos */
		public void comer() {
		System.out.println("Falta implementar método comer");
	}
	
	public void saludar() {
		System.out.println("Hola, soy un gato, miau");
	}
	
	
	/**
	  * @title maullar
	  * @author p3rpl3j4	
	  * @version 1
	  * @param	
	  * @return	
	  * @throws 
	  */
	public void maullar() {
		System.out.println("Michi michi miau");
	}

	/**
	  * @title estaEsMiEdad
	  * @author p3rpl3j4	
	  * @version 1
	  * @param	
	  * @return	edad
	  * @throws 
	  */
	public int estaEsMiEdad() {
		return this.edad;
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
}