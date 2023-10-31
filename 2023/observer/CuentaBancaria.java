package observer;


public abstract class CuentaBancaria extends Observable{	
	private double saldo;
	private Cliente cliente;
	private EmpleadoBanco oficialCuenta;
	private int numeroCuenta;
	
	private static int generadorNumeroCuenta;
	
	
	public CuentaBancaria() {
		CuentaBancaria.generadorNumeroCuenta++;
		
		this.numeroCuenta = CuentaBancaria.generadorNumeroCuenta;
	}
	
	
	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public EmpleadoBanco getOficialCuenta() {
		return oficialCuenta;
	}

	public void setOficialCuenta(EmpleadoBanco oficialCuenta) {
		this.oficialCuenta = oficialCuenta;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}
  
	public double extraer(Persona persona, double monto) {
		this.saldo -= monto;
		this.cliente.actualizar("Se efectuó EXTRACCION por $" + monto);
		return monto;
	}
	
	public void depositar(double monto) {
		this.saldo += monto;
		this.cliente.actualizar("Sos gardel por $" + monto);
	}
	
}
