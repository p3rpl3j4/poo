import mis_excepciones.SosUnSecoException;

public class GestorDeCuenta {


	public GestorDeCuenta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void gestionar() throws SosUnSecoException {
		CuentaBancaria miCuenta = new CuentaBancaria(350000);		
		System.out.println("Tu cuenta tiene: " + miCuenta.getSaldo());
		
		miCuenta.depositar(20000);
		System.out.println("Tu cuenta tiene: " + miCuenta.getSaldo());
	
		miCuenta.extrar(3000000);
	}
}
