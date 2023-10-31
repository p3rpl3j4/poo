package singletonObserverJava;

import java.util.Observable;
import java.util.Observer;

public class Cliente extends Persona implements Observer{

	private int numeroCliente;

	public Cliente(String nombre, String apellido) {
		super(nombre, apellido);
	}
	
	public Cliente() {}
	
	
	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public String getNombreCompleto() {
		return this.getNombre() + " " + this.getApellido();
	}

/*	@Override
	public void actualizar(String mensaje) {
		// TODO Auto-generated method stub
		System.out.println(mensaje);
		
	}
*/
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		System.out.println(arg1.toString());
		
	}

}
