package mueblesAbstract;

public class MainPrueba {

	public static void main(String[] args) {
		FabricaAbstracta fabrica = new FabricaAntigua();
		
		Mesa mesa = fabrica.crearMesa();
		Silla silla = fabrica.crearSilla();
		
		fabrica = new FabricaModerna();
		mesa = fabrica.crearMesa();
		silla = fabrica.crearSilla();
		
	}

}
