package vehiculos;

import abstracts.AbstractMoto;

public class MotoNaftero extends AbstractMoto {

	public MotoNaftero(String modelo, String marca) {
		super(modelo, marca);
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Soy moto naftero: " + this.getMarca() +" - " +this.getModelo());
	}
}
