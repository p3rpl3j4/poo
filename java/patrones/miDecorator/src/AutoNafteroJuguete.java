package miDecorator;

public class AutoNafteroJuguete extends AutoDecorador {

	public AutoNafteroJuguete(Auto auto) {
		super(auto);
	}

	@Override
	public void arracar() {
		this.getAuto().arracar();
		System.out.println("NAFTERO JUGUETE: arrancar");
	}

	@Override
	public void frenar() {
		this.getAuto().frenar();
		System.out.println("NAFTERO AutoNaftero: frenar");

	}

	@Override
	public void acelerar() {
		this.getAuto().acelerar();
		System.out.println("NAFTERO AutoNaftero: acelerar");
	}

}
