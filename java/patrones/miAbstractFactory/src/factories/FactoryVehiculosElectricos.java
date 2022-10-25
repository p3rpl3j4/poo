package factories;

import abstracts.AbstractAuto;
import abstracts.AbstractFactoryVehiculo;
import abstracts.AbstractMoto;
import vehiculos.*;

public class FactoryVehiculosElectricos extends AbstractFactoryVehiculo{

	@Override
	public AbstractAuto crearAuto() {
		return new AutoElectrico("Gol Trend", "Volswagen");
	}

	@Override
	public AbstractMoto crearMoto() {
		// TODO Auto-generated method stub
		return new MotoElectrico("CBR", "Honda");
	}

}
