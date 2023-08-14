package bnc;

public class CajaDeAhorro extends Cuenta {

	public CajaDeAhorro(Cliente cliente, double saldo) {
		super(cliente, saldo);
	}
	
	public CajaDeAhorro(Cliente cliente, Empleado oficialDeCuenta, double saldo) {
		super(cliente, oficialDeCuenta, saldo);
	}
	
}
