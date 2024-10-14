package bnc;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int n = 5;
		
		System.out.println("Resultado: " + n/0);
		
		/*
		Cliente cliente1 = new Cliente("Lucy");
		
		Cuenta miCuenta = new CajaDeAhorro(cliente1, 1000);
		System.out.println(miCuenta.obtenerSaldo());

		try {
			miCuenta.extraer(100000);
			miCuenta.depositar(10000000);
		} catch (SosUnSecoException e) {
			e.printStackTrace();
			
		} catch (MeEstasCurrandoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();	
		}
		
		
		System.out.println(miCuenta.obtenerSaldo());
		
		
		
		
		*/
		
		
		//Banco banco = new Banco();
		
		
		
		/*
		
		Banco bancoSingleton1 = Banco.getBancoSingleton();
		Banco bancoSingleton2 = Banco.getBancoSingleton();
		
		
		//verifico que siempre retorne la misma UNICA instancia de banco
		System.out.println(bancoSingleton1.hashCode());
		System.out.println(bancoSingleton2.hashCode());
		
		
		Cliente cli1 = new Cliente ("Sebastián");
		Cliente cli2 = new Cliente ("Lautaro");
		Cliente cli3 = new Cliente ("Lucy");
		Cliente cli4 = new Cliente ("Pepe");
		Cliente cli5 = new Cliente ("Augusto");
		
		//las instancio como Cuenta 
		Cuenta cc1 = new CuentaCorriente (cli1, 90700);
		Cuenta cc2 = new CuentaCorriente (cli2, 4000000);
		Cuenta cc3 = new CuentaCorrientePremium (cli3, 1000000);
		Cuenta ca4 = new CajaDeAhorro(cli4, 20);
		Cuenta cas5 = new CajaDeAhorroSocial(cli5, 9000);
		
		//puedo instanciar también subclases
		CuentaCorriente cc5 = new CuentaCorriente (cli4, 40000);
		
		//declaro un arreglo de cuentas y guardo mis cuentas en él
		//observar que guardi objetos de tipo Cuenta y CuentaCorriente
		Cuenta [] cuentas = new Cuenta [] {new Cuenta (new Cliente("Fede"), 5000000), cc1, cc2, cc3, ca4, cas5, cc5};
		
		
		//vinculo el arreglo de cuentas al banco
		bancoSingleton1.setCuentas(cuentas);
		bancoSingleton1.imprimirCuentas();
		
		
		//pruebo depositar y extrear con una cuenta corriente
		System.out.println("Saldo de la cuenta corriente ANTES de depositar: " + cc1.obtenerSaldo());
		cc1.depositar(10000);
		System.out.println("Saldo de la cuenta corriente LUEGO de depositar: " + cc1.obtenerSaldo());
		cc1.extraer(900);
		System.out.println("Saldo de la cuenta corriente LUEGO de extraer: " + cc1.obtenerSaldo());
		
		
		//pruebo depositar y extrear con una caja de ahorro
		System.out.println("Saldo de la caja de ahorro ANTES de depositar: " + ca4.obtenerSaldo());
		ca4.depositar(10000);
		System.out.println("Saldo de la caja de ahorro LUEGO de depositar: " + ca4.obtenerSaldo());
		ca4.extraer(900);
		System.out.println("Saldo de la caja de ahorro LUEGO de extraer: " + ca4.obtenerSaldo());
	*/
	}

}