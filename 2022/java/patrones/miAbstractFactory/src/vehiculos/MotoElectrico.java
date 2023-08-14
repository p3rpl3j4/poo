package vehiculos;

import abstracts.AbstractMoto;

public class MotoElectrico extends AbstractMoto {

	public MotoElectrico(String modelo, String marca) {
		super(modelo, marca);
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Soy moto electrico: " + this.getMarca() +" - " +this.getModelo());
	}
}
