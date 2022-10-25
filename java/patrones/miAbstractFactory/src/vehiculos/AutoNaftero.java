package vehiculos;

import abstracts.AbstractAuto;

public class AutoNaftero extends AbstractAuto {

	public AutoNaftero(String modelo, String marca) {
		super(modelo, marca);
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Soy auto naftero: " + this.getMarca() +" - " +this.getModelo());
	}
}
