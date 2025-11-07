package pagosStrategy;

public class Pedido {
	private double precio;
	private PagoStrategy formaPago;
	
	public Pedido(double precio) {
		this.precio = precio;
	}
	
	public Pedido(double precio, PagoStrategy pago) {
		this.precio = precio;
		this.formaPago = pago;
	}

	public void setStrategy (PagoStrategy pago) {
		this.formaPago = pago;
	}
	
	public void procesarPago(double precio) {
		if (formaPago != null)
			formaPago.pago(precio);
		else
			System.out.println("No se puede procesar el pago. Elija forma de pago ");
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
