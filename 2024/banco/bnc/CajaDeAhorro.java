package bnc;

public class CajaDeAhorro extends Cuenta {

	public CajaDeAhorro(Cliente cliente, double saldo) {
		super(cliente, saldo);
	}
	
	public CajaDeAhorro(Cliente cliente, Empleado oficialDeCuenta, double saldo) {
		super(cliente, oficialDeCuenta, saldo);
	}

	@Override
	public void extraer(double importe) throws SosUnSecoException {
		// TODO Auto-generated method stub
		super.extraer(importe);
	}

	@Override
	public void depositar(double importe) throws MeEstasCurrandoException {
		// TODO Auto-generated method stub
		super.depositar(importe);
	}
	
	
	
}
