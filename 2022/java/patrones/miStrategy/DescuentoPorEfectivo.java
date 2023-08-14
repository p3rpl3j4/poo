package miStrategy;

public class DescuentoPorEfectivo extends CuponDescuento {

	@Override
	public void calcularDescuento() {
		System.out.println("Descuento por pago efectivo: 20%");
	}

}
