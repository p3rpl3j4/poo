package arrayList;

import java.util.Objects;

public class Persona implements Comparable <Persona> {
	private String nombre;
	private String apellido;
	private int edad;

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
		
	
	//heredada de Object, redefino el método
	@Override
	public String toString() {
		return "Nombre=" + nombre + ", Apellido=" + apellido + ", Edad=" + edad;
	}


	//heredada de Object, redefino el método
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}


	//heredada de Object, redefino el método
	//se usa para colecciones que no aceptan duplicados
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Persona) {
			Persona otro = (Persona) obj;
			return this.nombre == otro.nombre && this.apellido == otro.apellido ;
		}
		return false;
	}

	//defino porque implemento interfaz Comparable
	//se usa para establecer un criterio de orden en colecciones de Personas
	@Override
	public int compareTo(Persona o) {
		//Si el criterio de orden es alfabetico por apellido
		//uso el compareTo de clase String
		return this.apellido.compareTo(o.apellido);
		/*//Si el criterio de orden es por edad
		 * if (this.edad == o.edad)
			return 0;
		else
			if (this.edad < o.edad)
				return -1;
			else
				return 1;*/
		/*//También podría ser
		  return this.edad - o.edad
		 */
	}	
}