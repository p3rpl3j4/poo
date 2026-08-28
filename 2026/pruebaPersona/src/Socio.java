package pruebaPersona;

public class Socio extends Persona {
	private int numeroSocio;

	
	public Socio() {
		super(); //invoca al constructor de la superclase (Persona) que no tiene parámetros
	}
	

	public Socio(String nombre, String apellido) {
		super (nombre, apellido); //invoca al constructor de la superclase (Persona) que tiene 2 parámetros String (nombre y apellido)
	}

	public Socio(String nombre, String apellido, int numeroSocio) {
		this (nombre, apellido); //invoca al constructor de la superclase (Persona) que tiene 2 parámetros String (nombre y apellido)
		this.numeroSocio = numeroSocio;
	}

	/* Getters y Setters */
	public int getNumeroSocio() {
		return numeroSocio;
	}

	public void setNumeroSocio(int numeroSocio) {
		this.numeroSocio = numeroSocio;
	}

}
