package misAnimales;

public abstract class Animal {
	private String nombre;
	private int edad;
	private int matricula;
	private static int contAnimales=0;
	
	public Animal() {
		super();
		contAnimales++;
	}
	
	public Animal(String nombre) {
		this();
		this.nombre = nombre;
	}
	
	public Animal(String nombre, int edad) {
		this(nombre);
		this.edad = edad;
	}

	public Animal(String nombre, int edad, int matricula) {
		this(nombre, edad);
		this.matricula = matricula;
	}
	

	/* Getters y Setters */
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
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public static int getContAnimales() {
		return contAnimales;
	}

	//Método abstracto (para polimorfismo)
	public abstract void emitirSonido();
	
	
}
