public class Perro extends Animal{
	/* Atributos */
	private String nombre;
	private int edad;
	private String genero;
	private float peso;
	private String raza;

	
	/* Constructores de la clase */
	//puedo tener más de un constructor. Es buena práctica que el constructor
	//se encargue de inicializar todos los atributos
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
		System.out.println("Soy un perro y puedo caminar");
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
