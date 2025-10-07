
public class GestorDeCuenta {

	public GestorDeCuenta() {
		super();
	}

	public void gestionar() throws SosUnSecoException  {
		CuentaBancaria c = new CuentaBancaria (30000);
		
		c.depositar(10000);
		System.out.println("La cuenta tiene: " + c.getSaldo());
		c.extraer(350000);
		
		System.out.println("La cuenta tiene: " + c.getSaldo());
	}
}
