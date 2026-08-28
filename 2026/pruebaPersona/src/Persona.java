package pruebaPersona;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private double dni;
	
	//Atributo DE CLASE (todas las clases comparten el mismo valor
	private static int cantPersonas = 0;
	
	
	/* Constructores */
	public Persona() {
		cantPersonas++;
		this.setDni(cantPersonas);
	}
	
	public Persona(String nombre, String apellido) {
		this(); //invoca al constructor de esta clase, que no tiene parámetros
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Persona(String apellido, String nombre, int edad) {
		this (nombre, apellido); //invoca al constructor de esta clase, cuyos parámetros son 2 cadenas (nombre y apellido)
		this.edad = edad;
	}

	public double getDni() {
		return dni;
	}

	public void setDni(double dni) {
		this.dni = dni;
	}
	
	
	/* El contructor anterior, es equivalente a este:
		public Persona(String apellido, String nombre, int edad) {
			cantPersonas++;
			this.dni = cantPersonas;
			this.nombre = nombre;
			this.apellido = apellido;
			this.edad = edad;
		}
	*/
	
	//Métodos DE CLASE. Sirven para manipular el atributo de clase
	public static int getCantPersonas() {
		return cantPersonas;
	}

	public static void setCantPersonas(int cantPersonas) {
		Persona.cantPersonas = cantPersonas;
	}


	/* Getters y Setters */
	public String getNombre () {
		return this.nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad > 0) //valido que no reciba una edad negativa
			this.edad = edad;
	}

	public void saludar() {
		System.out.println("Hola mundo " + "yo soy " + this.nombre 
				           + " " + this.apellido + " y tengo " + this.edad + " años");
	}
}
