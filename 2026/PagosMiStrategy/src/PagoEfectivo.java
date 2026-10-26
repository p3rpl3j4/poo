
public class PagoEfectivo implements PagoStrategy {
	
	public PagoEfectivo(double precio) {
		super();
		this.pago(precio);
	}

	@Override
	public void pago(double precio) {
		System.out.println("Pago en efectivo: " + precio);
	}
}
