package miStrategy;

public class DescuentoPorBitcoin extends CuponDescuento {

	@Override
	public void calcularDescuento() {
		System.out.println("Descuento por pago bitcoin: 30%");
	}

}
