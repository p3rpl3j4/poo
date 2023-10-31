package singletonObserverJava;

public class Prueba {

	/*public static void main(String[] args) {
		
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

		Banco banco = new Banco();
		EmpleadoBanco gerente = new EmpleadoBanco();
		
		gerente.setApellido("Gomez");
		gerente.setNombre("Carlos");
		
		banco.setNombre("Banco Nacion");
		banco.setGerente(gerente);
		
		banco.setCuentasBancaras(cuentas);
		
		
		for(CuentaBancaria cuenta : cuentas) {
			cuenta.depositar(1000);
		}
		
		for(CuentaBancaria cuenta : cuentas) {
			cuenta.extraer(juan, 200);
		}
		
		
		
		banco.imprimirCuentas();
		
		
		
	}*/
}
