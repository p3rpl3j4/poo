package clase_de_excepciones;

/**
 * Representa una cuenta bancaria
 * @author lucy
 * @version 1.0
 * @since 1-9-2022
 */
public class CuentaBancaria {
	private double saldo;

	/**
	 * Permite instanciar objetos de la clase CuentaBancaria
	 * @param saldo Saldo inicial de la cuenta bancaria
	 */
	public CuentaBancaria(double saldo) {
		super();
		this.setSaldo(saldo);
	}
	

	/**
	 * Permite obtener el saldo de la cuenta bancaria
	 * @return El saldo de la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Permite establecer el saldo de la cuenta
	 * @param saldo Importe a setear
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * Permite acreditar dinero
	 * @param importe Importe a acreditar
	 */
	public void depositar (double importe) {
		this.saldo += importe;
	}
	
	
	/**
	 * Permite extrar dinero de la cuenta
	 * @param importe Importe a retirar
	 * @throws SosUnSecoException Si el importe a retirar es mayor que el saldo
	 */
	public void retirar (double importe) throws SosUnSecoException {
		if (this.saldo < importe) {
			throw new SosUnSecoException("No tenes un mango");
		}
		
		this.saldo = this.saldo - importe;
	}	
}
