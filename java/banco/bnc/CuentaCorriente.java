package bnc;

public class CuentaCorriente extends Cuenta {
	private static final float pExtraer = 0.005f;
	private static final float pDeposita1 = 0.002f;
	private static final float pDeposita2 = 0.001f;
	
	private static double montoFijo;
	
	public CuentaCorriente(Cliente cliente, Empleado oficialDeCuenta, double saldo) {
		super(cliente, oficialDeCuenta, saldo);
	}

	@Override
	public void depositar(double importe) {
		if (importe < montoFijo)
			importe -= importe * pDeposita1;
		else
			importe -= importe * pDeposita2;
		
		super.depositar(importe);
	}
}
