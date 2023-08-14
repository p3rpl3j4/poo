package colecciones;

import java.util.Objects;

//public class Persona implements Comparable <Persona>, Comparator<Persona> {
public class Persona {
	String nombre;
	String apellido;
	int edad;

	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}





	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
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
		this.edad = edad;
	}
	
	
	
	

	@Override
	public String toString() {
		return "Nombre=" + nombre + ", Apellido=" + apellido + ", Edad=" + edad;
	}





	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}



	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Persona) {
			Persona otro = (Persona) obj;
			return otro.nombre == this.nombre;
		}
		return false;
	}
	
	
	/*
	 * public 	int compareTo (Persona p){
	 * 	return this.edad - p.edad;
	 * 
	 * 
	 * }
	 * 
	 * 
	 * */
	
}