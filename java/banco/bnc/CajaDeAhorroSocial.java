package bnc;

public class CajaDeAhorroSocial extends CajaDeAhorro {

	private Cliente [] autorizados = new Cliente[3];
	public CajaDeAhorroSocial(Cliente cliente, Empleado oficialDeCuenta, double saldo) {
		super(cliente, oficialDeCuenta, saldo);
		// TODO Auto-generated constructor stub
	}

	//sobrecargo el extraer heredado
	public void extraer( Cliente c, double importe) {	
		for (Cliente c1 : this.autorizados) {
			if (c1.equals(c)) {
				super.extraer(importe);
			}
			
		}
		super.extraer(importe);
	}

	
}
