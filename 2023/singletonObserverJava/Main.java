package singletonObserverJava;

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

/*
		CuentaBancaria ctas[] = b1.getCuentasBancaras();
		
		
		BancoSingleton b2 = BancoSingleton.getInstance();
		
		System.out.println(b2.getDomicilio());
	
		
		Cliente juan = new Cliente("Juan", "Perez");
		Cliente pedro = new Cliente("Pedro", "Martinez");
		
		CajaAhorro cajaAhorro1 = new CajaAhorro();

		CajaAhorroSocial cajaAhorro2 = new CajaAhorroSocial();
		
		CuentaCorriente cuentaCorriente = new CuentaCorriente();
		CuentaCorrientePremium premium1 = new CuentaCorrientePremium(50000);
		
		cajaAhorro1.setCliente(pedro);
		cajaAhorro2.setCliente(juan);
		cuentaCorriente.setCliente(juan);
		premium1.setCliente(pedro);
		
		
		CuentaBancaria[] cuentas = new CuentaBancaria[] {cajaAhorro1, cajaAhorro2, cuentaCorriente, premium1};

		//Banco banco = new Banco();
		EmpleadoBanco gerente = new EmpleadoBanco();
		
		gerente.setApellido("Gomez");
		gerente.setNombre("Carlos");
*/	}

}
