package muebles;

public class FabricaDeMueblesAntiguos implements FabricaDeMuebles {

	@Override
	public Silla createSilla() {
		System.out.println("Yo fabrico sillas antiguas");

		return new SillaAntigua();
	}

	public FabricaDeMueblesAntiguos() {
		super();
	}

	@Override
	public Sillon createSillon() {
		System.out.println("Yo fabrico sillones antiguos");
		return new SillonAntiguo();
	}
	

}
