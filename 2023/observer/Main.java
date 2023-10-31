package observer;

public class Main {

	public static void main(String[] args) {
		
		BancoSingleton b = BancoSingleton.getInstance();
		b.setDomicilio("Mitre 655");
		
		
		Cliente juan = new Cliente("Juan", "Perez");
		
		CajaAhorro ca = new CajaAhorro();
		ca.setCliente(juan);
	
		
		ca.depositar(45000);
		System.out.println("Saldo: " + ca.getSaldo());
		
		ca.extraer(juan, 890);		
		System.out.println("Saldo: " + ca.getSaldo());
	}

}
