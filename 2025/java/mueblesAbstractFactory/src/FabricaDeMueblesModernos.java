package muebles;

public class FabricaDeMueblesModernos implements FabricaDeMuebles{

	
	public FabricaDeMueblesModernos() {
		super();
	}

	@Override
	public Silla createSilla() {
		System.out.println("Yo fabrico sillas modernas");
		return new SillaModerna();
	}

	@Override
	public Sillon createSillon() {
		System.out.println("Yo fabrico sillones modernos");
		return new SillonModerno();
	}

}
