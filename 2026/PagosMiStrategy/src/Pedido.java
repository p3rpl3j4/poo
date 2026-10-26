
public class Pedido {
	private double precio;
	private PagoStrategy formaDePago;
	
	
	public Pedido(double precio) {
		this.precio = precio;
	}

	public void setFormaDePago(PagoStrategy formaDePago) {
		this.formaDePago = formaDePago;
	}
	
	public void procesarPago() {
		if (this.formaDePago != null )
			formaDePago.pago(this.precio);	
		else //acá se podría lanzar una excepción. (también puedp setear una forma de pago por defecto al declarar el atributo)
			System.out.println("Hay que setear una forma de pago");
	}
}
