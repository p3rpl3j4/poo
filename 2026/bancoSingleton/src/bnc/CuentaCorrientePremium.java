package bnc;

public class CuentaCorrientePremium extends CuentaCorriente {
	private double creditoLimite;

	public CuentaCorrientePremium(Cliente cliente, double saldo) {
		super(cliente, saldo);
	}

	public CuentaCorrientePremium(Cliente cliente, Empleado oficialDeCuenta, double saldo, double limite) {
		super(cliente, oficialDeCuenta, saldo);
		this.creditoLimite = limite;
	}

	@Override
	public void extraer(double importe) {
		double descubierto;
		/**/
		if (this.obtenerSaldo() > importe) {
			importe -= importe * 0.005;
		}
		if (importe > this.obtenerSaldo())
			if (this.obtenerSaldo() - importe <= creditoLimite) {
				descubierto = importe - this.obtenerSaldo();
				descubierto -= descubierto * 0.002;
				this.setSaldo(descubierto);
			}else
				System.out.println("No se puede realizar la extraccion");
	}
}
