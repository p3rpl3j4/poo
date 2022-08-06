public class Perro {
	/* Atributos */
	String nombre;
	int edad;
	String genero;
	float peso;
	String raza;

	
	/* Constructores de la clase */
	public Perro() {
		// TODO Auto-generated constructor stub
	}

	public Perro(String nombre, int edad, String genero, float peso, String raza) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.peso = peso;
		this.raza = raza;
	}

	public Perro(String nombre, String genero) {
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
		System.out.println("Hola, soy un perro, waw");
	}
	
	public void ladrar() {
		System.out.println("wAw WaW wAw");
	}
	
	public int estaEsMiEdad() {
		return this.edad;
	}
}
