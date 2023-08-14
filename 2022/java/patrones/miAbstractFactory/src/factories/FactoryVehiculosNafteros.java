package factories;

import abstracts.AbstractAuto;
import abstracts.AbstractFactoryVehiculo;
import abstracts.AbstractMoto;
import vehiculos.*;

public class FactoryVehiculosNafteros extends AbstractFactoryVehiculo{

	@Override
	public AbstractAuto crearAuto() {
		return new AutoNaftero("Smart", "Tesla");
	}

	@Override
	public AbstractMoto crearMoto() {
		// TODO Auto-generated method stub
		return new MotoNaftero("ScooterPRO", "GILERA");
	}

}
