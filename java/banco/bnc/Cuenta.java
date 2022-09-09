package bnc;

public class Cuenta {
	
	private static int numero = 0;
	private int nro = 0;
	private Cliente cliente;
	private Empleado oficialDeCuenta;
	private double saldo;
	
	public int getNro() {
		return nro;
	}
	
	public Cuenta(Cliente cliente, double saldo) {
		super();
		this.cliente = cliente;
		this.saldo = saldo;
		Cuenta.numero +=1;
		this.nro = Cuenta.numero;	
	}

	public Cuenta(Cliente cliente, Empleado oficialDeCuenta, double saldo) {
		super();
		this.cliente = cliente;
		this.oficialDeCuenta = oficialDeCuenta;
		this.saldo = saldo;
		Cuenta.numero +=1;
		this.nro = Cuenta.numero;
	}
	
	public void depositar(double importe) {
		this.saldo += importe;
	}
	
	public void extraer (double importe) {
		if (this.saldo >= importe) {
			this.saldo -=importe;
		}
		else
			System.out.println("No hay saldo");
	}

	public double obtenerSaldo() {
		return saldo;
	}


	public Cliente getCliente() {
		return cliente;
	}

	public Empleado getOficialDeCuenta() {
		return oficialDeCuenta;
	}

	/* La definimos como protected para restringir la cantidad de clases que puedan acceder */
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
