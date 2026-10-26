package mueblesAbstract;

public class FabricaModerna implements FabricaAbstracta {

	
	public FabricaModerna() {
		super();
		System.out.println("Creo una fábrica moderna");
	}

	@Override
	public Silla crearSilla() {
		System.out.println("Fabrico silla Moderna");
		return new SillaModerna();
	}

	@Override
	public Mesa crearMesa() {
		System.out.println("Fabrico mesa Moderna");
		return new MesaModerna();
	}

}
