package misAnimales;

import java.util.Objects;

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
	
	public void setEdad(int edad) throws EdadInvalidaException{
		if (edad < 0)
			throw new EdadInvalidaException("No se aceptan edades negativas.");
		else
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
	
	public void avanzar() {
		System.out.println("Avanzo caminando en clase Animal");
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}
/*
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		//casteo object a Animal (convierto)
		Animal other = (Animal) obj; //casteo - casting
		return this.matricula == other.matricula;
	}
	*/

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Animal) {
			Animal a = (Animal) obj;
			return this.matricula == a.matricula;
		}
		return false;
	}
	
	//sobrecarga
	public boolean equals(Animal a) {
		return this.matricula == a.matricula;
		
	}
}
