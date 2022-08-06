public class Gato {
	/* Atributos */
	String nombre;
	int edad;
	String genero;
	float peso;
	String raza;

	
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
	public void caminar() {
		System.out.println("Falta implementar método caminar");
	}
	
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
}