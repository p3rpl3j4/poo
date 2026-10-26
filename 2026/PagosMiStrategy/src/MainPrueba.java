
public class MainPrueba {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(25000);
		
		PagoStrategy formaPago = new PagoEfectivo(25000);
		
		pedido.setFormaDePago(formaPago);
	}

}
