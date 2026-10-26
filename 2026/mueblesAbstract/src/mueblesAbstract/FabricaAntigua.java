package mueblesAbstract;

public class FabricaAntigua implements FabricaAbstracta {

	public FabricaAntigua() {
		super();
		System.out.println("Creo una fábrica antigua");
	}

	@Override
	public Silla crearSilla() {
		System.out.println("Fabrico silla Antigua");

		return new SillaAntigua();
	}

	@Override
	public Mesa crearMesa() {
		System.out.println("Fabrico mesa Antigua");
		return new MesaAntigua();
	}

}
