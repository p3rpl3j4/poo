package asoc_simple;

public class Empleado extends Persona{

	private int legajo;
	
	public Empleado(String nombre, String dni) {
		super(nombre, dni);
	}
	
	public Empleado(String nombre, String dni, int legajo) {
		super(nombre, dni);
		this.legajo = 6097;
	}

}
