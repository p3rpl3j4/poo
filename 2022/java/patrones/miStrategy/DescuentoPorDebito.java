package miStrategy;

public class DescuentoPorDebito extends CuponDescuento {

	@Override
	public void calcularDescuento() {
		System.out.println("Descuento por pago Debito: 10%");
	}

}
