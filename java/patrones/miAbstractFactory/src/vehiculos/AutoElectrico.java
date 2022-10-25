package vehiculos;

import abstracts.AbstractAuto;

public class AutoElectrico extends AbstractAuto {

	public AutoElectrico(String modelo, String marca) {
		super(modelo, marca);
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Soy auto electrico: " + this.getMarca() +" - " +this.getModelo());
	}
}
