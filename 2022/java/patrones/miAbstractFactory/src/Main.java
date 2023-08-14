import abstracts.AbstractAuto;
import abstracts.AbstractFactoryVehiculo;
import abstracts.AbstractMoto;
import factories.FactoryVehiculosElectricos;
import factories.FactoryVehiculosNafteros;

public class Main {

	public static void main(String[] args) {
		AbstractFactoryVehiculo miFabricaNafteros = new FactoryVehiculosNafteros();
	//	AbstractFactoryVehiculo miFabricaElectricos = new FactoryVehiculosElectricos();
		AbstractAuto miAuto = miFabrica.crearAuto();
		miAuto.mostrarCaracteristicas();
		
		
		AbstractMoto miMoto = miFabrica.crearMoto();
		miMoto.mostrarCaracteristicas();
	}

}
