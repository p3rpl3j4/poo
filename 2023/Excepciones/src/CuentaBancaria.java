import mis_excepciones.SosUnSecoException;

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
	
	public void extrar (double extraccion) throws SosUnSecoException{
		
		if (extraccion > this.saldo){
			throw new SosUnSecoException("Saldo insuficiente");
		}
		
		this.saldo -= extraccion;	
	}
}
