package singletonObserverJava;

public class CuentaCorrientePremium extends CuentaCorriente {

	private double montoMaximoEnNegativo;
	
	
	public CuentaCorrientePremium(double montoMaximoEnNegativo) {
		this.montoMaximoEnNegativo = montoMaximoEnNegativo;
	}
	
	
	@Override
	public double extraer(Persona persona, double monto) {
	
		if (monto > this.getSaldo() + montoMaximoEnNegativo)
			return 0;
		
		if (monto > this.getSaldo())
			monto += monto *0.02;
		
		return super.extraer(persona, monto);
	}
}
