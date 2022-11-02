package miDecorator;

public class AutoNaftero extends AutoDecorador {

	public AutoNaftero(Auto auto) {
		super(auto);
	}

	@Override
	public void arracar() {
		this.getAuto().arracar();
		System.out.println("NAFTERO: arrancar");
	}

	@Override
	public void frenar() {
		this.getAuto().frenar();
		System.out.println("NAFTERO: frenar");

	}

	@Override
	public void acelerar() {
		this.getAuto().acelerar();

		System.out.println("NAFTERO: acelerar");

	}

}
