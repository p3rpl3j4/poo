package observer;

public class CuentaCorriente extends CuentaBancaria {

	
	private static double montoImpuestoChequeInferior = 1000;
	
	@Override
	public void depositar(double monto) {

		double porcentaje = 0.002;
		
		if (monto > CuentaCorriente.montoImpuestoChequeInferior)
			porcentaje = 0.001;
		
		monto = monto * (1-porcentaje);
		
		super.depositar(monto);
	}
	
	@Override
	public double extraer(Persona persona, double monto) {
	
		monto = monto + monto * 0.0005;
		
		return super.extraer(persona, monto);
	}
}
