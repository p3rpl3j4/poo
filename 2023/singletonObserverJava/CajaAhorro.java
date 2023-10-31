package singletonObserverJava;

public class CajaAhorro extends CuentaBancaria {

	@Override
	public double extraer(Persona persona, double monto) {
		if (monto <= this.getSaldo())
			return super.extraer(persona, monto);
		else 
			return 0;
	}
	
}
