package pagosStrategy;

public class PagoEfectivo implements PagoStrategy {

	public PagoEfectivo() {
		
	}

	@Override
	public void pago(double importe) {
		System.out.println("Implementación de pago en efectivo: $" + importe);
	}

}
