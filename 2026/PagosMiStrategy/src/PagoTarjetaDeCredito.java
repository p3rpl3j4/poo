
public class PagoTarjetaDeCredito implements PagoStrategy{

	@Override
	public void pago (double precio) {
		System.out.println("Pago con tarjeta de crédito: "+ precio);
	}
}
