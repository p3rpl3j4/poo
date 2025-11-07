package pagosStrategy;

public class PagoCredito implements PagoStrategy {

	public PagoCredito() {
	}

	@Override
	public void pago(double importe) {
		System.out.println("Pago con tarjeta de crédito: $" + importe);
	}

}
