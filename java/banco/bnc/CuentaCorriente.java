package bnc;

public class CuentaCorriente extends Cuenta {
	private static final float costoExtraer = 0.005f;
	private static final float depositoInferiorAMonto = 0.002f;
	private static final float depositoSuperiorAMonto = 0.001f;
	
	private static double montoFijo;
	
	
	public CuentaCorriente(Cliente cliente, double saldo) {
		super(cliente, saldo);
		// TODO Auto-generated constructor stub
	}

	public CuentaCorriente(Cliente cliente, Empleado oficialDeCuenta, double saldo) {
		super(cliente, oficialDeCuenta, saldo);
	}

	@Override
	public void depositar(double importe) {
		if (importe < montoFijo)
			importe -= importe * depositoInferiorAMonto;
		else
			importe -= importe * depositoSuperiorAMonto;
		
		super.depositar(importe);
	}

	@Override
	public void extraer(double importe) {
		importe -= importe * costoExtraer;
		super.extraer(importe);
	}
	
	@Override
	protected void setSaldo(double saldo) {
		super.setSaldo(saldo);
	}
}
