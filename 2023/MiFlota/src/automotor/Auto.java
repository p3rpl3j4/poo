package automotor;

public class Auto extends Vehiculo {
	
	public Auto() {
		super.setMarca("Ford");
	}
	
	public Auto (String marca, String modelo) {
		super.setMarca(marca);
		super.setModelo(modelo);
	}
	
	public void mostrar() {
		super.mostrar();
	}
	
	public void acelerar () {
		System.out.println("RunRunRun desde clase Auto");
	}
}