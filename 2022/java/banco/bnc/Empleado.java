package bnc;

public class Empleado extends Persona {
	
	private String cargo;

	public Empleado(String nombre, String apellido, TipoDocumento tipoDoc, int nroDoc, String cargo) {
		super(nombre, apellido, tipoDoc, nroDoc);
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}
	
	
}
