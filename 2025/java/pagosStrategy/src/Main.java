package pagosStrategy;

public class Main {

	public static void main(String[] args) {
		//Puedo instanciar el pedido y en ese momento setear forma de pago:
		Pedido miPedido = new Pedido(45000, new PagoCredito());
		
		
		//Puedo instanciar el pedido sin una forma de pago y luego setear la estrategia de pago
		//Pedido miPedido = new Pedido(45000);
		//miPedido.setStrategy(new PagoCredito());
		
		miPedido.procesarPago(45000);
	}
}
