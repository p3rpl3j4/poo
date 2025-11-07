package monedasFactory;

public class MonedaDeOro implements Moneda {

	public MonedaDeOro() {
		super();
	}

	@Override
	public void descripcion() {
		System.out.println("Soy MONEDA DE ORO");
	}

}
