package proyectoMap;

public class Estudiante {
	private String nombre;
	private String legajo;
	private double promedio;
	
	
	public Estudiante(String nombre, String legajo) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getLegajo() {
		return legajo;
	}


	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}


	public double getPromedio() {
		return promedio;
	}


	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}


	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", legajo=" + legajo + ", promedio=" + promedio + "]";
	}
	
}
