package bnc;

public class Banco {
	private String nombre;
	private String dirección;
	private Empleado gerente;
	private Cuenta [] cuentas;
	
	
	public Banco(String nombre) {
		this.nombre = nombre;
	}

	public void imprimirCuentas() {
		System.out.println("Cliente 	|	Numero de cuenta	 | 		Saldo");
		for(Cuenta c :this.cuentas )
			System.out.println(c.getCliente().toString()+ " | "+ c.getNro() + "|"+ c.obtenerSaldo());
	}


	protected void setCuentas(Cuenta[] cuentas) {
		this.cuentas = cuentas;
	}
	
	
}
