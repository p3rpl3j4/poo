package miEmpresa;

import java.util.Comparator;
import java.util.Objects;

//el cliente es comparable (compareTo()) y Comparator (compare())
public class Cliente implements Comparable<Cliente>, Comparator<Cliente>{
	String nombre;
	String apellido;
	int codigo;

	public Cliente() {
		super();
	}
	
	public Cliente(String nombre, String apellido, int codigo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.codigo = codigo;
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

	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void suscribir() {
		System.out.println("Cliente suscripto");
	}
	@Override
	public String toString() {
		return "Codigo: " + codigo +" Soy " + apellido + " " + nombre + "" ;
	}

	//Si comento hashCode y Equals, HashSet no va a identificar duplicados
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return codigo == other.codigo;
	}


	//de Comparable
	@Override
	public int compareTo(Cliente o) {
		return this.codigo - o.getCodigo();
	}

	//de Comparator
	@Override
	public int compare(Cliente o1, Cliente o2) {
		return o1.getApellido().compareTo(o2.getApellido());
	}
}
