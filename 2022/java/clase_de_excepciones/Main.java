package clase_de_excepciones;
/**
 * Soy el principal
 * @author lucy
 *
 */
public class Main {

	/**
	 * 
	 * @param args Nada
	 */
	public static void main (String [] args) {
		CuentaBancaria c = new CuentaBancaria (95000);

		System.out.println("Tu saldo es: "+ c.getSaldo());

		c.depositar(3000);
		System.out.println("Tu saldo es: "+ c.getSaldo());

		
		try {
			c.retirar(500000);
		} catch (SosUnSecoException e) {
			System.out.println("No tenes un peso");
			e.printStackTrace();
		}
		
		System.out.println("FFFFFTu saldo es: "+ c.getSaldo());

	}

}
