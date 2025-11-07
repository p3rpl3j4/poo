package monedasFactory;

public class MonedaDePlata implements Moneda {

	public MonedaDePlata() {
		super();
	}

	@Override
	public void descripcion() {
		System.out.println("Soy MONEDA DE PLATA");
	}

}
