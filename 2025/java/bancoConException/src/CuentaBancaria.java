
public class CuentaBancaria {
	private double saldo;

	public CuentaBancaria(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar (double deposito) {
		this.saldo += deposito;
	}
	
	/**
	 * 
	 * @param importe
	 * @throws SosUnSecoException
	 */
	public void extraer (double importe) throws SosUnSecoException {
		if (importe > this.saldo)
			throw new SosUnSecoException ("Mensaje");
		this.saldo -= importe;
	}

	
}
